package src;

public class Ejercicio2 {

    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
    }
    int[] arreglo = new int[10];
    int mayor;

    public Ejercicio2() {
        llenarArreglo();
        imprimirDatos();
    }

    public void llenarArreglo() {
        int random;
        for (int x = 0; x < arreglo.length; x++) {
            random = (int) (Math.random() * (99 - 0) + 0);
            compararMayor(random);
            arreglo[x] = random;
        }
    }

    public void compararMayor(int num) {
        if (num > mayor) {
            mayor = num;
        }
    }

    public int contarRepeticiones() {
        int contador = 0;
        for (int item : arreglo) {
            if (item == mayor) {
                contador++;
            }
        }
        return contador;
    }

    public void imprimirDatos() {
        for (int x = 0; x < arreglo.length; x++) {
            System.out.println("Elemento en la posicion " + (x + 1) + " = " + arreglo[x]);
        }
        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero mayor se repite " + contarRepeticiones() + " veces");
    }
}