package src;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Ejercicio9 ejercicio = new Ejercicio9();
    }
    int[][] arreglo;
    int[][] arreglo2;
    int[][] suma;

    public Ejercicio9() {
        definirEspacio();
        llenarMatriz(arreglo);
        llenarMatriz(arreglo2);
        mostrarMatriz(arreglo, 1);
        mostrarMatriz(arreglo2, 2);
        sumarMatrices();
        mostrarMatriz(suma, 3);

    }

    public void definirEspacio() {
        Scanner scanner = new Scanner(System.in);
        int posx1;
        int posy1;
        int posx2;
        int posy2;
        System.out.println("Ingrese el espacio de la primera matriz primero filas luego columnas");
        posx1 = scanner.nextInt();
        posy1 = scanner.nextInt();
        System.out.println("Ingrese el espacio de la segunda matriz primero filas luego columnas");
        posx2 = scanner.nextInt();
        posy2 = scanner.nextInt();
        if (posx1 == posx2 && posy1 == posy2) {
            arreglo = new int[posx1][posy1];
            arreglo2 = new int[posx2][posy2];
            suma = new int[posx2][posy2];
        } else {
            System.exit(0);
        }
    }

    public void llenarMatriz(int[][] matriz) {
        int random;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                random = (int) (Math.random() * (10 - 1) + 1);
                matriz[x][y] = random;
            }
        }
    }

    public void mostrarMatriz(int[][] matriz, int numero) {
        System.out.println("Matriz " + numero);
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("*");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println("*");
        }
    }

    public void sumarMatrices() {
        for (int x = 0; x < suma.length; x++) {
            for (int y = 0; y < suma[x].length; y++) {
                suma[x][y] = (arreglo[x][y] + arreglo2[x][y]);
            }
        }
    }
}