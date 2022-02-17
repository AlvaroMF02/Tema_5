package ejer19avionmatriz;

/**
 *
 * @author alvaro
 */
public class PruebaAvion {
    public static void main(String[] args) {
        Avion boing = new Avion();
        
        
        
        boing.reservar(2, 3);   //reservar asientos
        boing.reservar(0, 0);
        boing.reservar(0, 1);
        //muestra los asientos
        boing.mostrarAsientos();
    }
}
