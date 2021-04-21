/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braiskiskos.ventana;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Ventana {
    JFrame marco;
    JPanel panel;
    JButton bPremer,bLimpar;
    JTextField lTextNome,lTextPassword;
    JLabel etqNome,etqPassword;
    JTextArea aTextArea;
    
    public void iniciar(){
        //Instanciamos as compoñentes
        marco=new JFrame("Marco con compoñentes");
        panel =new JPanel ();
        bLimpar=new JButton("Limpar");
        bPremer=new JButton("Premer");
        lTextNome =new JTextField();
        lTextPassword =new JTextField();
        etqNome= new JLabel("Nome: ");
        etqPassword= new JLabel("Password: ");
        aTextArea =new JTextArea();
        
        //caracteristicas das compoñentes
        marco.setSize(800, 800);
        marco.setLocationRelativeTo(null);
        panel.setSize(750,750);
        panel.setLayout(null);
        bLimpar.setBounds(500, 600, 100, 50);
        bPremer.setBounds(200,600,100,50);
        etqNome.setBounds(20, 10, 50, 100);
        etqPassword.setBounds(20, 70, 100, 100);
        lTextNome.setBounds(200, 30, 200, 50);
        lTextPassword.setBounds(200, 85, 200, 50);
        aTextArea.setBounds(150, 300, 500, 200);
        
        //engadimos compoñentes
        panel.add(etqNome);
        panel.add(etqPassword);
        panel.add(lTextNome);
        panel.add(lTextPassword);
        panel.add(aTextArea);
        panel.add(bPremer);
        panel.add(bLimpar);
        
        marco.add(panel);
        
        
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
