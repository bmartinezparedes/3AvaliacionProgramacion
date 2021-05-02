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
public abstract class  SeleccionFutbol implements IntegranteSeleccionFutbol{
    private int id, edad;
    private String nombre, apellidos;

    public SeleccionFutbol(int id, int edad, String nombre, String apellidos) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public void seleccionarXogador(){
        System.out.println("Lo selecciono");
    }
    
    @Override
    public String toString() {
        return "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos;
    }
    
    
}
