package testParcial;
import lineales.dinamica.*;
public class TestSimu {
	
	public static void main(String[] args) {
		testML();
	}

	
	private static void testML() {
		Lista list=new Lista();
		for(int i=1;i<=10;i++) {
			
			list.insertar(i, i);
			list.insertar(2, 2);
			
		}
		System.out.println(list.toString());
		Lista list2=list.localizarMulti(3);
		System.out.println(list2.toString());
		
		list.eliminaA(2);
		System.out.println(list.toString());
		
		
		
		
	}
}
