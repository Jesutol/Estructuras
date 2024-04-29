

package test;
import lineales.dinamica.*;

public class Test2 {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Cola c1 = new Cola();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Prueba encolar y desencolar");
        System.out.println("Encola 1 espera TRUE y [1]: " + (c1.poner(1)));
        System.out.println(c1.toString());
        System.out.println("Encola 2 espera TRUE y [1, 2]: " + (c1.poner(2)));
        System.out.println(c1.toString() + "\n");
        System.out.println("Encola 3 espera TRUE y [1, 2, 3]: " + (c1.poner(3)));
        System.out.println(c1.toString() + "\n");
        System.out.println("Frente=1 espera TRUE: ");
        System.out.println((int)c1.obtenerFrente()==1);
        System.out.println("Desencola espera TRUE y [2, 3]: " + (c1.sacar()));
        System.out.println(c1.toString()+ "\n");
        System.out.println("Frente=2 espera TRUE: ");
        System.out.println((int)c1.obtenerFrente()==2);
        System.out.println("Desencola espera TRUE y [3]: " + (c1.sacar()));
        System.out.println(c1.toString()+ "\n");
        System.out.println("Desencola espera TRUE y []: " + (c1.sacar()));
        System.out.println(c1.toString()+ "\n");
        System.out.println("Frente es nulo espera TRUE :");
        System.out.println(c1.obtenerFrente() == null );
        System.out.println("Desencola espera FALSE y []: " + (c1.sacar()));
        System.out.println(c1.toString()+ "\n");
        
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("Prueba encolar hasta el 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Encola " + i + " espera TRUE : ");
            System.out.println((c1.poner(i)));
            System.out.println(c1.toString());
        }

        System.out.println("---------------------------------------------------------------\n");
        System.out.println("Prueba el clone");
        Cola c2 = c1.clone();
        System.out.println("Espera" + c1.toString() + ": clon" + c2.toString()+"\n");
        System.out.println("Desencola espera TRUE y [2,3,4,5,6,7,8,9,10]: " + (c1.sacar()));
        System.out.println(c1.toString());
        System.out.println("Desencola espera TRUE y [3,4,5,6,7,8,9,10]: " + (c1.sacar()));
        System.out.println(c1.toString());
        System.out.println("Frente=8 espera TRUE: ");
        System.out.println((int)c1.obtenerFrente()==8);
        
        
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("Prueba el vaciar");
        c1.vaciar();
        System.out.println("Vaciar espera TRUE y []: " + (c1.esVacia()));
        System.out.println(c1.toString() + "\n");
        System.out.println("El frente debe ser nulo espera TRUE: ");
        System.out.println(c1.obtenerFrente()==null);
       
       
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("Prueba encolar hasta el 11");

        System.out.println("Encola 1 espera TRUE y [1]: " + (c1.poner(1)));
        System.out.println(c1.toString() + "\n");
        System.out.println("Encola 2 espera TRUE y [1, 2]: " + (c1.poner(2)));
        System.out.println(c1.toString() + "\n");

        System.out.println("Encola 3 espera TRUE y [1, 2, 3]: " + (c1.poner(3)));
        System.out.println(c1.toString() + "\n");

        System.out.println("Encola 4 espera TRUE y [1, 2, 3, 4]: " + (c1.poner(4)));
        System.out.println(c1.toString() + "\n");

        System.out.println("Encola 5 espera TRUE y [1, 2, 3, 4, 5]: " + (c1.poner(5)));
        System.out.println(c1.toString() + "\n");

        System.out.println("Encola 6 espera TRUE y [1, 2, 3, 4, 5, 6]: " + (c1.poner(6)));
        System.out.println(c1.toString() + "\n");

        System.out.println("Encola 7 espera TRUE y [1, 2, 3, 4, 5, 6, 7]: " + (c1.poner(7)));
        System.out.println(c1.toString() + "\n");

        System.out.println("Encola 8 espera TRUE y [1, 2, 3, 4, 5, 6, 7, 8]: " + (c1.poner(8)));
        System.out.println(c1.toString() + "\n");

        System.out.println("Encola 9 espera TRUE y [1, 2, 3, 4, 5, 6, 7, 8, 9]: " + (c1.poner(9)));
        System.out.println(c1.toString() + "\n");

        System.out.println("Encola 10 espera TRUE y [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]: " + (c1.poner(10)));
        System.out.println(c1.toString() + "\n");
        System.out.println("Encola 11 espera TRUE: " + (c1.poner(11)));
     
        }
}
