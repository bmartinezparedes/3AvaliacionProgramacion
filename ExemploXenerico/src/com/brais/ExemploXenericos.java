/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brais;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ExemploXenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ConObject obx=new ConObject();
        String []lista1={"aa","bb","cc"};
        //Integer []lista2={1,2,3,4};
        Object[]l1=obx.engadir();
        obx.amosar(l1);
        //obx.amosar(lista2);
        */
        /*
        ConXenericos<String> obx=new ConXenericos();
        obx.setDato("3");
        System.out.println(obx.getDato());
        */
        ConXenericos<Autobus> obxA=new ConXenericos<>();
        obxA.setDato(new Autobus(4,"aaa","asd",5));
        System.out.println(obxA.getDato());
        
        ConXenericos<Vehiculo> o=new ConXenericos<>();
        o.setDato(new Vehiculo("111","citroen",5));
        System.out.println(o.getDato());
        //calquera que extienda de veiculo=< ? extends Vehiculo>
        List< ? extends Vehiculo> l=new ArrayList<Autobus>();
        
        /*
        ConXenericos<Alumno> obxAlumno=new ConXenericos<>();
        obxAlumno.setDato(new Alumno("Brais","1",10));
        System.out.println(obxAlumno.getDato());
        */
    }
    
}
