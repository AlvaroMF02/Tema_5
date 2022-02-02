package deberes1;

import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class Ejer13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int i=0;
        int [] arnum = new int[20];
        
        do{
            System.out.println("Escribe unos cuantos numeros :)");
            num=teclado.nextInt();
            
            arnum[i]=num;
            i++;
            
        }while (num!=0);
    
        for (int j = 0; j < arnum.length; j++) {
            System.out.println(arnum[i]);
        }
        
    }
}
