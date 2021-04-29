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
public class Gato extends Animal{

    private String cor;

    public Gato() {
    }

    public Gato(String cor, String nome) {
        super(nome);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return super.toString()+" cor=" + cor;
    }
    
    
    
    @Override
    public void falar() {
        System.out.println(" miau miau ");
    }
}
