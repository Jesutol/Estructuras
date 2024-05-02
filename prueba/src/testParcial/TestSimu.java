package testParcial;
import lineales.dinamica.*;
import jerarquica.dinamica.*;
public class TestSimu {
	static String sOk = "OK!", sErr = "ERROR";
	public static void main(String[] args) {
		testML();
	}


	private static void testML() {
		Lista list=new Lista();
		for(int i=1;i<=3;i++) {

			list.insertar(i, i);
			

		}
		
		ArbolBin A1 = new ArbolBin();
		System.out.println("Instanciamos el arbol, se llama A1");
		System.out.println("Insertamos: A como raiz: \t\t\t\t\t"+(A1.insertar(1, 1, 'D') ? sOk : sErr));
		//nivel 2
		System.out.println("Insertamos B como HI de A: espera OK!\t\t\t\t"+(A1.insertar(2, 1, 'I') ? sOk: sErr));
		System.out.println("Insertamos B como HI de A: espera OK!\t\t\t\t"+(A1.insertar(3, 2, 'D') ? sOk: sErr));
		System.out.println("Insertamos B como HI de A: espera OK!\t\t\t\t"+(A1.insertar(4, 3, 'D') ? sOk: sErr));
		
	
		
		
		System.out.println("Insertamos E como HI de C: espera OK!\t\t\t\t"+(A1.insertar(2, 1 , 'D') ? sOk: sErr));
		System.out.println("Insertamos E como HI de C: espera OK!\t\t\t\t"+(A1.insertar(6, 2 , 'I') ? sOk: sErr));
		System.out.println("Insertamos E como HI de C: espera OK!\t\t\t\t"+(A1.insertar(8, 2 , 'D') ? sOk: sErr));
		System.out.println(A1.toString());
		System.out.println(list.toString());
		System.out.println(A1.verificarPatron(list));


	




	}
}
