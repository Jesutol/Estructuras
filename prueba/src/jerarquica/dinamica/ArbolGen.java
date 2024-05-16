package jerarquica.dinamica;

public class ArbolGen {

	private NodoGen raiz;

	ArbolGen(){

		raiz=null;


	}
	public boolean insertar(Object elemNuevo,Object elemPadre) {

		boolean exito =false;
		
		
		
		




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











}
