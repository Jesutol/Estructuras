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





	public boolean insertarPorPos() {

		boolean exito =false;



		return exito;


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
	public boolean esVacio() {
		return this.raiz==null;
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






	public void vaciar() {
		this.raiz=null;
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

			//comenzamos el recorrido por los hijos de la subraiz
			aux = raiz.getHijoIzquierdo();
			while(aux != null){
				retorno += "\n"+toStringAux(aux);
				aux = aux.getHermanoDerecho();
			}
		}
		return retorno;
	}




}
