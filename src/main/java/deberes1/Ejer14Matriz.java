/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberes1;

import java.util.Random;

/**
 *
 * @author Álvaro
 */
public class Ejer14Matriz {
    public static void main(String[] args) {
        
        Random alea = new Random();
        int numAlea;
        
        
        int[][] array =new int[3][3]; 
        
        numAlea=alea.nextInt(100)+1;
        
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { //no se porque es i length
                
                
                numAlea=alea.nextInt(100)+1;//rellena 
                array[i][j] = numAlea;
                
                System.out.println(array[i][j]);//muestra
                
                
                //media=array[i]*array[j];
                
                
            }
        }
        
        
        
        
    }
}
