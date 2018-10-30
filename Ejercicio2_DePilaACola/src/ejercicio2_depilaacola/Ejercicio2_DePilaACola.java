package ejercicio2_depilaacola;

import java.util.Scanner;

public class Ejercicio2_DePilaACola {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Pila p = new Pila();
        Cola c = new Cola();
        System.out.print("INGRESE EL NUMERO DE ELEMENTOS QUE DESEA: \n");
        int n = Teclado.nextInt();
        System.out.println("\nINTRODUCE LOS ELEMENTOS DE LA PILA: \n");
        String e;
        for (int i = 1; i <= n; i++) {
            System.out.print("POSICION " + i + ": ");
            e = Teclado.next();
            p.insertar(e);
        }
        System.out.println("\nDATOS INTRODUCIDOS A LA PILA CORRECTAMENTE: \n");
        System.out.println("\nPASANDO LOS DATOS DE LA PILA A UNA COLA: \n");
        System.out.println("\nDATOS INGRESADOS A LA COLA: \n");

        System.out.println("\nIMPRESION DE LOS ELEMENTOS DE LA COLA: \n");
        for (int i = 1; i <= n; i++) {
            c.insertar(p.quitar());
            System.out.println("POSICION " + i + ": " + c.quitar());
        }
    }

}
