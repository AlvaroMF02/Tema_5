/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberes1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class ejer7 {
    public static void main(String[] args) {
        //---------------------------------
        
        int cantidad=0;
        int x=0;
        int y=0;
        
        //-----------------------------------
        
        Random numAleatorio = new Random();
        Scanner teclado= new Scanner(System.in);
        
        //-----------------------------------
        
        
        System.out.println("¿Cuántas posiciones queieres que tenga el array?");
        cantidad=teclado.nextInt();
                
        int[] ar1 = new int[cantidad];  //creacion de los arrays 1 y 2
        int[] ar2 = new int[cantidad];
        
        for (int i=0; i<=ar1.length -1; i++) {  //bucle que rellena los arrays con numeros aleatorios
            
            x = numAleatorio.nextInt(100 - 1 + 1) + 1;  //crea numeros del 1 al 100
            ar1[i]=x;   //los mete en la posicion del array i
                        
            y = numAleatorio.nextInt(100 - 1 + 1) + 1;
            ar2[i]=y;
        }
        
        System.out.println("***************ARRAY1****************");    //salida por pantalla
        for (int i=0; i<=ar1.length -1; i++) {
            System.out.println("Posicion "+i+"= "+ar1[i]);
        }
        
        System.out.println("\n***************ARRAY2****************");
        for (int i=0; i<=ar2.length -1; i++) {
            System.out.println("Posicion "+i+"= "+ar2[i]);
        }

        
        int []multiplicacion=multiplicador(ar1,ar2);  //llamada al metodo para la multiplicacion
    }
    
    
    
    //metodo para hacer la multiplicacion
    public static int[] multiplicador(int ar1[], int ar2[]){
        int multiplicacion=0;
        int [] ar3=new int[ar1.length];
        
        System.out.println("\n***************MULTIPLICACIÓN****************");
        
        for (int i = 0; i < ar1.length; i++) {
            ar3[i]=ar1[i]*ar2[i];
            System.out.println("mult. nº"+i+"= "+multiplicacion);
        }        
        
        return ar3;
    }
    
}
