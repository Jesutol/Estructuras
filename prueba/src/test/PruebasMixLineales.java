package test;


import lineales.dinamica.*;


public class PruebasMixLineales {

	public static Cola generarOtraCola(Cola c1) {
		Cola salida = new Cola();
		Pila pilaAux = new Pila();
		Cola aux=new Cola();
	



		while (!c1.esVacia()) {
			while (!c1.esVacia() && !c1.obtenerFrente().equals("#")) {
				Object frente=c1.obtenerFrente();
				salida.poner(frente);
				pilaAux.apilar(frente);
				aux.poner(frente);
				c1.sacar();
			}

			while (!pilaAux.esVacia()) {
				salida.poner(pilaAux.obtenerTope());
				pilaAux.desapilar();
			}
			while(!aux.esVacia()) {
				
				salida.poner(aux.obtenerFrente());
				aux.sacar();
			}

			if (!c1.esVacia()) {
				salida.poner("#");
				c1.sacar();
			}
		}

		return salida;
	}


	public static void main(String[] args) {

		Cola c1 = new Cola();
		c1.poner("A");
		c1.poner("B");
		c1.poner("#");
		c1.poner("C");
		c1.poner("#");
		c1.poner("D");
		c1.poner("E");
		c1.poner("F");

		Cola c1Clon = c1.clone(); 
		Cola c2 = generarOtraCola(c1);
		System.out.println("Cola original: " + c1Clon.toString());
		System.out.println("Cola mod: " + c2);



	}
}

