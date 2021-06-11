package src;

public class Ejercicio10 {

    public static void main(String[] args) {
        Ejercicio10 ejercicio = new Ejercicio10();
    }
    int[][] matriz = new int[3][4];
    int[][] traspuesta = new int[4][3];

    public Ejercicio10() {
        llenarMatriz();
        llenarTraspuesta();
        mostrarMatriz();
    }

    public void llenarMatriz() {
        int random;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                random = (int) (Math.random() * (10 - 1) + 1);
                matriz[x][y] = random;
            }
        }
    }

    public void llenarTraspuesta() {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                traspuesta[y][x] = matriz[x][y];
            }
        }
    }

    public void mostrarMatriz() {
        int espacios = matriz[0].length;
        for (int x1 = 0, x2 = 0; x1 < matriz.length || x2 < traspuesta.length; x1++, x2++) {
            if (x1 < matriz.length) {
                System.out.print("*");
                for (int y1 = 0; y1 < matriz[x1].length; y1++) {
                    System.out.print(matriz[x1][y1]);

                    if (y1 != matriz[x1].length - 1) {
                        System.out.print("\t");
                    }
                }
                System.out.print("*");
            } else {
                for (int i = 0; i < espacios - 1; i++) {
                    System.out.print("\t");
                }
            }
            if (x2 < traspuesta.length) {
                System.out.print("\t*");
                for (int y2 = 0; y2 < traspuesta[x2].length; y2++) {
                    System.out.print(traspuesta[x2][y2]);
                    if (y2 != traspuesta[x2].length - 1) {
                        System.out.print("\t");
                    }
                }
                System.out.println("*");
            }
        }
    }
}