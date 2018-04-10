/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vida;

/**
 *
 * @author emmrove
 */
public class Test {

    public static void main(String[] args) {
        Tablero ta = new Tablero();
        ta.llenarTablero();
        ta.mostrarTablero();
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            ta.validacionesTablero();
            ta.mostrarTablero();
        }
    }
}
