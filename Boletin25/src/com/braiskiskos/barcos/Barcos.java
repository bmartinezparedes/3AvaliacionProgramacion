/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braiskiskos.barcos;

/**
 *
 * @author Usuario
 */
public abstract class Barcos {
    
    private String matricula;
    private float slora;
    private int dias;

    public Barcos(String matricula, float slora, int dias) {
        this.matricula = matricula;
        this.slora = slora;
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public float getSlora() {
        return slora;
    }
}
