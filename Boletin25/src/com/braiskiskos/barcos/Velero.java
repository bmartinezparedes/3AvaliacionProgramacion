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
public class Velero extends Barcos{
    
    private int mastil;

    public Velero(int mastil, String matricula, float slora, int dias) {
        super(matricula, slora, dias);
        this.mastil = mastil;
    }

    public int getMastil() {
        return mastil;
    }

    private float diaSlora(){
        return super.getDias()*10*super.getSlora();
    }
    private int calMastil(){
        return mastil*8;
    }
    private float total(){
        
        return diaSlora()+calMastil();
    }
    @Override
    public String toString() {
        return "Factura:\nVELERO\n"+"Matricula= "+super.getMatricula()+"\nDias aluguer= "+super.getDias()+"\n"+"Metros de slora= "+super.getSlora()+
                "m\n"+"Dias * 10 * slora= "+diaSlora()+"€"+"\nMastiles= "+mastil+"\nPrecio mastil= 8€\nPrecio Total Mastil= "+calMastil()+"€\nTOTAL= "+total()+"€";
    }
}
