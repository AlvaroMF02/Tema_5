package ejer24listareproduccion;


/**
 *
 * @author alvaro
 */
public class PruebaListaCancion {
    public static void main(String[] args) {
        
        ListaReproduccion coso = new ListaReproduccion();
        
        coso.insertarCancion(new Cancion("120", "Bad Bunny", 2.31));
        coso.insertarCancion(new Cancion("Promiscuous", "Nelly Furtado", 4.00));
        coso.insertarCancion(new Cancion("Best Friend", "Doja Cat", 2.35));
        coso.insertarCancion(new Cancion("Roaring 20s", "Flo Mili", 2.08));
        coso.insertarCancion(new Cancion("Milkshake", "BBY KODIE", 1.48));
        coso.insertarCancion(new Cancion("Snake", "Lil Keed", 3.02));
        coso.insertarCancion(new Cancion("Bitch Mode", "la Zowi", 3.01));
        
        coso.getNumeroCanciones();
        
        coso.estaVacia(true);
        
        coso.escucharCancion(4);
        
        
    }
}
