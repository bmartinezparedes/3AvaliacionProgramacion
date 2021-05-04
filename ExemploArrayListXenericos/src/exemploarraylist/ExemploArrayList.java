/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ExemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Primera parte
       /*
       ArrayList <String> listaS=new ArrayList();
       listaS.add("aa");
       listaS.add("bb");
       ArrayList <Integer> listaI=new ArrayList();
       listaI.add(1);
       listaI.add(2);
       ArrayList<Alumno> listaA=new ArrayList();
       listaA.add(new Alumno("juan","1",10));
       listaA.add(new Alumno("Pedro","2",10));
       ArrayListNumeros obx=new ArrayListNumeros();
       obx.amosarForEach(listaS);
       obx.amosarForEach(listaI);
       obx.amosarForEach(listaA);
       */
       //Segunda parte
       ArrayList<Autobus> listaA=new ArrayList();
       listaA.add(new Autobus(5,"123A","citroen",100));
       listaA.add(new Autobus(5,"123B","Renol",100));
       ArrayListNumeros obx=new ArrayListNumeros();
       obx.amosar1(listaA);
       obx.amosar2(listaA);
       obx.amosar3(listaA);
    }
    
}
