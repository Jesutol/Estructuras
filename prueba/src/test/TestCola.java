package test;
//import lineales.estatica.*;
import lineales.dinamica.*;
public class TestCola {
	
    static String sOk = "OK!", sErr = "ERROR";

    public static void main(String[] arg) {
        testCola();
    }

    public static void testCola() {
        System.out.println("COMIENZO TEST COLA");
        Cola c1 = new Cola();
        System.out.println("\t\t\t\t\t\t\t\t--> " + c1.toString());

        System.out.print("Poner 1 espera TRUE y [1]:\t\t\t\t\t" + ((c1.poner(1)) ? sOk : sErr));
        System.out.println("\t--> " + c1.toString());
        System.out.print("Poner 2 espera TRUE y [1,2]:\t\t\t\t" + ((c1.poner(2)) ? sOk : sErr));
        System.out.println("\t--> " + c1.toString());
        System.out.print("Poner 3 espera TRUE y [1,2,3]:\t\t\t\t" + ((c1.poner(3)) ? sOk : sErr));
        System.out.println("\t--> " + c1.toString());
        System.out.print("Poner 4 espera TRUE y [1,2,3,4]:\t\t\t\t" + ((c1.poner(4)) ? sOk : sErr));
        System.out.println("\t--> " + c1.toString());
        System.out.print("Poner 5 espera TRUE y [1,2,3,4,5]:\t\t\t\t" + ((c1.poner(5)) ? sOk : sErr));
        System.out.println("\t--> " + c1.toString());
        System.out.print("Poner 6 espera TRUE y [1,2,3,4,5,6]:\t\t\t\t" + ((c1.poner(6)) ? sOk : sErr));
        System.out.println("\t--> " + c1.toString());
        System.out.print("Poner 7 espera TRUE y [1,2,3,4,5,6,7]:\t\t\t\t" + ((c1.poner(7)) ? sOk : sErr));
        System.out.println("\t--> " + c1.toString());
        System.out.print("Poner 8 espera TRUE y [1,2,3,4,5,6,7,8]:\t\t\t" + ((c1.poner(8)) ? sOk : sErr));
        System.out.println("\t--> " + c1.toString());
        System.out.print("Poner 9 espera TRUE y [1,2,3,4,5,6,7,8,9]:\t\t\t" + ((c1.poner(9)) ? sOk : sErr));
        System.out.println("\t--> " + c1.toString());
        System.out.print("Poner 10 espera FALSE:\t\t\t\t\t\t" + ((!c1.poner(10)) ? sOk : sErr));
        System.out.println("\t\t\t--> " + c1.toString());
        System.out.print("Recupera inicio espera 1 recupera: " + (int) c1.obtenerFrente() + "\t\t" + (((int) c1.obtenerFrente() == 1) ? sOk : sErr));
        System.out.println("\t\t\t--> " + c1.toString());

        System.out.print("Saca espera TRUE:\t\t\t\t\t\t" + ((c1.sacar()) ? sOk : sErr));
        System.out.println("\t\t\t\t\t\t--> " + c1.toString());
        System.out.print("Recupera inicio espera 2 recupera: " + (int) c1.obtenerFrente() + "\t\t" + (((int) c1.obtenerFrente() == 2) ? sOk : sErr));
        System.out.println("\t\t\t--> " + c1.toString());
        System.out.print("Saca espera TRUE:\t\t\t\t\t\t" + ((c1.sacar()) ? sOk : sErr));
        System.out.println("\t\t\t\t\t\t--> " + c1.toString());
        System.out.print("Recupera inicio espera 3 recupera: " + (int) c1.obtenerFrente() + "\t\t" + (((int) c1.obtenerFrente() == 3) ? sOk : sErr));
        System.out.println("\t\t\t--> " + c1.toString());
        c1.vaciar();
        System.out.print("Vaciar espera []:\t\t\t\t\t\t" + ((c1.esVacia()) ? sOk : sErr));
        System.out.println("\t\t\t\t\t--> " + c1.toString());

        System.out.print("Poner 10 espera TRUE y [10]:\t\t\t\t\t" + ((c1.poner(10)) ? sOk : sErr));
        System.out.println("\t\t--> " + c1.toString());
        System.out.print("Poner 11 espera FALSE:\t\t\t\t\t\t" + ((c1.poner(11)) ? sOk : sErr));
        System.out.println("\t\t\t\t\t--> " + c1.toString());
        testClone();
    }
    
    
    public static void testClone() {
        System.out.println("\nCOMIENZO TEST CLONE");
        Cola c1 = new Cola();
        Cola c2=new Cola();
        
        c1.poner(1);
        c1.poner(2);
        c1.poner(3);

       c2 = c1.clone();

        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());

        System.out.println("c1 == c2: " + (c1 == c2)); // Debería ser false
        System.out.println("c1.equals(c2): " + c1.equals(c2)); // Debería ser true
    }

}
