package ejer24listareproduccion;

import java.util.Objects;

/**
 *
 * @author alvaro
 */
public class Cancion {
    
    //ATRIBUTOS
    private String nombre;
    private String autor;
    private double duracion;
    
    
    
    //CONSTRUCTOR
    public Cancion(String nombre, String autor, double duracion) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
    }
    
    
    
    //HASH  EQUALS
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.autor);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.duracion) ^ (Double.doubleToLongBits(this.duracion) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        return Objects.equals(this.nombre, other.nombre); //PARA BUSCAR POR AUTOR 
    }
    
    
    //TO STRING
    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", autor=" + autor + ", duracion=" + duracion + '}';
    }
    
    
}
