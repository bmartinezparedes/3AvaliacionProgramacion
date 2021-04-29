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
public abstract class Animal {
    private String nome;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "nome=" + nome;
    }
    
    public abstract void falar();
    
}
