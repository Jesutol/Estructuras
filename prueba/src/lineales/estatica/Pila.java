package lineales.estatica;

public class Pila {
	private int tope;
	private Object[] array;
	private static final int tamanio = 10;

	public Pila() {

		this.array = new Object[this.tamanio];
		this.tope = -1;

	}

	public boolean apilar(Object nuevoEle) {

		boolean exito;

		if (this.tope+1 >= tamanio) {
			exito = false;

		} else {
			this.tope++;
			array[tope] = nuevoEle;
			exito = true;

		}

		return exito;

	}

	public boolean desapilar() {

		boolean exito;

		if (this.tope < 0) {
			exito = false;

		} else {

			array[tope] = null;
			this.tope--;
			exito = true;

		}

		return exito;

	}

	public Object obtenerTope() {
		
		Object aux;
		aux=(tope<0)? null:array[tope];

		return aux;

	}

	public boolean esVacia() {


		return (tope < 0);

		

	}

	public void vaciar() {


		if(!esVacia()) {

			for(int i=tope;i>=0;i--) {

				array[i]=null;




			}
			tope=-1;

		}



	}
	public Pila clone() {

		Pila nuevaPila=new Pila();
		nuevaPila.tope=this.tope;
		nuevaPila.array=this.array.clone();


		return nuevaPila;
	}
	
	public String toString() {
	    String result = "[";
	    for (int i = 0; i <= tope; i++) {
	        result += array[i];
	        if (i < tope) {
	            result += ", ";
	        }
	    }
	    result += "]";
	    return result;
	}


}
