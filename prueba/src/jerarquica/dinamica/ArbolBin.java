package jerarquica.dinamica;

public class ArbolBin {
	private NodoArbol raiz;

	public ArbolBin() {
		this.raiz = null;
	}

	public boolean insertar(Object elemento, Object elementoPadre, char lugar) {
		boolean exito = true;

		if (this.raiz == null) {
			// Si el árbol está vacío, el elemento insertado será la raíz
			this.raiz = new NodoArbol(elemento,null,null);
		} else {
			NodoArbol nodoPadre = obtenerNodo(this.raiz, elementoPadre);
			if (nodoPadre != null) {
				if (lugar == 'I' && nodoPadre.getIzq() == null) {
					nodoPadre.setIzq(new NodoArbol(elemento,null,null));
				} else if (lugar == 'D' && nodoPadre.getDer() == null) {
					nodoPadre.setDer(new NodoArbol(elemento,null,null));
				} else {
					exito = false; // Lugar inválido o nodo hijo ya existe
				}
			} else {
				exito = false; // No se encontró el nodo padre
			}
		}

		return exito;
	}



	private NodoArbol obtenerNodo(NodoArbol n ,Object buscado) {
		NodoArbol resultado=null;


		if(n!=null) {

			if(n.getElemen().equals(buscado)) {
				resultado=n;
			}else {

				resultado=obtenerNodo(n.getIzq(), buscado);

				if(resultado==null) {
					resultado=obtenerNodo(n.getDer(), buscado);


				}
			}



		}




		return resultado;
	}

	public boolean esVacio() {
		return this.raiz==null;

	}

	public int nivel(Object unElemento) {
		int unNivel=-1;
		if(!esVacio()) {

			unNivel=nivelAux(this.raiz,unElemento);
		}


		return unNivel;



	}

	private int nivelAux(NodoArbol n, Object unElemento) {
		int nivel=-1;
		int auxI ,auxD;

		if((n.getElemen().equals(unElemento))) {
			nivel=0;

		} else {

			if(n.getIzq()!=null){
				auxI=nivelAux(n.getIzq(), unElemento);
				if(auxI>-1) {
					nivel=auxI+1;

				}

			}
			if(n.getDer()!=null&& nivel==-1) {
				auxD=nivelAux(n.getDer(), unElemento);

				if(auxD>-1) {
					nivel=auxD+1;

				}

			}





		}

		return nivel;

	}




	public Object Padre(Object buscado) {

		Object padreE=null;
		if(!esVacio()) {
			if(!this.raiz.getElemen().equals(buscado)){
				padreE=padreAux(this.raiz,buscado);
			}
		}
		return padreE;




	}

	private Object padreAux(NodoArbol n,Object buscado) {

		Object padre=null;



		if(n.getIzq()!=null) {
			if(n.getIzq().getElemen().equals(buscado)){
				padre=n.getElemen();

			}else {
				padre=padreAux(n.getIzq(), buscado);

			}



		} if(n.getDer()!=null&&padre==null) {
			if(n.getDer().getElemen().equals(buscado)){
				padre=n.getElemen();

			}else {
				padre=padreAux(n.getDer(), buscado);

			}


		}


		return padre;

	}



	public int altura() {
		int altura=-1;
		if(!esVacio()) {
			altura=auxAltura(this.raiz);
		}
		return altura;

	}
	private int auxAltura(NodoArbol n){
		int altura=-1;
		int izq,der;

		if(n!=null) {
			izq=auxAltura(n.getIzq());
			der=auxAltura(n.getDer());
			altura=Math.max(izq, der)+1;


		} 

		return altura;
	}


	public void vaciar() {
		this.raiz=null;
	}


	public ArbolBin clone() {
		ArbolBin arbolC=new ArbolBin();
		if(!esVacio()) {

			NodoArbol raizC=new NodoArbol(raiz.getElemen(),null,null);

			arbolC.raiz=raizC;
			auxClone(this.raiz,raizC);


		}
		return arbolC;


	}
	private void auxClone(NodoArbol aux, NodoArbol copia) {
		NodoArbol temp;


		if(aux.getIzq()!=null) {
			temp=new NodoArbol(aux.getIzq().getElemen(),null,null);
			copia.setIzq(temp);
			auxClone(aux.getIzq(),copia.getIzq());



		}
		if(aux.getDer()!=null) {
			temp=new NodoArbol(aux.getDer().getElemen(),null,null);
			copia.setDer(temp);
			auxClone(aux.getDer(),copia.getDer());




		}
	}




	public String toString(){
		
	String nuevaC="wwwwwwwwwwwwwwwwwwwwwwwww";
	
	return nuevaC;	
		
		
	}



}


