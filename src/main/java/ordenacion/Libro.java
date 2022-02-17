/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacion;

import ejer20clasesconarrays.*;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author alvaro
 */
public class Libro implements Comparable<Libro>{
    
    private String isbn;
    private String nombre;
    private String editorial;
    private int numeroPag;
    private double precio;

    
    
    
    
    public Libro(String isbn, String nombre, String editorial, int numeroPag, double precio) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.numeroPag = numeroPag;
        this.precio = precio;
    }

    
    
    
    
    
    
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", nombre=" + nombre + ", editorial=" + editorial + ", numeroPag=" + numeroPag + ", precio=" + precio + '}';
    }

    
    
    
    
    
    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.isbn);
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.editorial);
        hash = 47 * hash + Objects.hashCode(this.numeroPag);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    
    
    
    
    @Override
    //consideramos dos libros iguales cuando el isbn conincide
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
        final Libro other = (Libro) obj;
        
        return Objects.equals(this.isbn, other.isbn);
    }

    @Override
    public int compareTo(Libro t) {
        //metemos el criterio de ordenacion
        
        return this.isbn.compareTo(t.isbn);
        
        
    }

    
    
    
    
    
    
    
}
