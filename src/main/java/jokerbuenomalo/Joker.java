package jokerbuenomalo;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Joker {
    public static void main(String[] args) { //no esta acabao
        //----------------------------------
        
        Random numero = new Random();
        Scanner teclado = new Scanner(System.in);
        
        int x = 0;    //guarda los numeros random
        int bolUse;
        
        int [] boleto = new int [7];
        
        for (int i = 0; i < boleto.length; i++) {
            x=numero.nextInt(9 -1 +1) +1;
            boleto[i]=x;
        }
        
        for (int j : boleto) {      //boleto final 
            System.out.println(j);
        }
        
        //Pregunta al jambo
        System.out.println("¿Cuál es su número de boleto?");
        bolUse=teclado.nextInt();
        
        //if()
        
        
        
    } 
}
