package test;

import lineales.estatica.*;
import java.util.Scanner;

import lineales.estatica.*;
public class test {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Pila p=new Pila();
		Pila pilaClon = null;
		
		int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Apilar elemento");
            System.out.println("2. Desapilar elemento");
            System.out.println("3. Mostrar tope de la pila");
            System.out.println("4. Mostrar si la pila está vacía");
            System.out.println("5. Vaciar la pila");
            System.out.println("6. Clonar la pila");
            System.out.println("7. Mostrar datos (solo toString )");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a apilar: ");
                    int elementoApilar = scanner.nextInt();
                    p.apilar(elementoApilar);
                    break;
                case 2:
                    p.desapilar();
                    break;
                case 3:
                    System.out.println("Tope de la pila: " + p.obtenerTope());
                    break;
                case 4:
                    System.out.println("La pila está vacía: " + p.esVacia());
                    break;
                case 5:
                    p.vaciar();
                    System.out.println("La pila ha sido vaciada.");
                    break;
                case 6:
                    pilaClon = (Pila) p.clone();
                    System.out.println("Se ha clonado la pila.");
                    System.out.println(pilaClon.toString());
                    break;
                case 7:
                	System.out.println(p.toString());
                    
                    break;
                case 8:
                	System.out.println("Saliendo del programa...");
                    
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 8);
        
		
	}
	
	

}
