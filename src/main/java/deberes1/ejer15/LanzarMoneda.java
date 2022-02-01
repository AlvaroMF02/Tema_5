/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberes1.ejer15;

import java.util.Random;

/**
 *
 * @author Álvaro
 */
public class LanzarMoneda {
    
    private boolean [] arboo = new boolean[1000];
    
    
    //metodos
    
    //a)
    public void simulacion(){
        Random numAlea = new Random();
        int alea;
        alea=numAlea.nextInt(1-0+1)+0;  //numero aleatorio del 0 al 1 
                                        //para ver si es T o F
        for (int i = 0; i < arboo.length; i++) {
            
            if (alea==0){
                arboo[i]=false;
            }else{
                arboo[i]=true;
            }
        }
    }
    
    //b)
    public void carasLanzamientos(){
        int cara=0;
        int cruz=0;
        
        for (int i = 0; i < arboo.length; i++) {
            if (arboo[i]=false){        //suma una a cara y a cruz dependiendo de si es verdadero o falso
                cara++;
            }else if (arboo[i]=true){
                cruz++;
            }
        }
        
        System.out.println("En total han salido "+cara+" caras y "+cruz+" cruces ");
    }
    
    
    //c)
    //no lo entiendo :)
    
    //d)
    public void muestra(){
        for (int i = 0; i < arboo.length; i++) {
            System.out.println("Posición: " +i);
            if (arboo[i]=false){
                System.out.println(" cara");
            }else{
                System.out.println(" cruz");
            }
        }
    }
    
    
}
