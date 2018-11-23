/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.CentroClinicaMedica;
import principal.Choferes;
import principal.ChoferesNoExisteExcepcion;
import principal.DocumentoIncorrectoExcepcion;
import principal.ListaVaciaExcepcion;

/**
 *
 * @author Administrador
 */
public class EliminarChofer extends javax.swing.JPanel {

    /**
     * Creates new form Ingresar_Afiliado
     */
    public EliminarChofer() {
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
        jTextField_dni = new javax.swing.JTextField();
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
        jTextField_fecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_resultado = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Dirección :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Documento :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Teléfono :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Dirección Correo :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 130, 20));
        add(jTextField_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 220, -1));
        add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 320, -1));
        add(jTextField_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 300, -1));
        add(jTextField_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 320, -1));
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 330, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Número de Documento :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 160, 20));
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 330, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nombre :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 20));
        add(jTextField_direccioncorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 270, -1));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 140, 20));

        jButton2.setText("Buscar Chofer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 140, 20));
        add(jTextField_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 200, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eliminar Chofer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Resultado :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 80, 20));

        jTextField_resultado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_resultado.setEnabled(false);
        jTextField_resultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_resultadoKeyTyped(evt);
            }
        });
        add(jTextField_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            try{
            CentroClinicaMedica centro = new CentroClinicaMedica();
            
            
            int dni = Integer.parseInt(jTextField_dni.getText());
            centro.EliminarChofer(dni);
           
            

        }catch(DocumentoIncorrectoExcepcion e){
           
            
        }catch(ListaVaciaExcepcion e){
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_resultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_resultadoKeyTyped

    }//GEN-LAST:event_jTextField_resultadoKeyTyped

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_direccioncorreo;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_documento;
    private javax.swing.JTextField jTextField_fecha;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_resultado;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
