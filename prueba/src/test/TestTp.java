package test;
import lineales.estatica.*;

public class TestTp {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Pila p1 = new Pila();
        String ok = "ok";
        String error = "error";

        System.out.println("---------------------------------------------------------------");
        System.out.println("Prueba el apilar y desapilar");
        System.out.println("Apila 1 espera ok y [1]: " + (p1.apilar(1) ? ok : error));
        System.out.println(p1.toString());
        System.out.println("Apila 2 espera ok y [1, 2]: " + (p1.apilar(2) ? ok : error));
        System.out.println(p1.toString() + "\n");
        System.out.println("Apila 3 espera ok y [1, 2, 3]: " + (p1.apilar(3) ? ok : error));
        System.out.println(p1.toString() + "\n");
        System.out.println("Tope=3 espera ok :");
        System.out.println((int)p1.obtenerTope() == 3 ? ok : error);
        System.out.println("Desapila espera ok y [1,2]: " + (p1.desapilar() ? ok : error));
        System.out.println(p1.toString());
        System.out.println("Tope=2 espera ok :");
        System.out.println((int)p1.obtenerTope() == 2 ? ok : error);
        System.out.println("Desapila espera ok y [1]: " + (p1.desapilar() ? ok : error));
        System.out.println(p1.toString());
        System.out.println("Desapila espera ok y []: " + (p1.desapilar() ? ok : error));
        System.out.println(p1.toString());
        System.out.println("Tope es nulo espera ok :");
        System.out.println(p1.obtenerTope() == null ? ok : error);
        System.out.println("Desapila espera error y []: " + (p1.desapilar() ? ok : error));
        System.out.println(p1.toString());
        
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("Prueba el apilar hasta el 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Apila " + i + " espera ok : ");
            System.out.println((p1.apilar(i) ? ok : error));
            System.out.println(p1.toString());
        }

        System.out.println("---------------------------------------------------------------\n");
        System.out.println("Prueba el clone");
        Pila p2 = p1.clone();
        System.out.println("Espera" + p1.toString() + ": clon" + p2.toString() + "\n");
        System.out.println("Desapila espera ok y [1,2,3,4,5,6,7,8,9]: " + (p1.desapilar() ? ok : error));
        System.out.println(p1.toString());
        System.out.println("Desapila espera ok y [1,2,3,4,5,6,7,8]: " + (p1.desapilar() ? ok : error));
        System.out.println(p1.toString());
        System.out.println("Tope=8 espera ok: ");
        System.out.println((int)p1.obtenerTope() == 8 ? ok : error);
        
        
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("Prueba el vaciar");
        p1.vaciar();
        System.out.println("Vaciar espera ok y []: " + (p1.esVacia() ? ok : error));
        System.out.println(p1.toString() + "\n");
        System.out.println("El tope debe ser nulo espera ok: ");
        System.out.println(p1.obtenerTope() == null ? ok : error);
       
       
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("prueba apilar hasta el 11");

        System.out.println("Apila 1 espera ok y [1]: " + (p1.apilar(1) ? ok : error));
        System.out.println(p1.toString() + "\n");
        System.out.println("Apila 2 espera ok y [1, 2]: " + (p1.apilar(2) ? ok : error));
        System.out.println(p1.toString() + "\n");

        System.out.println("Apila 3 espera ok y [1, 2, 3]: " + (p1.apilar(3) ? ok : error));
        System.out.println(p1.toString() + "\n");

        System.out.println("Apila 4 espera ok y [1, 2, 3, 4]: " + (p1.apilar(4) ? ok : error));
        System.out.println(p1.toString() + "\n");

        System.out.println("Apila 5 espera ok y [1, 2, 3, 4, 5]: " + (p1.apilar(5) ? ok : error));
        System.out.println(p1.toString() + "\n");

        System.out.println("Apila 6 espera ok y [1, 2, 3, 4, 5, 6]: " + (p1.apilar(6) ? ok : error));
        System.out.println(p1.toString() + "\n");

        System.out.println("Apila 7 espera ok y [1, 2, 3, 4, 5, 6, 7]: " + (p1.apilar(7) ? ok : error));
        System.out.println(p1.toString() + "\n");

        System.out.println("Apila 8 espera ok y [1, 2, 3, 4, 5, 6, 7, 8]: " + (p1.apilar(8) ? ok : error));
        System.out.println(p1.toString() + "\n");
        System.out.println("Apila 9 espera ok y [1, 2, 3, 4, 5, 6, 7, 8,9]: " + (p1.apilar(9) ? ok : error));
        System.out.println(p1.toString() + "\n");
        System.out.println("Apila 10 espera ok y [1, 2, 3, 4, 5, 6, 7, 8,9,10]: " + (p1.apilar(10) ? ok : error));
        System.out.println(p1.toString() + "\n");
        


      
    }
}

