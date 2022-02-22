package metodosmatriz;

import java.util.Random;

/**
 *
 * @author alvaro
 */
public class Matriz {
    public static void main(String[] args) {
        
        //----------------------------------------
        
        Random alea = new Random();
        int[][] mare = new int[10][10];
        
        //----------------------------------------
        
        
        for (int i = 0; i < mare.length; i++) {     //filas
            System.out.println();
            for (int j = 0; j < mare[i].length; j++) { //columnas
                
                mare[i][j]=alea.nextInt(100-0+1)+0; //rellena aleatoriamente
                System.out.print(" "+mare[i][j]); 
            }
        }
        
        System.out.print("\n FILA: ");
        mostrarFila(3, mare);
        
        System.out.print("\n COLUMNA: ");
        mostrarFila(3, mare);
        
        
        
        
    }
    
    //METODOS
    
    //pide           numero de la fila, matriz en la que buscará
    public static void mostrarFila(int fila, int[][]mare){
        
        for (int i = 0; i < mare[fila].length; i++) {     //filas
            System.out.print(mare[fila][i]+", ");
        }
    }
    
     //pide           numero de la columna, matriz en la que buscará
    public static void mostrarColumna(int columna, int[][]mare){
        
        for (int i = 0; i < mare.length; i++) {     //filas
            System.out.println();
            for (int j = 0; j < mare[i].length; j++) {      //columnass
                System.out.print("\n" + mare[columna][i]+", ");
            }
        }
    }
    
    
    
    
    
    
}
