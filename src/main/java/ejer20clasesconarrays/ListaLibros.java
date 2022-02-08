package ejer20clasesconarrays;
import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class ListaLibros {
    //Atributo encapsulado de tipo lista
    
    private ArrayList<Libro> lista;

    
    
    //constructor por defecto solo instancia la estructutra list
    //sin incluir ningun objeto
    public ListaLibros() {
        this.lista = new ArrayList<>(); //guarda espacio para una lista pero no mete nada po rahora
    }
    
    
    //guarda un libro al final de la lista, si no es null
    public void insertarLibro(Libro libro){
        if (libro!= null){
            lista.add(libro);
        }
        
    }
    
    
    //imprime la cantidad de libros que hay
    public void imprimirConsola(){
        System.out.println("Imprimiendo lista...");
        lista.forEach(System.out::println);         //saca por pantalla
        
    }
    
    

    //ver cantidad de libros
    public int getCantidadLibros(){
        return lista.size();
    }
    
    
    
    //Eliminar un libro
    public boolean borrarLibro(Libro libro){
       if (lista.contains(libro)){
           lista.remove(libro);
           return true;
       }
       return false;
    }
    
    
    //Buscar un libro       Siempre que busquemos lo hacemos con unalista por si acaso hay mas con los mismo
    //metodo con for
    public Libro buscarISBNCuentaVieja(String isbn){
        Libro aux=null;
        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            if (aux.getIsbn().equals(isbn)){
                return aux;
            }
        }
        return aux;
    }
    
    //metodo con equals
    public Libro buscarISBN(String isbn){
        Libro aux= new Libro(isbn, "", "", 0, 0);
        
        int indice = lista.indexOf(aux);
        
        if (indice>=0){
            return lista.get(indice);
        }
        
        return aux;
    }
    
    
    
    
    //buscar por precio
    public ArrayList<Libro> buscarPorPrecio(double precio){
        ArrayList<Libro> aux = new ArrayList();
        
        for (Libro libro : this.lista) {
            if(libro.getPrecio()==precio){
                aux.add(libro);
            }
        }
        return aux;
    }
    
    
    
}
