/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.Afiliados;
import principal.CentroClinicaMedica;
import principal.Fecha;
import principal.GrupoFamiliar;
import principal.ListaVaciaExcepcion;

/**
 *
 * @author Administrador
 */
public class Modificar_Familiar extends javax.swing.JPanel {
    DateFormat fecha = DateFormat.getDateInstance();
    /**
     * Creates new form Ingresar_Afiliado
     */
    public Modificar_Familiar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_documento = new javax.swing.JTextField();
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_direccioncorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField_dniafiliado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField_fecha = new javax.swing.JTextField();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Direccion :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Documento :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telefono :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Direccion Correo :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 30));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 210, -1));
        add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, -1));
        add(jTextField_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, -1));
        add(jTextField_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Numero de Documento :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nueva Fecha de Nacimiento :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 400, 30));
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("DNI Afiliado :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 100, 30));
        add(jTextField_direccioncorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 210, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Nombre :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        jTextField_dniafiliado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_dniafiliadoKeyTyped(evt);
            }
        });
        add(jTextField_dniafiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 140, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Actual Fecha de Nacimiento :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 400, 30));

        jTextField_fecha.setText("jTextField1");
        add(jTextField_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 150, -1));
        add(jDateChooser_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          try{
            // dni a buscar
            int dni = Integer.parseInt(jTextField2.getText());
            
            //asede a listas
            
            CentroClinicaMedica centro = new CentroClinicaMedica();
            
            GrupoFamiliar familiar= centro.Buscar_Familiar(dni);
            
            
            //muestra los datos   
            jTextField_apellido.setText(familiar.getApellido());
            jTextField_direccioncorreo.setText(familiar.getDireccionCorreo());
            jTextField_documento.setText(String.valueOf(familiar.getDocumento()));
            jTextField_direccion.setText(familiar.getDireccion());
            jTextField_telefono.setText(familiar.getTelefono());
            jTextField_nombre.setText(familiar.getNombre());
            jTextField_fecha.setText(familiar.getFechadenacimiento());
            int dniafiliado = familiar.getAfiliado().getDocumento();
            jTextField_dniafiliado.setText(String.valueOf(dniafiliado));

            //aca se va a realizar
           
        }catch(NumberFormatException a){
            //exepcion limpia los campos
            //aca registra campos vacios
            JOptionPane.showMessageDialog(null,"Faltan Campos ");
            jTextField_apellido.setText("");
            jTextField_direccion.setText("");
            jTextField_direccioncorreo.setText("");
            jTextField_documento.setText("");
            jTextField_nombre.setText("");
            jTextField_telefono.setText("");
       } 
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         try{
            
            CentroClinicaMedica centro = new CentroClinicaMedica();
            
            String apellido = jTextField_apellido.getText();
            String direccion = jTextField_direccion.getText();
            String correo = jTextField_direccioncorreo.getText();
            int dni = Integer.parseInt(jTextField_documento.getText());
            String nombre = jTextField_nombre.getText();
            String telefono = jTextField_telefono.getText();
            int dnia = Integer.parseInt(jTextField_dniafiliado.getText());
            String fecha_nacimiento = fecha.format(jDateChooser_fecha.getDate());
            Afiliados afiliado = centro.Buscar_Afiliado(dni);
                
            GrupoFamiliar familiar = new GrupoFamiliar(afiliado,nombre,apellido,direccion,fecha_nacimiento,dni,telefono,correo);
            
            centro.Modificar_Familiar(familiar, dni);


       }catch(NumberFormatException e){
           
            JOptionPane.showMessageDialog(null, "Falta Campos");
            jTextField_apellido.setText("");
            jTextField_direccion.setText("");
            jTextField_direccioncorreo.setText("");
            jTextField_documento.setText("");
            jTextField_nombre.setText("");
            jTextField_telefono.setText("");
            
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_dniafiliadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_dniafiliadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dniafiliadoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_direccioncorreo;
    private javax.swing.JTextField jTextField_dniafiliado;
    private javax.swing.JTextField jTextField_documento;
    private javax.swing.JTextField jTextField_fecha;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
