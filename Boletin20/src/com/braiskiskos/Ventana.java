/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braiskiskos;

import java.awt.BorderLayout;
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
    JPanel panel1,panel2;
    JButton bPremer,bLimpar,bBoton;
    JLabel etqNome,etqPassword;
    JTextField lTextNome,lTextPassword;
    JTextArea aTextArea;
    
    public void iniciar(){
        //Instanciamos as compoñentes
        marco=new JFrame("Marco con compoñentes");
        panel1 =new JPanel ();
        panel2 =new JPanel ();
        bLimpar=new JButton("Limpar");
        bPremer=new JButton("Premer");
        bBoton=new JButton("Boton");
        lTextNome =new JTextField();
        lTextPassword =new JTextField();
        etqNome= new JLabel("Nome: ");
        etqPassword= new JLabel("Password: ");
        aTextArea =new JTextArea();
        
        //caracteristicas das compoñentes
        panel1.setSize(300,400);
        panel2.setSize(300,400);
        panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        marco.setSize(800, 800);
        marco.setLocationRelativeTo(null);
        marco.setLayout(new BorderLayout());
        marco.add(panel1,BorderLayout.NORTH);
        marco.add(panel2,BorderLayout.SOUTH);
        
        marco.add(panel1);
        marco.add(panel2);
        
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
