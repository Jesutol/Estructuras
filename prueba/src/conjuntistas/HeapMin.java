package conjuntistas;

public class HeapMin {
	private Comparable[] heap;
	private int ultimo;
	private int tamanio=20;
	
	
	
	public HeapMin() {
		
		this.heap=new Comparable[tamanio];
		this.ultimo=0;
		
		
	}
}
