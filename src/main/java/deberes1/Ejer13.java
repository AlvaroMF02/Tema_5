package deberes1;

import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class Ejer13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numColum;
        int tamColum;
        
        
        System.out.println("Indica la cantidad de columnas que quieres poner");
        numColum=teclado.nextInt();
        
        int [] histograma = new int[numColum];
        
        
        for (int i = 0; i < numColum; i++) {
            System.out.println("\n Escriba el tamaño de cada columna [1-20]");
            tamColum=teclado.nextInt();
            
            histograma[i]=tamColum;
            
            for (int j = 0; j < tamColum; j++) {
                System.out.print("*");
            }
        }
        
    }
}
