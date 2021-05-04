/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    
    //atributos
    private String matricula,modelo;
    private int potencia;
    //constructor por defecto
    public Vehiculo() {
    }
    //Constructor parametrizado
    public Vehiculo(String matricula, String modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", modelo=" + modelo + ", potencia=" + potencia;
    }
    
    
    
}
