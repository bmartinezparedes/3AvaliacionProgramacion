/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braiskiskos.exPolimorfismo;

/**
 *
 * @author Usuario
 */
public class Can extends Animal{
    
    private String raza;

    public Can(String raza, String nome) {
        super(nome);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return super.toString()+" raza=" + raza;
    }
    
    public void andar(){
        System.out.println(" o can anda");
    }
    @Override
    public void falar() {
        System.out.println(" guau guau guau ");
    }
    
    
}
