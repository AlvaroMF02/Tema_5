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
        int cantidad=0;
        int x=0;
        int y=0;
        
        Random numAleatorio = new Random();
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("¿Cuántas posiciones queieres que tenga el array?");
        cantidad=teclado.nextInt();
                
        int[] ar1 = new int[cantidad];
        int[] ar2 = new int[cantidad];
        
        for (int i=0; i<=ar1.length -1; i++) {
            
            x = numAleatorio.nextInt(100 - 1 + 1) + 1;
            ar1[i]=x;
                        
            y = numAleatorio.nextInt(100 - 1 + 1) + 1;
            ar2[i]=y;
        }
        
        System.out.println("***************ARRAY1****************");
        for (int i=0; i<=ar1.length -1; i++) {
            System.out.println("Posicion "+i+"º= "+ar1[i]);
        }
        
        System.out.println("\n***************ARRAY2****************");
        for (int i=0; i<=ar2.length -1; i++) {
            System.out.println("Posicion "+i+"º= "+ar2[i]);
        }
        
    }
    
    
}
