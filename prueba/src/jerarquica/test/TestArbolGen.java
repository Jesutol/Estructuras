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
		arbol.insertar("F", "E"); 
		arbol.insertar("H", "E"); 
		
		System.out.println(arbol.jerarquizar("E"));
		System.out.println(arbol.toString());
		
		
	  

	}
}

