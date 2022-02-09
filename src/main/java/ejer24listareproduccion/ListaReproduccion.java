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
    public int getNumeroCanciones(){
        
        return lista.size();
    }
    
    
}
