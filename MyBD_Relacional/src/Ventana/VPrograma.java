/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class VPrograma extends javax.swing.JFrame {
    DefaultTableModel model=new DefaultTableModel();
    /**
     * Creates new form VPrograma
     */
    public VPrograma() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/juegos","root","");
            PreparedStatement pst=cn.prepareStatement("select ID,nombre,tematica,precio from juegos");
            
            ResultSet rs=pst.executeQuery();
            tabla=new javax.swing.JTable(model);
            jScrollPane1.setViewportView(tabla);
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Tematica");
            model.addColumn("Precio");
            
            while(rs.next()){
                Object[]fila =new Object[4];
                
                for (int i = 0; i < 4; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                model.addRow(fila);
            }
            cn.close();
            
        } catch (SQLException e) {
            System.err.println("ERROR llenar tabla "+e);
            JOptionPane.showMessageDialog(null, "Error al mostrar informacion en la tabla");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        etqPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        comboTematica = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        bIntroducir = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        etqEstatus = new javax.swing.JLabel();
        txtNombreCambiar = new javax.swing.JTextField();
        txtIDCambiar = new javax.swing.JTextField();
        etqNombre2 = new javax.swing.JLabel();
        etqNombre3 = new javax.swing.JLabel();
        txtPrecioCambiar = new javax.swing.JTextField();
        etqPrecio2 = new javax.swing.JLabel();
        etqEstatus2 = new javax.swing.JLabel();
        bActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etqNombre.setText("Nombre:");

        etqPrecio.setText("Precio:");

        comboTematica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shoter", "MMO", "Estrategia", "Educativo" }));
        comboTematica.setToolTipText("");

        jLabel1.setText("Tematica:");

        bIntroducir.setBackground(new java.awt.Color(0, 153, 0));
        bIntroducir.setText("Introducir");
        bIntroducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIntroducirActionPerformed(evt);
            }
        });

        bBorrar.setBackground(new java.awt.Color(255, 0, 0));
        bBorrar.setText("Borrar");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etqEstatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        etqNombre2.setText("Nombre:");

        etqNombre3.setText("ID:");

        etqPrecio2.setText("Precio:");

        etqEstatus2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bActualizar.setBackground(new java.awt.Color(0, 255, 255));
        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(etqNombre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(etqPrecio)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(bIntroducir)
                                    .addGap(63, 63, 63)
                                    .addComponent(bActualizar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(bBorrar, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(etqEstatus)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqNombre2)
                            .addComponent(etqNombre3)
                            .addComponent(etqPrecio2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombreCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bModificar))
                            .addComponent(txtPrecioCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton1))
                    .addComponent(etqEstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(etqNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqPrecio)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIntroducir)
                    .addComponent(bBorrar)
                    .addComponent(bActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombre2)
                    .addComponent(bModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqPrecio2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(etqEstatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqEstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIntroducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIntroducirActionPerformed
        try{
            
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/juegos","root","");//ruta y nombre de la base de datos,nombre de BD,contraseña de la BD
            PreparedStatement pst=cn.prepareStatement("insert into juegos values(?,?,?,?)");
            
            pst.setString(1, "0");//columna-id que da igual por que lo pondra auto la BD
            pst.setString(2, txtNombre.getText().trim());//columna-nombre
            pst.setString(3, comboTematica.getSelectedItem().toString());//columna-tematica
            pst.setString(4, txtPrecio.getText().trim());//columna-precio
            
            pst.executeUpdate();//ejecuta las lineas que le mandaos a la BD
            
            txtNombre.setText("");
            txtPrecio.setText("");
            comboTematica.setSelectedIndex(0);
            etqEstatus2.setText("Registro exitoso");
            
        }catch(Exception e){
            System.out.println("ERROR introducir datos"+e.getLocalizedMessage()+"\n"+e.getMessage());
        }
    }//GEN-LAST:event_bIntroducirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/juegos","root","");//ruta y nombre de la base de datos,nombre de BD,contraseña de la BD
            PreparedStatement pst=cn.prepareStatement("select * from juegos where ID = ?");
            
            pst.setString(1, txtIDCambiar.getText().trim());
            
            ResultSet rs=pst.executeQuery();
            
            if(rs.next()){
                txtNombreCambiar.setText(rs.getString("nombre"));
                txtPrecioCambiar.setText(rs.getString("precio"));
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no registrado.");
                txtIDCambiar.setText("");
            }
            
        }catch(Exception e){
            System.out.println("ERROR buscar datos "+e.getLocalizedMessage()+"\n"+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
        
        try{
            String ID=txtIDCambiar.getText().trim();
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/juegos","root","");//ruta y nombre de la base de datos,nombre de BD,contraseña de la BD
            PreparedStatement pst=cn.prepareStatement("update juegos set nombre=?, tematica=?, precio=? where ID="+ID);
            
            pst.setString(1, txtNombreCambiar.getText().trim());
            pst.setString(2, comboTematica.getSelectedItem().toString());
            pst.setString(3, txtPrecioCambiar.getText().trim());
            
            pst.executeUpdate();
            txtIDCambiar.setText("");
            txtNombreCambiar.setText("");
            txtPrecioCambiar.setText("");
            comboTematica.setSelectedIndex(0);
            etqEstatus2.setText("Modificacion exitosa");
        }catch(Exception e){
            System.out.println("ERROR cambiar datos "+e.getLocalizedMessage()+"\n"+e.getMessage());
        }
    }//GEN-LAST:event_bModificarActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/juegos","root","");
            PreparedStatement pst=cn.prepareStatement("delete from juegos where ID=?");
            
            pst.setString(1,txtIDCambiar.getText().trim());
            pst.executeUpdate();
            txtIDCambiar.setText("");
            txtNombre.setText("");
            txtPrecio.setText("");
            txtNombreCambiar.setText("");
            txtPrecioCambiar.setText("");
            comboTematica.setSelectedIndex(0);
            etqEstatus2.setText("Borrado exitosamente");
        }catch(Exception e){
            System.out.println("ERROR borrar datos "+e.getLocalizedMessage()+"\n"+e.getMessage());
        }
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        // TODO add your handling code here:
        tabla();
    }//GEN-LAST:event_bActualizarActionPerformed
    
    public void tabla(){
        try {
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/juegos","root","");
            PreparedStatement pst=cn.prepareStatement("select ID,nombre,tematica,precio from juegos");
            ResultSet rs=pst.executeQuery();
            tabla=new javax.swing.JTable(model);
            jScrollPane1.setViewportView(tabla);
            
            model.setRowCount(0);
            while(rs.next()){
                Object[]fila =new Object[4];
                
                for (int i = 0; i < 4; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                
                model.addRow(fila);
            }
            cn.close();
            
        } catch (SQLException e) {
            System.err.println("ERROR llenar tabla "+e);
            JOptionPane.showMessageDialog(null, "Error al mostrar informacion en la tabla");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bIntroducir;
    private javax.swing.JButton bModificar;
    private javax.swing.JComboBox<String> comboTematica;
    private javax.swing.JLabel etqEstatus;
    private javax.swing.JLabel etqEstatus2;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNombre2;
    private javax.swing.JLabel etqNombre3;
    private javax.swing.JLabel etqPrecio;
    private javax.swing.JLabel etqPrecio2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtIDCambiar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCambiar;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioCambiar;
    // End of variables declaration//GEN-END:variables
}