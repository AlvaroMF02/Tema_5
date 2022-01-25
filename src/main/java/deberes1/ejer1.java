/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deberes1;

/**
 *
 * @author alvaro
 */

//Escribe un programa que muestre cada elemento de un array de enteros y sume todos sus elementos.
//Instancia e inicializa el array en el programa, sin leer nada por teclado, con los siguientes 
//valores {1, 2, 3, 4, 5, 6}.

public class ejer1 {
        public static void main(String[] args) {
            
            int suma=0;
            
        int[] numericos = new int[]{1, 2, 3, 4, 5, 6};
       
            for (int i = 0;i<=numericos.length -1; i++) {
                System.out.println(numericos[i]);
                
                suma+=numericos[i];
            } 
                
            System.out.println("La suma da el total de: "+suma);
            
            
    }  
}
