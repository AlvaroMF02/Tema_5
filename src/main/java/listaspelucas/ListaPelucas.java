package listaspelucas;
import java.util.ArrayList;

/**
 *
 * @author Álvaro
 */
public class ListaPelucas {
    
    //ATRIBUTO
    private ArrayList<Peluca> lista;

    //CONSTRUCTOR
    public ListaPelucas() {
        this.lista = new ArrayList<>();
    }
    
    //METODOS
    public void insertarPeluca(Peluca peluca){
        if(peluca!=null){
            lista.add(peluca);
        }
    }
    
    
    public void imprimirPorConsola(){                  //Imprime el contenido
        System.out.println("Pelucas de la lista: ");
        lista.forEach(System.out::println);
    }
    
    
    public int getCantidadPelucas(){                     //Indica la cantidad que hay
       return lista.size();
    }
    
    
    public boolean borrarPeluca(Peluca peluca){        //Borra un objeto de la lista
        if(lista.contains(peluca)){
            lista.remove(peluca);
            return true;
        }
            return false;
    }
    
    
    public Peluca buscarColor(String color){           //Busca por color 
        Peluca aux= new Peluca(color, 0, false, "");
        
        int indice = lista.indexOf(aux);
        
        if (indice>=0){
            return lista.get(indice);
        }
        return aux;
    }
    
    
    public Peluca buscarPorLargura(double largo){       //Busca por largura
        Peluca aux= new Peluca("", largo, false, "");
        
        int indice = lista.indexOf(aux);
        
        if (indice>=0){
            return lista.get(indice);
        }
        return aux;
    }
    
    
    
    
}
