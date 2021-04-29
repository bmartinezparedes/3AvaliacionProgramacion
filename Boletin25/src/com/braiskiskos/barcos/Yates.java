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
public class Yates extends Barcos{
    private int potencia,camarotes;

    public Yates(int potencia, int camarotes, String matricula, float slora, int dias) {
        super(matricula, slora, dias);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    private float diaSlora(){
        return super.getDias()*10*super.getSlora();
    }
    private int calPotencia(){
        return potencia*2;
    }
    private int calCamarote(){
        return camarotes*25;
    }
    private float total(){
        
        return diaSlora()+calPotencia()+calCamarote();
    }

    @Override
    public String toString() {
        return "Factura:\nYATE\n"+"Matricula= "+super.getMatricula()+"\nDias aluguer= "+super.getDias()+"\n"+"Metros de slora= "+super.getSlora()+
                "m\n"+"Dias * 10 * slora= "+diaSlora()+"€"+"\nCV= "+potencia+
                "\nPrecio CV= 2€\nPrecio Total CV= "+calPotencia()+"€\nCamarotes= "+camarotes+
                "\nPrecio Camarote= 25€\nPrecio Total Camarote= "+calCamarote()+"€\nTOTAL= "+total()+"€";
    }
    
    
}
