package src;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Ejercicio11 ejercicio = new Ejercicio11();
    }
    double[] nota = new double[6];
    String[] nombre = new String[6];
    String[] estado = new String[6];
    Scanner scanner = new Scanner(System.in);

    public Ejercicio11() {
        llenarSegundoArreglo();
        llenarPrimerArreglo();
        mostrarNotas();
    }

    public void llenarPrimerArreglo() {
        double num;
        for (int x = 0; x < nota.length; x++) {
            System.out.println("Ingrese la nota del alumno " + nombre[x]);
            num = scanner.nextDouble();
            while (num < 0 || num > 10) {
                System.out.println("Ingrese nota valida entre 0 y 10");
                num = scanner.nextDouble();
            }
            nota[x] = num;
            llenarEstado(num, x);
        }
    }

    public void llenarSegundoArreglo() {
        String nom;
        for (int x = 0; x < nombre.length; x++) {
            System.out.println("Ingrese nombre del alumno");
            nom = scanner.nextLine();
            nombre[x] = nom;
        }
    }

    public void llenarEstado(double num, int x) {
        if (num >= 0 && num <= 4.99) {
            estado[x] = "Suspenso";
        }
        if (num >= 5 && num <= 6.99) {
            estado[x] = "Bien";
        }
        if (num >= 7 && num <= 8.99) {
            estado[x] = "Notable";
        }
        if (num >= 9 && num <= 10) {
            estado[x] = "Sobresaliente";
        }
    }

    public void mostrarNotas() {
        for (int x = 0; x < 6; x++) {
            System.out.println("Nombre del alumno: " + nombre[x] + " Nota: " + nota[x] + " Estado: " + estado[x]);
        }
    }

}