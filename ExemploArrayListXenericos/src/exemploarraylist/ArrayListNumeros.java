/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ArrayListNumeros <T> {
    
    
    public void amosarForEach(ArrayList<T>listaNum){
        
        for(T ele:listaNum){
            System.out.println("* "+ele);
        }    
    }
    
    public void amosar1 (ArrayList<Autobus>lista){
        for(Autobus ele:lista){
            System.out.println("1 "+ele);
        }
    }
    public void amosar2(ArrayList<? extends Vehiculo>lista){
        for(Vehiculo ele:lista){
            System.out.println("2 "+ele);
        }
    }
    
    public void amosar3(ArrayList<? super Autobus>lista){
        lista.forEach((ele) -> {
            System.out.println("3 "+ele);
        });
        
    }
    /*
    public void eliminar (){
    int elementoEliminar=Integer.parseInt(JOptionPane.showInputDialog("ele eliminar"));
    
    for(int i=0;i<listaNum.size();i++){
        if(listaNum.get(i)==elementoEliminar){
            listaNum.remove(i);
        }
    }
    
    }
    
    public void engadirPosicion(int pos){
        listaNum.add(pos, Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero")));
    }
    
    public void eliminarConIteratorPares(){
        for(int i=0;i<listaNum.size();i++){
        if(listaNum.get(i)%2==0){
            listaNum.remove(i);
        }
        }
    }
*/
}
