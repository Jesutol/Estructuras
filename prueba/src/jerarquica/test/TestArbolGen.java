package jerarquica.test;
import jerarquica.dinamica.*;
import lineales.dinamica.Lista;
public class TestArbolGen {
	public static void main(String[] args) {
		test();



	}


	public static  void test() {
		ArbolGen arbol = new ArbolGen();


		arbol.insertar("A", "A");  
		arbol.insertar("B", "A");   
		arbol.insertar("C", "A");   
		arbol.insertar("G", "A");  
		arbol.insertar("B", "A");  
		arbol.insertar("D", "B");  
		arbol.insertar("E", "B"); 
		System.out.println(arbol.insertarPorPos("P",7));
		System.out.println(arbol.insertarPorPos("K", 8));
		arbol.insertar("Z", "K");  
		arbol.insertar("W", "K");  
		arbol.insertar("M", "K"); 
		arbol.insertar("N", "K");  
		arbol.insertar("L", "K");  

		System.out.println(arbol.toString());
		
		 Lista lista = new Lista();
	        lista.insertar("A", 1);
	        lista.insertar("B", 2); 
	        lista.insertar("P", 3); 
	        lista.insertar("K", 4);  
	      
	        
	        System.out.println(arbol.elimina("P"));
	        System.out.println(arbol.patron(lista));
	        System.out.println(arbol.masHijos());
	        System.out.println(arbol.elimina("P"));
	        System.out.println(arbol.toString());
	  

	}
}

