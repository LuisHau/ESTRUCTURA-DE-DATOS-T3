package eje_pila1;

import java.util.Scanner;

public class Eje_Pila1 {

    public static void main(String[] args) throws Exception {

        //PILA ENLAZADA 
        pilaEnlazada pila = new pilaEnlazada();
        nodoDPila data = new nodoDPila();
        String texto1;
        Scanner boton = new Scanner(System.in);
        System.out.println("INGRESE UNA PALABRA: \n");
        texto1 = boton.nextLine();
        pila.Separar(texto1);

        String palabras[] = new String[pila.Separar(texto1).length];
        palabras = pila.Separar(texto1);

        for (int i = 0; i < pila.Separar(texto1).length; i++) {
            pila.apilar(palabras[i]);
        }
        System.out.print("PALABRA = ");
        pila.imprimelista();
        System.out.println("");
        System.out.println("IMPRIMIR PILA");
        pila.listar();

    }

}
