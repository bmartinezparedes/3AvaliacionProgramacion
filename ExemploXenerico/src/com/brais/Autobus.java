/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brais;

/**
 *
 * @author Usuario
 */
// El extends es para indicar que es una subclase y de que superclase desciende
public class Autobus extends Vehiculo{
    
    private int numPlazzas;

    public Autobus() {
        super(); /*Esto es lo que tendria internamente el constructor por 
        defecto comparar con taxi*/
    }

    public Autobus(int numPlazzas, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numPlazzas = numPlazzas;
    }

    public int getNumPlazzas() {
        return numPlazzas;
    }

    public void setNumPlazzas(int numPlazzas) {
        this.numPlazzas = numPlazzas;
    }

    @Override
    public String toString() {
        return  super.toString()+", numPlazzas=" + numPlazzas;
    }
    
    /* otra manera de amosar el contenido, en este caso el toString de esta
    clase no puede llevar el super.toString*/
    /*public void amosar(){
        System.out.println(super.toString()+this.toString());
    }*/
    
}
