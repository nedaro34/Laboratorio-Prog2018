/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.CentroClinicaMedica;
import principal.Registro;
import principal.Registro_IgualExcepcion;
import principal.Solicitud;

/**
 *
 * @author TAPIA
 */
public class Resultado extends javax.swing.JPanel {

    /**
     * Creates new form Registrar
     */
    public Resultado() {
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
        jTextField_paciente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_diagnostico = new javax.swing.JTextField();
        jTextField_atencion = new javax.swing.JTextField();
        jTextField_hora = new javax.swing.JTextField();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jTextField_doctor = new javax.swing.JTextField();
        jTextField_fecha = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Paciente :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 20));
        add(jTextField_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 150, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 110, -1));

        jLabel2.setText("Hora :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 60, 20));

        jLabel3.setText("Nombre :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 20));

        jLabel4.setText("Apellido :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 20));

        jLabel5.setText("Doctor :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 20));

        jLabel6.setText("Diagnostico :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 20));

        jLabel7.setText("Atencion :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 60, 20));

        jLabel8.setText("Fecha :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, 20));
        add(jTextField_diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 140, 20));
        add(jTextField_atencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 140, -1));

        jTextField_hora.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_hora.setEnabled(false);
        jTextField_hora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_horaKeyTyped(evt);
            }
        });
        add(jTextField_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 160, -1));

        jTextField_nombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_nombre.setEnabled(false);
        jTextField_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_nombreKeyTyped(evt);
            }
        });
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 160, -1));

        jTextField_apellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_apellido.setEnabled(false);
        jTextField_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_apellidoKeyTyped(evt);
            }
        });
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 160, -1));

        jTextField_doctor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_doctor.setEnabled(false);
        jTextField_doctor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_doctorKeyTyped(evt);
            }
        });
        add(jTextField_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 160, -1));

        jTextField_fecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_fecha.setEnabled(false);
        jTextField_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_fechaKeyTyped(evt);
            }
        });
        add(jTextField_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, -1));

        jButton2.setText("Registar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_horaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_horaKeyTyped

    }//GEN-LAST:event_jTextField_horaKeyTyped

    private void jTextField_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreKeyTyped

    private void jTextField_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_apellidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellidoKeyTyped

    private void jTextField_doctorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_doctorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_doctorKeyTyped

    private void jTextField_fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_fechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fechaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = String.valueOf(dateFormat);
        String hora = String.valueOf(hourFormat);
        CentroClinicaMedica centro = new CentroClinicaMedica();
        int dni= Integer.parseInt(jTextField_paciente.getText());
        Solicitud nuevo = centro.Buscar_Solicitud(dni);
        jTextField_nombre.setText(nuevo.getNombre());
        jTextField_apellido.setText(nuevo.getAfiliado().getApellido());
        jTextField_doctor.setText(nuevo.getDoctor().getNombre());
        jTextField_fecha.setText(fecha);
        jTextField_hora.setText(hora);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CentroClinicaMedica centro = new CentroClinicaMedica();
        String nombre = jTextField_nombre.getText();
        String atencion = jTextField_atencion.getText();
        String diagnostico = jTextField_diagnostico.getText();
        String apellido = jTextField_apellido.getText();
        String doctor = jTextField_doctor.getText();
        String fecha = jTextField_fecha.getText();
        String hora = jTextField_hora.getText();
        int dni = Integer.parseInt(jTextField_paciente.getText());
        Registro reg = new Registro(nombre,apellido,dni,doctor,diagnostico,atencion,fecha,hora);
        try {
            centro.Ingresar_Resultado(reg, dni);
        } catch (Registro_IgualExcepcion ex) {
           
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_atencion;
    private javax.swing.JTextField jTextField_diagnostico;
    private javax.swing.JTextField jTextField_doctor;
    private javax.swing.JTextField jTextField_fecha;
    private javax.swing.JTextField jTextField_hora;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_paciente;
    // End of variables declaration//GEN-END:variables
}