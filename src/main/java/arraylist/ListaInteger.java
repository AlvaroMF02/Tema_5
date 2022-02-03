package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author alvaro
 */
public class ListaInteger {
    //atributo
    private ArrayList <Integer> lista;

    
    //constructores
    public ListaInteger() {
        lista = new ArrayList<>();
    }
    
    
    //Crea un alista y la rellena con tantos elementos como indique tam
    public ListaInteger(int tam) {
        Random r = new Random();
        lista = new ArrayList<>();
        
        
        for (int i = 0; i < tam; i++) {
            Integer aux = r.nextInt(91)+10;
            lista.add(aux);
        }
    }
    
    //getter
    public ArrayList<Integer> getLista() {
        return lista;
    }
    
    
    
}
