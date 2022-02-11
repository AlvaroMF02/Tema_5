package ejer24listareproduccion;
import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class ListaReproduccion {
    //ATRIBUTO
    private ArrayList<Cancion> lista;
    
    
    //CONSTRUCTOR
    public ListaReproduccion() {
        this.lista = new ArrayList<>();
    }
    
    
    //METODOS
    
    //rellenar array
    public void insertarCancion(Cancion cancion){
        if(cancion!=null){
            lista.add(cancion);
        }
                                                                                                                                                                                                                                                                                                         
    }
    
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
    
    public Cancion escucharCancion(int posicion){
        Cancion aux = new Cancion("", "", 0);
        
        int indice = lista.indexOf(posicion);
        
        if (indice>=0){
            return lista.get(indice);
        }
      return aux;
    }
    
    public Cancion cambiarCancion(int posicion, Cancion nombre){
        //Cambia la cancion de la posicion por el nombre de una nueva
        
        if(lista.contains(posicion)){
           lista.remove(posicion);
            lista.add(nombre);
        }
        return ;
    }
    
    public Cancion grabarCancion(Cancion cancion){
        
    }
    
    
    
    
}
