/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braiskiskos;

import com.braiskiskos.barcos.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Barcos> listaBarcos=new ArrayList <>();
        
        Barcos v1=new Velero (3,"v",10,10);
        Barcos d1=new Deportivos (200,"d",15,7);
        Barcos y1=new Yates (200,2,"y",20,5);
        listaBarcos.add(v1);
        listaBarcos.add(d1);
        listaBarcos.add(y1);
        
        for (Barcos ele:listaBarcos){
            System.out.println(ele.toString());
        }
    }
    
}
