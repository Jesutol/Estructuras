package jerarquica.dinamica;
import lineales.dinamica.*;
public class ArbolGen {

	private NodoGen raiz;

	public ArbolGen(){

		raiz=null;


	}
	public boolean insertar(Object elemNuevo, Object elemPadre) {
		boolean exito = false;
		if (this.raiz == null) {
			NodoGen nuevo = new NodoGen(elemNuevo, null, null);
			this.raiz = nuevo;
			exito = true;
		} else {
			NodoGen aux = buscaNodo(this.raiz, elemPadre);
			if (aux != null) {
				if (aux.getHijoIzquierdo() == null) {
					NodoGen nuevo = new NodoGen(elemNuevo, null, null);
					aux.setHijoIzquierdo(nuevo);
					exito = true;
				} else {
					aux = aux.getHijoIzquierdo();
					while (aux.getHermanoDerecho() != null) {
						aux = aux.getHermanoDerecho();
					}
					
					NodoGen nuevo = new NodoGen(elemNuevo, null, null);
					aux.setHermanoDerecho(nuevo);
					exito = true;
				}
			}
		}
		return exito;
	}


	private NodoGen buscaNodo(NodoGen n,Object elem) {

		NodoGen encontro=null;

		if(n!=null) {

			if(n.getElem().equals(elem)) {

				encontro=n;

			}else {
				NodoGen hijo =n.getHijoIzquierdo();
				while(hijo!=null&&encontro==null){
					encontro=buscaNodo(hijo, elem);
					hijo=hijo.getHermanoDerecho();


				}

			}

		}
		return encontro;
	}




	public boolean insertarPorPos(Object elem, int posPadre) {
        boolean exito= false;

        if (!esVacio()) {
            int[] contador = {1};
            exito = auxInsertarPorPos(this.raiz, elem, contador, posPadre);
        }else {
        	
        	this.raiz= new NodoGen(elem, null, null);
        }

        return exito;
    }

    private boolean auxInsertarPorPos(NodoGen n, Object elem, int[] contador, int posPadre) {
      boolean exito = false;

        if (n != null) {
            if (contador[0] == posPadre) {
            	 auxInsertarPorPos2(n, elem);
                exito = true;
            } else {
                NodoGen hijo = n.getHijoIzquierdo();
               
                while (hijo != null &&!exito) {
                	 contador[0]++;
                    exito = auxInsertarPorPos(hijo, elem, contador, posPadre);
                    hijo = hijo.getHermanoDerecho();
                    
                }
              
            }
        }

        return exito;
    }
    private  void auxInsertarPorPos2(NodoGen aux,Object elemNuevo) {
    	
    	if (aux != null) {
			if (aux.getHijoIzquierdo() == null) {
				NodoGen nuevo = new NodoGen(elemNuevo, null, null);
				aux.setHijoIzquierdo(nuevo);
			
			} else {
				aux = aux.getHijoIzquierdo();
				while (aux.getHermanoDerecho() != null) {
					aux = aux.getHermanoDerecho();
				}
				
				NodoGen nuevo = new NodoGen(elemNuevo, null, null);
				aux.setHermanoDerecho(nuevo);
			
			}
		}
	

}
    

  


	public boolean pertenece(Object elem) {
		boolean encontro=false;

		if(!esVacio()) {

			encontro=auxPertenece(this.raiz, elem);
		}
		return encontro;
	}


	private boolean auxPertenece(NodoGen n,Object elem) {

		boolean encontro=false;

		if(n!=null) {

			if(n.getElem().equals(elem)) {

				encontro=true;

			}else {
				NodoGen hijo =n.getHijoIzquierdo();
				while(hijo!=null&&!encontro){
					encontro=auxPertenece(hijo, elem);
					hijo=hijo.getHermanoDerecho();


				}

			}

		}
		return encontro;
	}
	public boolean esVacio() {
		return this.raiz==null;
	}
	public Object padre(Object elem) {
		Object ePadre=null;
		if(!esVacio()&&!this.raiz.equals(elem)) {




			ePadre=auxPadre(raiz, elem);
		}


		return ePadre;


	}

	private Object auxPadre(NodoGen n, Object elem) {
		Object encontroP = null;

		if (n != null) {
			NodoGen hijo = n.getHijoIzquierdo();

			while (hijo != null && encontroP == null) {

				if (hijo.getElem().equals(elem)) {
					encontroP = n.getElem();
				} else {

					encontroP = auxPadre(hijo, elem);
				}

				hijo = hijo.getHermanoDerecho();
			}
		}

		return encontroP;
	}
	public int altura() {

		int i=-1;

		if(!esVacio()) {
			i=auxAltura(this.raiz);

		}
		return i;
	}

	private int auxAltura(NodoGen n) {
		int altura = -1;
		if (n != null) {
			altura = 0;
			NodoGen hijo = n.getHijoIzquierdo();
			while (hijo != null) {
				int alturaHijo = auxAltura(hijo);
				if (alturaHijo+1  > altura) {
					altura = alturaHijo + 1;
				}
				hijo = hijo.getHermanoDerecho();
			}
		}
		return altura;
	}
	public int nivel(Object elem) {
		int encontro=-1;

		if(!esVacio()) {

			encontro=auxNivel(this.raiz, elem);
		}
		return encontro;
	}

	private int auxNivel(NodoGen n,Object elem) {

		int nivel=-1;
		int aux=-1 ;

		if(n!=null) {

			if(n.getElem().equals(elem)) {

				nivel=0;

			}else {
				NodoGen hijo =n.getHijoIzquierdo();
				while(hijo!=null&&aux<=-1){
					aux=auxNivel(hijo, elem);
					hijo=hijo.getHermanoDerecho();


				}

				if(aux>-1) {
					nivel=aux+1;


				}

			}

		}
		return nivel;
	}







	public Lista ancestros(Object elem) {
		Lista list=new Lista();
		if(!esVacio()) {

			auxA(raiz, elem, list);
		}


		return list;


	}

	private boolean auxA(NodoGen n, Object elem, Lista list) {
		boolean encontro = false;

		if (n != null) {
			if (n.getElem().equals(elem)) {

				encontro = true;
			} else {
				NodoGen hijo = n.getHijoIzquierdo();
				while (hijo != null && !encontro) {
					encontro = auxA(hijo, elem, list);

					hijo = hijo.getHermanoDerecho();

				}

				if (encontro) {
					list.insertar(n.getElem(), 1);
				}
			}
		}

		return encontro;
	}

	public ArbolGen clone() {
		ArbolGen arbolC=new ArbolGen();
		if(!esVacio()) {
			NodoGen nuevoR=new NodoGen(this.raiz.getElem(),null,null);
			arbolC.raiz=nuevoR;
			auxClone(this.raiz,arbolC.raiz);

		}


		return arbolC;

	}
	private void auxClone(NodoGen n, NodoGen arbolC) {


		if(n!=null) {


			NodoGen hijo = n.getHijoIzquierdo();
			if (hijo != null) {
				NodoGen nuevoHijo = new NodoGen(hijo.getElem(), null, null);
				arbolC.setHijoIzquierdo(nuevoHijo);
				auxClone(hijo, nuevoHijo); 


				hijo = hijo.getHermanoDerecho();
				arbolC = arbolC.getHijoIzquierdo();
				while (hijo != null) {
					NodoGen nuevoHermano = new NodoGen(hijo.getElem(), null, null);
					arbolC.setHermanoDerecho(nuevoHermano);
					auxClone(hijo, nuevoHermano); 
					arbolC = nuevoHermano;
					hijo = hijo.getHermanoDerecho();
				}
			}
		}
	}










	public void vaciar() {
		this.raiz=null;
	}
	public Lista listarPreorden() {
		Lista salida = new Lista();
		listarPreordenAux(this.raiz, salida);
		return salida;
	}

	private void listarPreordenAux(NodoGen n, Lista ls) {
		if (n != null) {
			// Visita del nodo n
			ls.insertar(n.getElem(), ls.longitud() + 1);

			// Llamados recursivos con los hijos de n
			NodoGen hijo = n.getHijoIzquierdo();
			while (hijo != null) {
				listarPreordenAux(hijo, ls);
				hijo = hijo.getHermanoDerecho();
			}
		}
	}
	public Lista listarInorden() {
		Lista salida = new Lista();
		listarInordenAux(this.raiz, salida);
		return salida;
	}

	private void listarInordenAux(NodoGen n, Lista ls) {
		if (n != null) {
			// Llamado recursivo con el primer hijo de n
			if (n.getHijoIzquierdo() != null) {
				listarInordenAux(n.getHijoIzquierdo(), ls);
			}

			// Visita del nodo n
			ls.insertar(n.getElem(), ls.longitud() + 1);

			// Llamados recursivos con los otros hijos de n
			if (n.getHijoIzquierdo() != null) {
				NodoGen hijo = n.getHijoIzquierdo().getHermanoDerecho();
				while (hijo != null) {
					listarInordenAux(hijo, ls);
					hijo = hijo.getHermanoDerecho();
				}
			}
		}
	}

	public Lista listarPosorden() {
		Lista salida = new Lista();
		listarPosordenAux(this.raiz, salida);
		return salida;
	}

	private void listarPosordenAux(NodoGen n, Lista ls) {
		if (n != null) {
			// Llamados recursivos con los hijos de n
			NodoGen hijo = n.getHijoIzquierdo();
			while (hijo != null) {
				listarPosordenAux(hijo, ls);
				hijo = hijo.getHermanoDerecho();
			}

			// Visita del nodo n
			ls.insertar(n.getElem(), ls.longitud() + 1);
		}
	}



	public Lista listarNiveles(){
		//vamos a usar una cola para iterar
		Lista retorno = new Lista();
		Cola q = new Cola();
		q.poner(this.raiz);

		while(!q.esVacia()){
			NodoGen aux = (NodoGen) q.obtenerFrente();
			q.sacar();
			retorno.insertar(aux.getElem(), retorno.longitud() + 1);
			aux = aux.getHijoIzquierdo();
			while(aux != null){
				q.poner(aux);
				aux = aux.getHermanoDerecho();
			}
		}
		return retorno;
	}
	public Lista listarEntreNiveles(int min , int max){
		//vamos a usar una cola para iterar
		Lista retorno = new Lista();
		Cola q = new Cola();
		Cola niveles=new Cola();

		niveles.poner(0);
		q.poner(this.raiz);

		while(!q.esVacia()){
			NodoGen aux = (NodoGen) q.obtenerFrente();
			int nivelActual=(int) niveles.obtenerFrente();
			q.sacar();
			niveles.sacar();

			if(min<=nivelActual&&max>=nivelActual) {
				retorno.insertar(aux.getElem(), retorno.longitud() + 1);
			}


			if(nivelActual<max) {
				aux = aux.getHijoIzquierdo();
				while(aux != null){
					q.poner(aux);
					niveles.poner(nivelActual+1);
					aux = aux.getHermanoDerecho();


				}
			}
		}
		return retorno;
	}
	   public boolean patron(Lista list) {
	        boolean encontro = false;

	        if (!esVacio() && list.longitud() > 0) {
	            encontro = auxPatron(this.raiz, list, 1);
	        }

	        return encontro;
	    }

	    private boolean auxPatron(NodoGen n, Lista list, int i) {
	        boolean encontro = false;

	        if (n != null) {
	            if (n.getElem().equals(list.recuperar(i))) {
	                if (i == list.longitud()) {
	                    encontro = true; 
	                } else {
	                    NodoGen hijo = n.getHijoIzquierdo();
	                    while (hijo != null && !encontro) {
	                        encontro = auxPatron(hijo, list, i + 1);
	                        hijo = hijo.getHermanoDerecho();
	                    }
	                }
	            }

	           
	        }

	        return encontro;
	    }







	public String toString(){
		return toStringAux(this.raiz);
	}

	private String toStringAux(NodoGen raiz){
		String retorno = "";
		if(raiz != null){
			//visitamos el nodo n
			retorno += raiz.getElem().toString()+"->";
			NodoGen aux = raiz.getHijoIzquierdo();
			while(aux != null){
				retorno += aux.getElem().toString()+",";
				aux = aux.getHermanoDerecho();
			}


			aux = raiz.getHijoIzquierdo();
			while(aux != null){
				retorno += "\n"+toStringAux(aux);
				aux = aux.getHermanoDerecho();
			}
		}
		return retorno;
	}




}
