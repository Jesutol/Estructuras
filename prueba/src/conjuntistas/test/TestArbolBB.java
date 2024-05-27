package conjuntistas.test;
import conjuntistas.*;
public class TestArbolBB {
	
	public static void main(String[] args) {
		test();
		
	}
	
	public static  void test() {
		
		
		
		
        ArbolBB arbol = new ArbolBB();

        arbol.insertar(10);  // Nivel 0 (Raíz)
        arbol.insertar(5);   // Nivel 1 (Hijo izquierdo)
        arbol.insertar(15);  // Nivel 1 (Hijo derecho)
        arbol.insertar(3);   // Nivel 2 (Hijo izquierdo del nodo con valor 5)
        arbol.insertar(7);   // Nivel 2 (Hijo derecho del nodo con valor 5)
        arbol.insertar(12);  // Nivel 2 (Hijo izquierdo del nodo con valor 15)
        arbol.insertar(18);  // Nivel 2 (Hijo derecho del nodo con valor 15)
        
        System.out.println(arbol.toString());
        System.out.println(arbol.pertenece(15));

	}

}
