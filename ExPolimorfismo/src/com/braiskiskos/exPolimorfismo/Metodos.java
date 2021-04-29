/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braiskiskos.exPolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Metodos {
    
    public static void fala(ArrayList<Animal>lista){
        
        for(Animal ele:lista){
            ele.falar();
        }
        
    }
    
}
