package ejer24listareproduccion;
import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class ListaReproduccion {
    //ATRIBUTO
    ArrayList<Cancion> lista;
    
    
    //CONSTRUCTOR
    public ListaReproduccion(ArrayList<Cancion> lista) {
        this.lista = new ArrayList<>();
    }
    
    
    //METODOS
    //cantidad de canciones
    public int getNumeroCanciones(){
        return lista.size();
    }
    
    public boolean estaVacia(boolean estado){
        
        if (lista.isEmpty()){        //comprueba si la lista esta vacia o llena
            return estado = true;    //si esta vacia estado sera true
        }else{
            return false;
        }
    }
    
    public int escucharCancion(int posicion){
        
      Cancion cancion= lista.get(cancion.toString());   //no se que es esto
        
    }
    
    
    
    
    
    
    
}
