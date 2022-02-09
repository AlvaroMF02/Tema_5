package listaspelucas;

import java.util.Objects;

/**
 *
 * @author alvaro
 */
public class Peluca {
    
    
    //ATRIBUTOS
    private String color;
    private double largo;
    private boolean calidad;
    private String estilo;
    
    
    
    //CONSTRUCTOR
    public Peluca(String color, double largo, boolean calidad, String estilo) {
        this.color = color;
        this.largo = largo;
        this.calidad = calidad;
        this.estilo = estilo;
    }
    
    
    
    //GETTER Y SETTER
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public boolean isCalidad() {
        return calidad;
    }

    public void setCalidad(boolean calidad) {
        this.calidad = calidad;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
    
    //HASH EQUALS
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.color);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.largo) ^ (Double.doubleToLongBits(this.largo) >>> 32));
        hash = 97 * hash + (this.calidad ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.estilo);
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
        final Peluca other = (Peluca) obj;
        
        return Objects.equals(this.color, other.color);
    }
    
    
    //TOSTRING
    @Override
    public String toString() {
        return "Peluca{" + "color: " + color + ", largo:" + largo + ", calidad:" + calidad + ", estilo:" + estilo + '}';
    }
    
    
}
