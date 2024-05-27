package conjuntistas;


import lineales.dinamica.Lista;

public class ArbolBB {

	private NodoABB raiz;

	public ArbolBB() {

		this.raiz=null;
	}


	public boolean insertar(Comparable elem) {
		boolean exito=true;

		if(this.raiz==null) {

			this.raiz=new NodoABB(elem,null,null);

		}else {

			exito=auxInsertar(this.raiz,elem);
		}

		return exito;




	}

	private boolean auxInsertar(NodoABB n,Comparable elem) {

		boolean exito=true;

		if(elem.compareTo(n.getElem())==0) {

			exito=false;
		}else if(elem.compareTo(n.getElem())<0) {

			if(n.getHijoIzq()!=null) {
				exito=auxInsertar(n.getHijoIzq(), elem);

			}else {

				n.setHijoIzq(new NodoABB(elem,null,null));
			}
		}else {

			if(n.getHijoDer()!=null) {
				exito=auxInsertar(n.getHijoDer(), elem);

			}else {

				n.setHijoDer(new NodoABB(elem,null,null));
			}



		}
		return exito;
	}
	public boolean pertenece(Comparable elem) {
		boolean exito=false;

		if(!esVacio()) {
			
			exito=auxPertenece(this.raiz,elem);
		}

		return exito;




	}

	private boolean auxPertenece(NodoABB n,Comparable elem) {

		boolean exito=false;

		if(elem.compareTo(n.getElem())==0) {

			exito=true;
		}else if(elem.compareTo(n.getElem())<0) {

			if((n.getHijoIzq()!=null)&&!exito) {
				exito=auxPertenece(n.getHijoIzq(), elem);

			}
		}else {

			if((n.getHijoDer()!=null)&&!exito) {
				exito=auxPertenece(n.getHijoDer(), elem);

			}



		}
		return exito;
	}
	public boolean eliminar(Comparable elem) {
		boolean exito=false;
		return exito;
		
		
	}

	public boolean esVacio() {

		return this.raiz==null;
	}
	public void vaciar() {

		this.raiz=null;
	}
	public ArbolBB clone() {
		ArbolBB arbolC=new ArbolBB();
		if(!esVacio()) {

			NodoABB raizC=new NodoABB(raiz.getElem(),null,null);

			arbolC.raiz=raizC;
			auxClone(this.raiz,raizC);


		}
		return arbolC;


	}
	private void auxClone(NodoABB aux, NodoABB copia) {
		NodoABB temp;


		if(aux.getHijoIzq()!=null) {
			temp=new NodoABB(aux.getHijoIzq().getElem(),null,null);
			copia.setHijoIzq(temp);
			auxClone(aux.getHijoIzq(),copia.getHijoIzq());



		}
		if(aux.getHijoDer()!=null) {
			temp=new NodoABB(aux.getHijoDer().getElem(),null,null);
			copia.setHijoDer(temp);
			auxClone(aux.getHijoDer(),copia.getHijoDer());




		}
	}





	public String toString(){
		//retornamos un string 
		String retorno = "Arbol vacio";

		if(this.raiz != null){
			retorno = auxToString(this.raiz);
		}

		return retorno;
	}


	private String auxToString(NodoABB raiz){
		String retorno = "";
		if(raiz != null){
			retorno = raiz.getElem().toString()+":";

			//obtenemos los hijos de este sub arbol
			NodoABB izquierdo = raiz.getHijoIzq();
			NodoABB derecho = raiz.getHijoDer();
			//concatenamos lo que contengan esos hijos
			if( izquierdo != null){
				retorno = retorno + " HI:"+izquierdo.getElem().toString();
			}else{
				retorno = retorno + " HI:-";
			}

			if( derecho != null){
				retorno = retorno + " HD:"+derecho.getElem().toString();
			}else{
				retorno = retorno + " HD:-";
			}
			//creamos el salto de linea para darle formato
			retorno = retorno + "\n";
			//y relizamos algun recorrido de arbol
			if(izquierdo != null){
				retorno = retorno + auxToString(izquierdo);
			}

			if(derecho != null){
				retorno = retorno + auxToString(derecho);
			}
		}
		//retornamos dicho string generado
		return retorno;
	}



}
