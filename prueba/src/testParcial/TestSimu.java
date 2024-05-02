package testParcial;
import lineales.dinamica.*;
public class TestSimu {

	public static void main(String[] args) {
		testML();
	}


	private static void testML() {
		Lista list=new Lista();
		for(int i=1;i<=10;i++) {

			list.insertar('a', i);
			

		}
		System.out.println(list.toString());
		Lista list2=list.localizarMulti(2);
		System.out.println(list2.toString());

	

		list.insertar('{', 1);
		list.insertar('}', 10);
		list.insertar('[', 3);
		list.insertar(']', 8);
		list.insertar('(', 5);
		list.insertar(')', 7);
		System.out.println(list.toString());
		System.out.println(list.verificaBalanceo());
		


	}
}
