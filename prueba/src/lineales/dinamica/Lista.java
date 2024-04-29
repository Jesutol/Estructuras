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

				this.cabecera=new Nodo(this.cabecera.getElemen(),this.cabecera);
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


		if((pos<1||pos>longitud()+1)) {
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
			Nodo aux= this.cabecera;
			if(pos<1||pos>longitud()+1) {
				elemento=-1;
			}else {

				while(i<pos){


					aux=aux.getEnlace();
					i++;


				}
				elemento=aux.getElemen();


			}
			return elemento;
		}












		public void vaciar() {

			this.cabecera=null;



		}







		public int longitud() {
			
			int n=0;
			Nodo aux=cabecera;
			
			if(!esVacia()){
				
				while(aux!=null) {}
				
				aux=aux.getEnlace();
				n++;
				
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



	}
	
