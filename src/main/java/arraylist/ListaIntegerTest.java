package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author alvaro
 */
public class ListaIntegerTest {
    public static void main(String[] args) {
        //ListaInteger miLista=new ListaInteger(10);
        //ArrayList<Integer> list = miLista.getLista();
        
         Random r = new Random();
         
         ArrayList <Integer> list = new ArrayList<>();
         
         list.add(2);
         list.add(7);    
         list.add(6);
         list.add(1); 
         list.add(3); 
         list.add(4);
         
         for (int i = 0; i < 25; i++) {
            Integer aux = r.nextInt(91)+10;
            list.add(aux);
        }
         
         for (Integer integer : list) {
             System.out.print(integer +" - ");
        }
         
         int sumaPares=0;
         //sumar los numeros pares
         for (int i = 0; i < list.size(); i++) {
            //metodo get (posicion) para obtener cada elemento de la lista
            int numero=list.get(i);
            
            if(numero%2==0){
                sumaPares+=numero;
            }
        }
         
         System.out.println("suma de pares: "+sumaPares);
         
         
         int contador=0;
         //sumar los numeros pares
         for (int i = 0; i < list.size(); i++) {
            //metodo get (posicion) para obtener cada elemento de la lista
            int numero=list.get(i);
            
            if(numero%2 != 0){
                contador++;
            }
        }
         
         System.out.println("suma de pares: "+contador);
         
         
         
         //Buscar el mayor
         int mayor= Integer.MAX_VALUE;
         for (Integer num : list) {
            if(num>mayor){
                mayor=num;
            }
        }
         System.out.println("El mayor es "+ mayor);
         
         System.out.println("Borrado del elemento en la psoición 3");
         
         list.remove(3);
         
         list.forEach(e->System.out.print(e+ " - "));
         //cambiar el numero de la posicion 0 y poner un 200
         list.set(0, 200);
         
         list.add(2,500);
         
         list.forEach(e->System.out.print(e+ " - "));
         
         int  indice = list.indexOf(500);
    
         System.out.println("\n El 500 esta en "+indice);
    }
}
