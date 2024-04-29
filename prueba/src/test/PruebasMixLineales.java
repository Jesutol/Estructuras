package test;


import lineales.dinamica.*;


public class PruebasMixLineales {

	public static Cola generarOtraCola(Cola c1) {
		Cola salida = new Cola();
		Pila pilaAux = new Pila();



		while (!c1.esVacia()) {
			while (!c1.esVacia() && !c1.obtenerFrente().equals("$")) {
				salida.poner(c1.obtenerFrente());
				pilaAux.apilar(c1.obtenerFrente());
				c1.sacar();
			}

			while (!pilaAux.esVacia()) {
				salida.poner(pilaAux.obtenerTope());
				pilaAux.desapilar();
			}

			if (!c1.esVacia()) {
				salida.poner("$");
				c1.sacar();
			}
		}

		return salida;
	}


	public static void main(String[] args) {

		Cola c1 = new Cola();
		c1.poner("A");
		c1.poner("B");
		c1.poner("$");
		c1.poner("C");
		c1.poner("$");
		c1.poner("D");
		c1.poner("E");
		c1.poner("F");

		Cola c1Clon = c1.clone(); 
		Cola c2 = generarOtraCola(c1);
		System.out.println("Cola original: " + c1Clon.toString());
		System.out.println("Cola mod: " + c2);



	}
}

