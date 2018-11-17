/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Afiliado_Pago_Igual_Excepcion;
import principal.Afiliados;
import principal.CentroClinicaMedica;
import principal.Pago_mes_Igual_Excepcion;
import principal.RegistroPago;

/**
 *
 * @author TAPIA
 */
public class Primer_Pago extends javax.swing.JPanel {

    /**
     * Creates new form Primer_Pago
     */
    public Primer_Pago() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_pago = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jTextField_dni = new javax.swing.JTextField();
        jTextField_año = new javax.swing.JTextField();
        jTextField_pricio = new javax.swing.JTextField();
        jTextField_familia = new javax.swing.JTextField();
        jComboBox_mes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Numero De Familiar :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellido :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Documento :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Mes :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Año :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 30));
        add(jTextField_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Pago :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Precio Base :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Precio Base :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 30));
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 160, -1));
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, -1));
        add(jTextField_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, -1));
        add(jTextField_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 160, -1));
        add(jTextField_pricio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 160, -1));
        add(jTextField_familia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 30, -1));

        jComboBox_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBox_mes.setSelectedIndex(-1);
        add(jComboBox_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CentroClinicaMedica centro = new CentroClinicaMedica();
        String apelliado = jTextField_apellido.getText();
        int año = Integer.parseInt(jTextField_año.getText());
        int dni = Integer.parseInt(jTextField_dni.getText());
        String nombre = jTextField_nombre.getText();
        int pago = Integer.parseInt(jTextField_pago.getText());
        int preci_base = Integer.parseInt(jTextField_pricio.getText());
        Afiliados afiliado = centro.Buscar_Afiliado(dni);
        int famili = afiliado.getFamilia();
        String mes = String.valueOf(jComboBox_mes.getSelectedIndex());
        
        RegistroPago primer = new RegistroPago(nombre,apelliado,dni,año,preci_base,famili,afiliado);
        
        try {
            primer.Ingresar_Mes(mes);
            centro.Registar_pago(primer, dni);
        } catch (Afiliado_Pago_Igual_Excepcion ex) {
            
        } catch (Pago_mes_Igual_Excepcion ex) {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_mes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_año;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_familia;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_pago;
    private javax.swing.JTextField jTextField_pricio;
    // End of variables declaration//GEN-END:variables
}
