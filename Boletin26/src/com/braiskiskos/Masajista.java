/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braiskiskos;

/**
 *
 * @author Usuario
 */
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int añosExperiencia;

    public Masajista(String titulacion, int añosExperiencia, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }
    
    @Override
    public void concentrarse() {
        System.out.println("Si va a las concentraciones");
    }

    @Override
    public void viajar() {
        System.out.println("Si biaja por partidos");
    }

    @Override
    public void entrenar() {
        System.out.println("Asiste a los jugadores en el entrenamiento");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Asiste a los jugadores lesionados en el partido");
    }

    @Override
    public String toString() {
        return super.toString()+", titulacion=" + titulacion + ", añosExperiencia=" + añosExperiencia;
    }
    
}
