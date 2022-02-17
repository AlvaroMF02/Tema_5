package deberes1;

import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class Ejer12Matriz {
    public static void main(String[] args) {
        int[][] coso =new int[2][3];
        
        for (int i = 0; i < coso.length; i++) {
            for (int j = 0; j < coso.length; j++) {
                
                coso[i][j]=rellenarMatriz();
            }
        }
        
    }
    
    
    
    
    public int rellenarMatriz(){
        Scanner teclado = new Scanner(System.in);
        int num;
        int[][] coso =new int[2][3];
        
        
        for (int i = 0; i < coso.length; i++) {
            for (int j = 0; j < coso[i].length; j++) {
                
                System.out.println("Introduzca un numero");
                num=teclado.nextInt();
                
                coso[i][j]=num;
            }
        }
        
        
        return
    }
    
    
}
