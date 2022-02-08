package listaspelucas;

/**
 *
 * @author Álvaro
 */
public class PruebaListaPelucas {
    public static void main(String[] args) {
        ListaPelucas catalogo = new ListaPelucas();
        //Creo unas cuantas pelucas
        catalogo.insertarPeluca(new Peluca("Rojo", 20.3, false, "Ondulado"));
        catalogo.insertarPeluca(new Peluca("Verde", 10, false, "Liso"));
        catalogo.insertarPeluca(new Peluca("Rubio", 17.8, true, "Liso"));
        catalogo.insertarPeluca(new Peluca("Rosa", 39, false, "Liso"));
        catalogo.insertarPeluca(new Peluca("Negro", 20.7, true, "Rizado"));
        catalogo.insertarPeluca(new Peluca("Morado", 70, false, "Liso"));
        
        //Las muestro por pantalla
        catalogo.imprimirPorConsola();
   
        //Muestra la vcantidad de pelucas que hay en el array list
        System.out.println("Hay "+catalogo.getCantidadPelucas()+" pelucas \n");
        
        //Enseña la peluca que se esta buscando,   funciona pero no muestra los otros datos
        Peluca peluca=catalogo.buscarPorLargura(20.7);
        System.out.println("Peluca encontrada "+peluca+"\n");
        
        //Borrar peluca
        catalogo.borrarPeluca(new Peluca("Rubio", 0, true, ""));
        catalogo.imprimirPorConsola();
        System.out.println("Ahora hay "+catalogo.getCantidadPelucas()+" pelucas");
    }
}
