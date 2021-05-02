/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brais;

/**
 *
 * @author Usuario
 */
public class ConObject {
    Object[]lista=new Object[3];
    public void amosar (Object[]lista){
        String nome;
        for(int i=0;i<lista.length;i++){
            nome=(String)lista[i];
            System.out.println(nome);
        }
            
    }
    
    public Object [] engadir(){
        lista[0]="aa";
        lista[1]=3;
        lista[2]="cc";
        return lista;
    }
}
