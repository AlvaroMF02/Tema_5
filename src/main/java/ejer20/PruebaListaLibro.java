package ejer20;

/**
 *
 * @author alvaro
 */
public class PruebaListaLibro {
    
    public static void main(String[] args) {
        
        ListaLibros catalogo = new  ListaLibros();
        ListaLibros catalogo2 = new  ListaLibros();
        
        catalogo.insertarLibro(new Libro("123","la muerte a pellizcos","Planeta",10,0.9));
        catalogo.insertarLibro(new Libro("1234","la muerte a bocados","Planeta",10,0.19));
        catalogo.insertarLibro(new Libro("1235","la muerte a bocados","Planeta",10,0.92));
        catalogo.insertarLibro(new Libro("1236","la muerte a bocados","Planeta",10,0.29));
        
        catalogo.imprimirConsola();
        
        System.out.println("Tamaño del catalogo: "+catalogo.getCantidadLibros());
        
        //buscar libro
        Libro libro=catalogo.buscarISBN("1234");
        System.out.println("Libro buscado: "+libro);
        
        
        libro =catalogo.buscarISBNCuentaVieja("1235");
        System.out.println("Libro buscado: "+libro);
        
        
        //borrar libro
        catalogo.borrarLibro(new Libro("1235", "", "", 0, 0));
        catalogo.imprimirConsola(); //no imprime :)
        
        
        //buscar por precio
        System.out.println("Libros de precio 0.9");
        catalogo.buscarPorPrecio(0.9).forEach(System.out::println);
        
        
    }
}
