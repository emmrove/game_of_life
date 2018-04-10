package Vida;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emmrove
 */
public class Celula {

    private double estado = 0;

    public Celula() {
    }

    public double obtenerEstado() {
        return estado;
    }

    public void ponerEstado(double nuevoEstado) {
        estado = nuevoEstado;
    }
}
