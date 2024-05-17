package jerarquica.dinamica;
import lineales.dinamica.*;
public class ArbolGen {

	private NodoGen raiz;

	ArbolGen(){

		raiz=null;


	}
	public boolean insertar(Object elemNuevo,Object elemPadre) {

		boolean exito =false;
		if(this.raiz==null) {

			NodoGen nuevo=new NodoGen(elemNuevo, null, null);
			this.raiz=nuevo;
			exito=true;

		}else {

			NodoGen aux=buscaNodo(this.raiz, elemPadre);


			if(aux!=null) {

				if(aux.getHijoIzquierdo()==null) {
					NodoGen nuevo=new NodoGen(elemNuevo, null, null);
					aux.setHijoIzquierdo(nuevo);
					exito=true;


				}else {

					aux=aux.getHijoIzquierdo();

					while (aux.getHermanoDerecho()!=null) {

						aux=aux.getHermanoDerecho();

					}
					NodoGen nuevo=new NodoGen(elemNuevo, null, null);
					aux.setHijoIzquierdo(nuevo);
					exito=true;
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

	public boolean esVacio() {
		return this.raiz==null;
	}

	public Lista ancestros() {
		Lista list=new Lista();


		return list;


	}
	
	private Lista auxA(NodoGen n, Object elem) {
		
		Lista list=new Lista();
		
		return list;
		
		
	}


	public void vaciar() {
		this.raiz=null;
	}














}
