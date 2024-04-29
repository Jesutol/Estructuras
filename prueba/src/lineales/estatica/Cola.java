package lineales.estatica;

public class Cola {

	private Object[] array;
	private int inicio;
	private int fin;
	private static final int tamanio = 10;

	public Cola() {
		array = new Object[tamanio];
		this.inicio = 0;
		this.fin = 0;

	}

	public boolean poner(Object nuevoElemento) {

		boolean exito = false;

		if((fin+1)%tamanio!=inicio) {
			array[fin]=nuevoElemento;
			this.fin=(fin+1)%tamanio;
			exito=true;






		}

		return exito;
	}


	public boolean sacar() {

		boolean exito=true;

		if(esVacia()) {
			exito=false;

		}else {

			array[this.inicio]=null;
			this.inicio=(this.inicio+1)%tamanio;


		}




		return exito;

	}

	public Object obtenerInicio() {


		return (esVacia())? null:array[this.inicio];
	}





	public boolean esVacia()
	{

		return inicio==fin;
	}

	public void vaciar() {


		if(!esVacia()) {

			for(int i=inicio;i<fin;i++) {

				array[i]=null;




			}
			inicio=0;
			fin=0;

		}



	}
	
	public Cola clone() {
	    Cola colaC = new Cola();
	    colaC.inicio = this.inicio;
	    colaC.fin = this.fin;
	    colaC.array = this.array.clone();
	    
	    return colaC;
	}

	
	public String toString() {
	    String result = "[";
	    for (int i = inicio; i <fin; i++) {
	        result += array[i];
	        if(i+1<fin) {
	        	result+=",";
	        }
	       
	    }
	    result += "]";
	    return result;
	}
	public boolean equals(Object obj) {
		boolean igual=true;
	    if (this == obj) {
	        igual= true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	    	igual=  false;
	    }
	    Cola otraCola = (Cola) obj;
	    if (fin - inicio != otraCola.fin - otraCola.inicio) {
	    	igual= false;
	    }
	    for (int i = inicio, j = otraCola.inicio; i < fin; i++, j++) {
	        if (!array[i].equals(otraCola.array[j])) {
	        	igual=  false;
	        }
	    }
	   
	    
	    return igual;
	}
	 


}
