/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vida;

import java.util.ArrayList;

/**
 *
 * @author emmrove
 */
public class Tablero {

    ArrayList<ArrayList<Celula>> tablero = new ArrayList<>();

    public Tablero() {
    }

    public void llenarTablero() {
        double rnd;
        Celula cel;
        ArrayList<Celula> arrayinterno;
        for (int i = 0; i < 5; i++) {
            arrayinterno = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                rnd = Math.floor(Math.random() * 2 + 0);
                if (rnd == 1) {
                    cel = new Celula();
                    cel.ponerEstado(rnd);
                    arrayinterno.add(cel);
                } else {
                    arrayinterno.add(null);
                }
            }
            tablero.add(arrayinterno);
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.size(); i++) {
            for (int j = 0; j < tablero.get(i).size(); j++) {
                if (tablero.get(i).get(j) == null) {
                    System.out.print('0');
                } else {
                    System.out.print((int) tablero.get(i).get(j).obtenerEstado());
                }
            }
            System.out.println("");
        }
    }

    public void validacionesTablero() {
        for(int i = 0; i < tablero.size(); i++){
            for(int j = 0; j < tablero.get(0).size(); j++){
                int vecinos = vecinosCelula(i, j);
                if(vecinos == 2 || vecinos == 3){
                    if(tablero.get(i).get(j) == null && vecinos == 3){
                        Celula c = new Celula();
                        c.ponerEstado(1);
                        tablero.get(i).set(j, c);
                    }
                }else{
                    tablero.get(i).set(j, null);
                }
            }
        }
    }

    public int vecinosCelula(int fila, int columna) {
        int cont = 0;
        for (int i = fila - 1; i < fila + 2; i++) {
            for (int j = columna - 1; j < columna + 2; j++) {
                if ((i >= 0 && i < tablero.size()) && (j >= 0 && j < tablero.get(0).size()) && (fila != i || columna != j)) {
                    if(tablero.get(i).get(j) != null){
                        cont++;
                    }
                }
            }
        }
        return cont;
    }
}
