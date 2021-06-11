package src;

public class Ejercicio6 {

    public static void main(String[] args) {
        Ejercicio6 ejercicio = new Ejercicio6();
    }
    int[][] matriz = {{5, 6, 13}, {14, 2, 4}, {21, 7, 6}};

    public Ejercicio6() {
        multiplicarMatriz();
        mostrarMatriz();

    }

    public void multiplicarMatriz() {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] *= 2;
            }
        }
    }

    public void mostrarMatriz() {
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("*");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");

            }
            System.out.println("*");
        }
    }
}