package src;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Ejercicio8 ejercicio = new Ejercicio8();
    }
    String[] arreglo = new String[5];
    String[] arreglo2 = new String[5];

    public Ejercicio8() {
        llenarArreglo(arreglo);
        llenarArreglo(arreglo2);
        compararPalabras();
    }

    public void llenarArreglo(String[] arreglo) {
        Scanner scanner = new Scanner(System.in);
        String palabra;
        for (int x = 0; x < arreglo.length; x++) {
            System.out.println("Ingrese valor en la posicion " + (x + 1) + " del arreglo");
            palabra = scanner.nextLine();
            arreglo[x] = palabra;
        }
    }

    public void compararPalabras() {
        System.out.println("Palabra del primer arreglo en la primera posicion es " + arreglo[0] + " tiene " + arreglo[0].length() + " letras");
        System.out.println("Palabra del segundo arreglo en la primera posicion es " + arreglo2[0] + " tiene " + arreglo2[0].length() + " letras");
        if (arreglo[0].length() == arreglo2[0].length()) {
            System.out.println("Tienen la misma cantidad de letras");
        } else {
            System.out.println("No tienen la misma cantidad de letras");
        }
    }
}