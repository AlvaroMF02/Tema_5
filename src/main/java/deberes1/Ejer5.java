package deberes1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer5 {

    private static int[] array = new int[10];
    private static int contadorPositivo = 0;
    private static int contadorNegativo = 0;
    private static int contadorCero = 0;

    private static void leerValores() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("Introduzca el valor que quiera que se encuentre en la posición " + i);
                int numero = teclado.nextInt();
                array[i] = numero;
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor no válido");
                i--;
            }
        }
    }

    private static int contarPositivos(int[] array) {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                contador++;
            }
        }
        return contador;
    }

    private static int contarNegativos(int[] array) {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                contador++;
            }
        }
        return contador;
    }

    private static int contarCeros(int[] array) {
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                contador++;
            }
        }
        return contador;
    }

    private static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " / ");
        }

    }

    private static void mediaPositivo(int[] array) {
        double media = 0;
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                contador++;
            }
            suma += array[i];
        }
        media = suma / contador;
        System.out.println("La media de los números positivos es de: " + media);
    }

    private static void mediaNegativo(int[] array) {
        double media = 0;
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                contador++;
            }
            suma += array[i];
        }
        media = suma / contador;
        System.out.println("La media de los números negativos es de: " + media);
    }

    public static void main(String[] args) {
        leerValores();
        mostrarArray(array);
        System.out.println("");
        System.out.println("Contar positivos " + contarPositivos(array));
        System.out.println("Contar negativos " + contarNegativos(array));
        System.out.println("Contar ceros " + contarCeros(array));
        mediaPositivo(array);
        mediaNegativo(array);
    }

}