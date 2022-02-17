/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer19avionmatriz;

/**
 *
 * @author alvaro
 */
public class Avion {

    //ATRIBUTOS
    boolean[][] asientos = new boolean[25][4];

    //METODOS
    public void reservar(int fila, int columna) { //tiene que meter el asiento i=4, j=2

        for (int i = 0; i < asientos.length; i++) {
            if (i==fila){
                for (int j = 0; j < asientos[i].length; j++) {
                    if (j==fila){
                        asientos[i][j]=true;
                    }
                }
            }
        }
    }

    public void mostrarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            System.out.println();
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(" " + asientos[i][j]);         //cambiarlo para verlo como un avion

            }
        }
    }

}
