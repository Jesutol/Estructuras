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
		arbol.insertar("B", "A");   // Insertar hijo de A
		arbol.insertar("D", "B");   // Insertar hijo de B
		arbol.insertar("E", "B");   // Insertar otro hijo de B

		System.out.println(arbol.insertarPorPos("P",7));
		System.out.println(arbol.insertarPorPos("K", 8));

		System.out.println(arbol.toString());
		
		 Lista lista = new Lista();
	        lista.insertar("A", 1); // Posición 1
	        lista.insertar("B", 2); // Posición 
	        lista.insertar("P", 3); // Posición 1
	        lista.insertar("K", 4); // Posición 
	      
	        
	  
	        System.out.println(arbol.patron(lista));
		

	}
}

