package src;

public class Ejercicio4 {

    public static void main(String[] args) {
        Ejercicio4 ejercicio = new Ejercicio4();
    }

    int[] arreglo = new int[10];
    int mayor;

    public Ejercicio4() {
        llenarArreglo();
        for (int item : arreglo) {
            System.out.println(contarSeparacion(item));
        }
    }

    public void llenarArreglo() {
        int random;
        for (int x = 0; x < arreglo.length; x++) {
            random = (int) (Math.random() * (100 - 1) + 1);
            compararMayor(random);
            arreglo[x] = random;
            System.out.println("Elemento en la posicion " + (x + 1) + " = " + arreglo[x]);
        }
    }

    public void compararMayor(int num) {
        if (num > mayor) {
            mayor = num;
        }
    }

    public String contarSeparacion(int num) {
        int contadorPosicionMayor = 0;
        int contadorPosicionNumero = 0;
        int resta;
        for (int item : arreglo) {
            contadorPosicionMayor++;
            if (item == mayor) {
                break;
            }

        }
        for (int item : arreglo) {
            contadorPosicionNumero++;
            if (item == num) {
                break;
            }

        }
        resta = contadorPosicionMayor - contadorPosicionNumero;
        return "El numero " + num + " esta a " + resta + " casillas del numero mayor " + mayor;
    }
}