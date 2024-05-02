package lineales.dinamica;

public class Lista {

	private Nodo cabecera;


	public Lista(){
		this.cabecera=null;			
	}





	public boolean insertar(Object unElemento, int pos) {
		boolean exito=true;

		if(pos<1||pos>longitud()+1) {
			exito=false;
		}else {

			if(pos==1) {

				this.cabecera=new Nodo(unElemento,this.cabecera);
			}else {
				Nodo aux=this.cabecera;
				int i=1;
				while(i<pos-1) {
					aux=aux.getEnlace();
					i++;

				}

				Nodo nuevo=new Nodo(unElemento,aux.getEnlace());
				aux.setEnlace(nuevo);



			}



		}

		return exito;

	}

	public boolean eliminar(int pos) {

		boolean exito;


		if((pos<1||pos>longitud())) {
			exito=false;
		}else {

			if(pos==1) {

				this.cabecera=this.cabecera.getEnlace();
				exito=true;
			}else {
				Nodo aux=this.cabecera;
				int i=1;
				while(i<pos-1) {
					aux=aux.getEnlace();
					i++;

				}


				aux.setEnlace(aux.getEnlace().getEnlace());
				exito=true;



			}



		}

		return exito;

	}
	public  int localizar(Object unElemento) {

		int i=1;
		int pos=-1;
		Nodo aux=this.cabecera;

		if(!esVacia()) {

			while((i<=longitud())&&pos==-1) {


				if(aux.getElemen()==unElemento) {
					pos=i;

				}else {

					aux=aux.getEnlace();
					i++;




				}

			}
		}
		return pos;



	}






	public Object recuperar(int pos) {

		int i=1;

		Object elemento;
		elemento=null;
		Nodo aux= this.cabecera;

		if(!esVacia()) {

			if(pos<1||pos>longitud()) {
				elemento=null;
			}else {

				while(i<pos){


					aux=aux.getEnlace();
					i++;


				}
				if(aux!=null)
					elemento=aux.getElemen();


			}
		}

		return elemento;
	}












	public void vaciar() {

		this.cabecera=null;



	}







	public int longitud() {

		int n=0;
		Nodo aux=this.cabecera;

		if(!esVacia()){

			while(aux!=null) {
				aux=aux.getEnlace();
				n++;

			}



		}




		return n;


	}




	public boolean esVacia() {

		return this.cabecera==null;

	}



	public Lista clone() {
		Lista clon=new Lista();
		if(!esVacia()) {

			Nodo ultimoC=new  Nodo(cabecera.getElemen(),null);
			clon.cabecera=ultimoC;
			Nodo aux=this.cabecera;
			aux=aux.getEnlace();
			while(aux!=null) {   

				Nodo nuevo=new Nodo(aux.getElemen(),null);
				ultimoC.setEnlace(nuevo);
				ultimoC=nuevo;
				aux=aux.getEnlace();




			}



		}






		return clon;
	}


	@Override
	public String toString() {
		String s = "[";

		Nodo aux = this.cabecera;


		if (aux != null) {
			while (aux != null) {
				s += aux.getElemen();
				aux = aux.getEnlace();
				if (aux != null)
					s += ",";
			}
		}

		s += "]";

		return s;
	}

	public  Lista localizarMulti(int unElemento) {

		int i=1;
		Lista mul=new Lista();
		Nodo aux=this.cabecera;
		Nodo aux2=null;

		if(!esVacia()) {

			while((i<=longitud())) {


				if(i%unElemento==0) {

					if(mul.cabecera==null) {
						mul.cabecera=new Nodo(aux.getElemen(),null);
						aux2=mul.cabecera;


					}else{

						Nodo nuevo=new Nodo(aux.getElemen(),null);
						aux2.setEnlace(nuevo);
						aux2=nuevo;
					}
					i++;
					aux=aux.getEnlace();



				}else {

					aux=aux.getEnlace();
					i++;




				}

			}
		}
		return mul;



	}
	public void eliminaA(Object unE) {
	    Nodo aux = this.cabecera;
	    Nodo previo = null;

	    while (aux != null) {
	        if (aux.getElemen().equals(unE)) {
	            if (previo == null) { 
	                this.cabecera = aux.getEnlace();
	            } else {
	                previo.setEnlace(aux.getEnlace());
	            }
	        } else {
	            previo = aux; 
	        }
	        aux = aux.getEnlace(); 
	    }
	}




}

