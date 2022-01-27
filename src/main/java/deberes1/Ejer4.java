package deberes1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejer4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numBusc;
            //  Posicione    0 1 2 3 4 5
        int[] ar = new int[]{4,8,3,7,1,0};
        
        for (int i : ar) {  //muestra desordenado
            System.out.println("Desordenado"+i);
        }

        Arrays.sort(ar);    //ordena el array
        
        for (int i : ar) {  //muestra ordenado
            System.out.println("Ordenado"+i);
        }
        
        
        System.out.println("¿Qué número desea buscar?");
        numBusc=teclado.nextInt();
        
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==numBusc){
                
            }
        }
        
        
    }
}
