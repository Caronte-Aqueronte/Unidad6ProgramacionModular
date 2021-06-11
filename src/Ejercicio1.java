package src;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Ejercicio1 ej = new Ejercicio1();
    }
    int[] arreglo = new int[5];

    public Ejercicio1() {
        llenarArreglo();
        mostrarArreglo();
    }

    public void llenarArreglo() {
        Scanner scanner = new Scanner(System.in);
        for (int x = 0; x < arreglo.length; x++) {
            System.out.println("Ingrese un numero");
            arreglo[x] = scanner.nextInt();
        }
    }

    public void mostrarArreglo() {
        for (int x = 0; x < arreglo.length; x++) {
            System.out.println("Elemento en la posicion " + x + " es " + arreglo[x]);
        }
    }
}