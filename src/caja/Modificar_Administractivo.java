/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import javax.swing.JOptionPane;
import principal.Administrativos;
import principal.Afiliados;
import principal.CentroClinicaMedica;

/**
 *
 * @author Administrador
 */
public class Modificar_Administractivo extends javax.swing.JPanel {

    /**
     * Creates new form Ingresar_Afiliado
     */
    public Modificar_Administractivo() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_año = new javax.swing.JTextField();
        jTextField_dni = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_documento = new javax.swing.JTextField();
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_dia = new javax.swing.JTextField();
        jTextField_mes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_direccioncorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Año:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 40, 30));

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
        add(jTextField_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 60, -1));
        add(jTextField_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 210, -1));
        add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, -1));
        add(jTextField_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, -1));
        add(jTextField_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Numero de Documento :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 400, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Dia:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 30, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Mes:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 40, 30));
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, -1));
        add(jTextField_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 60, -1));
        add(jTextField_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 60, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nombre :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));
        add(jTextField_direccioncorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 210, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          try{
            // dni a buscar
            int dni = Integer.parseInt(jTextField_dni.getText());
            
            //asede a listas
            
            CentroClinicaMedica centro = new CentroClinicaMedica();
            
            Administrativos administrativo = centro.Buscar_Administrativos(dni);
            
            
            //muestra los datos   
            jTextField_apellido.setText(administrativo.getApellido());
            jTextField_año.setText(String.valueOf(administrativo.getFechadenacimiento().getAño()));
            jTextField_direccioncorreo.setText(administrativo.getDireccionCorreo());
            jTextField_documento.setText(String.valueOf(administrativo.getDocumento()));
            jTextField_direccion.setText(administrativo.getDireccion());
            jTextField_telefono.setText(administrativo.getTelefono());
            jTextField_nombre.setText(administrativo.getNombre());
            jTextField_dia.setText(String.valueOf(administrativo.getFechadenacimiento().getDia()));
            jTextField_mes.setText(String.valueOf(administrativo.getFechadenacimiento().getMes()));
            jTextField_año.setText(String.valueOf(administrativo.getFechadenacimiento().getAño()));

            
           
        }catch(NumberFormatException a){
            //exepcion limpia los campos
            JOptionPane.showConfirmDialog(null, "Falta Campos");
            jTextField_apellido.setText("");
            jTextField_año.setText("");
            jTextField_dia.setText("");
            jTextField_direccion.setText("");
            jTextField_direccioncorreo.setText("");
            jTextField_documento.setText("");
            jTextField_mes.setText("");
            jTextField_nombre.setText("");
            jTextField_telefono.setText("");
       } 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField_año;
    private javax.swing.JTextField jTextField_dia;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_direccioncorreo;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_documento;
    private javax.swing.JTextField jTextField_mes;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
