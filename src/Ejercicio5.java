package src;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Ejercicio5 ejercicio = new Ejercicio5();
    }
    int[] arreglo = new int[101];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio5() {
        String decision;
        do {
            for (int x = 0; x < arreglo.length; x++) {
                arreglo[x] = 0;
            }
            llenarArreglo();
            System.out.println("Pusle cualquier tecla para ingresar otra clase, pulse S para salir");
            decision = scanner.next();
        } while (!decision.equals("S"));

    }

    public void llenarArreglo() {
        int num;
        int contador = 0;
        int x = 0;
        String decision = "S";
        do {
            System.out.println("Ingrese nota nueva");
            num = scanner.nextInt();
            while (num < 0 || num > 10) {
                System.out.println("Ingrese nota valida entre 0 y 10");
                num = scanner.nextInt();
            }
            contador++;
            arreglo[x] = num;
            arreglo[x + 1] = -51;
            System.out.println("Notas: " + Arrays.toString(arreglo));
            System.out.println("Promedio de notas: " + calcularPromedio(contador));
            System.out.println("Desea agregar mas notas, Si.cualquier tecla No.S");
            decision = scanner.next();
            x++;
        } while (x < 100 & !decision.equals("S"));
        if (!decision.equals("S")) {
            System.out.println("100 alumnos registrado, no hay mas cupo");
        }
    }

    public double calcularPromedio(int contador) {
        int x = 0;
        int suma = 0;
        while (arreglo[x] != -51) {
            suma += arreglo[x];
            x++;
        }
        return ((double) suma / contador);
    }
}