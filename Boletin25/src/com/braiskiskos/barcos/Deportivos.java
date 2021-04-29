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
public class Deportivos extends Barcos{
    private int potencia;

    public Deportivos(int pontencia, String matricula, float slora, int dias) {
        super(matricula, slora, dias);
        this.potencia = pontencia;
    }

    public int getPontencia() {
        return potencia;
    }
    
    private float diaSlora(){
        return super.getDias()*10*super.getSlora();
    }
    private int calPotencia(){
        return potencia*2;
    }
    private float total(){
        
        return diaSlora()+calPotencia();
    }

    @Override
    public String toString() {
        return "Factura:\nENBARCACIÓN DEPORTIVA\n"+"Matricula= "+super.getMatricula()+"\nDias aluguer= "+super.getDias()+"\n"+"Metros de slora= "+super.getSlora()+
                "m\n"+"Dias * 10 * slora= "+diaSlora()+"€"+"\nCV= "+potencia+"\nPrecio CV= 2€\nPrecio Total CV= "+calPotencia()+"€\nTOTAL= "+total()+"€";
    }
    
    
}
