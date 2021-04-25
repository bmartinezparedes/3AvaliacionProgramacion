/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.braiskiskos;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
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
    JPanel panel1,panel2,panel3;
    JButton bPremer,bLimpar,bBoton;
    JLabel etqNome,etqPassword;
    JTextField lTextNome,lTextPassword;
    JTextArea aTextArea,aTextList;
    
    public void iniciar(){
        //Instanciamos as compoñentes
        marco=new JFrame("Marco con compoñentes");
        panel1 =new JPanel ();
        panel2 =new JPanel ();
        panel3 =new JPanel ();
        bLimpar=new JButton("Limpar");
        bPremer=new JButton("Premer");
        bBoton=new JButton("Boton");
        lTextNome =new JTextField();
        lTextPassword =new JTextField();
        etqNome= new JLabel("Nome: ");
        etqPassword= new JLabel("Password: ");
        aTextArea =new JTextArea();
        aTextList =new JTextArea();
         //damoslle as caracteristicas a os componentes

        marco.setSize(700, 700);
        panel1.setBounds(0, 0, 700, 350);
        panel2.setBounds(0, 350, 700, 350);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel1.setLayout(null);//anulamos o layout do panel
        panel2.setLayout(null);


        aTextList.setText("ElementoLista1 \nElementoLista2 \nElementoLista3");
        bLimpar.setBounds(500, 275, 100, 50);
        bPremer.setBounds(200, 275, 100, 50);
        bBoton.setBounds(300, 100, 100, 50);
        lTextNome.setBounds(200, 50, 400, 50);
        lTextPassword.setBounds(200, 200, 400, 50);
        aTextList.setBounds(50, 20, 200, 300);
        aTextList.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        aTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        aTextArea.setBackground(Color.pink);
        aTextArea.setBounds(450, 20, 200, 300);
        etqNome.setBounds(50, 25, 50, 100);
        etqPassword.setBounds(50, 175, 100, 100);

        //engadimos compoñentes

        panel1.add(etqNome);
        panel1.add(etqPassword);
        panel1.add(lTextNome);
        panel1.add(lTextPassword);
        panel1.add(bPremer);
        panel1.add(bLimpar);
        panel2.add(aTextArea);
        panel2.add(bBoton);
        panel2.add(aTextList);
        
        marco.add(panel1);
        marco.add(panel2);
        marco.add(panel3);
        
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
