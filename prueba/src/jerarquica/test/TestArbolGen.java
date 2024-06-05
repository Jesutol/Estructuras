package jerarquica.test;
import jerarquica.dinamica.*;
import lineales.dinamica.Lista;
public class TestArbolGen {
	public static void main(String[] args) {
		test();



	}


	public static  void test() {
		ArbolGen arbol = new ArbolGen();


		arbol.insertar("A", "A");  // Insertar raíz
		arbol.insertar("B", "A");   // Insertar hijo de A
		arbol.insertar("C", "A");   // Insertar otro hijo de A
		arbol.insertar("G", "A");   // Insertar otro hijo de A
		arbol.insertar("D", "B");   // Insertar hijo de B
		arbol.insertar("E", "B");   // Insertar otro hijo de B
		arbol.insertar("K", "E");   // Insertar otro hijo de B
		arbol.insertar("F", "C");   // Insertar hijo de C
		arbol.insertar("U", "C");   // Insertar otro hijo de A
		arbol.insertar("W", "U");   // Insertar otro hijo de A
		arbol.insertar("Z", "W");   // Insertar otro hijo de A

		System.out.println(arbol.toString());
		System.out.println("Clon");
		System.out.println(arbol.clone().toString());
		System.out.println(arbol.ancestros("Z").toString());
		System.out.println(arbol.altura());
		System.out.println(arbol.padre("C"));
		System.out.println(arbol.nivel("G"));
		System.out.println(arbol.listarPreorden().toString());
		System.out.println(arbol.listarInorden().toString());
		System.out.println(arbol.listarPosorden().toString());
		System.out.println(arbol.listarNiveles().toString());
		System.out.println(arbol.listarEntreNiveles(2, 2).toString());
		 Lista lista = new Lista();
	        lista.insertar("A", 1); // Posición 1
	        lista.insertar("B", 2); // Posición 
	        lista.insertar("B", 3); // Posición
	      
	        
	  
	        System.out.println(arbol.patron(lista));
		

	}
}

