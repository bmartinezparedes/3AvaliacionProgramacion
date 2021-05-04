/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Alumno implements Serializable  {
    private String nome,dni;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nome, String dni, int nota) {
        this.nome = nome;
        this.dni = dni;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome= " + nome + ", DNI= " + dni + ", Nota= " + nota;
    }

   
    
    
    
    
}
