package src;

public class Ejercicio7 {

    public static void main(String[] args) {
        Ejercicio7 ejercicio = new Ejercicio7();
    }
    int[][] matriz = new int[4][3];

    public Ejercicio7() {
        llenarMatriz();
        mostrarMatriz();
        System.out.println("");
        System.out.println("La suma de las filas pares es " + sumarFilasPares());
    }

    public void llenarMatriz() {
        int random;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                random = (int) (Math.random() * (555 - 0) + 0);
                matriz[x][y] = random;
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

    public int sumarFilasPares() {
        int suma = 0;
        for (int x = 0; x < matriz.length; x++) {
            if ((x + 1) % 2 == 0) {
                for (int y = 0; y < matriz[x].length; y++) {
                    suma += matriz[x][y];
                }
            }
        }
        return suma;
    }
}