/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braiskiskos;

import com.braiskiskos.exPolimorfismo.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ExPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        Can c=new Can("palleiro","Tobi");
        Animal c2=new Can(" pastor","Brisa");
        Animal g=new Gato("negro","Michu");
        listaAnimais.add(c);
        listaAnimais.add(c2);
        listaAnimais.add(g);
        
       
        //System.out.println(listaAnimais);
        
        /*for(Animal ele:listaAnimais){
            ele.falar();
        }*/
        Metodos.fala(listaAnimais);
        
    }
    
}
