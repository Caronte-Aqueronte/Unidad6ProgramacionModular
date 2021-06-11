package src;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
    }
    int[] arreglo = new int[8];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio3() {
        int num;
        llenarArreglo();
        System.out.println("Ingrese numero a buscar");
        num = scanner.nextInt();
        String confirmacion = buscarEnArreglo(num);
        System.out.println(confirmacion);
    }

    public void llenarArreglo() {
        int random;
        for (int x = 0; x < arreglo.length; x++) {
            random = (int) (Math.random() * (100 - 1) + 1);
            arreglo[x] = random;
            System.out.println("Elemento en la posicion " + (x + 1) + " = " + arreglo[x]);
        }
    }

    public String buscarEnArreglo(int num) {
        for (int item : arreglo) {
            if (num == item) {
                return "Encontrado";
            }
        }
        return "No encontrado";
    }
}