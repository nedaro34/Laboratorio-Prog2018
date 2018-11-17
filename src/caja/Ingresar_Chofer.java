/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.text.DateFormat;
import javax.swing.JOptionPane;
import principal.AfiliadosDIgualExcepcion;
import principal.CentroClinicaMedica;
import principal.Choferes;
import principal.ChoferesIgualExcepcion;
import principal.Fecha;

/**
 *
 * @author Administrador
 */
public class Ingresar_Chofer extends javax.swing.JPanel {
    DateFormat fecha = DateFormat.getDateInstance();
    /**
     * Creates new form Ingresar_Afiliado
     */
    public Ingresar_Chofer() {
        initComponents();
    }
     ///
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
        jTextField_direccioncorreo = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_documento = new javax.swing.JTextField();
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Direccion :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Documento :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telefono :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Direccion Correo :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 30));
        add(jTextField_direccioncorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 210, -1));
        add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 210, -1));
        add(jTextField_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, -1));
        add(jTextField_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, -1));
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nombre :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 400, 30));
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 210, -1));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));
        add(jDateChooser_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           
        try{
            
                //asede a las listas
                CentroClinicaMedica centro = new CentroClinicaMedica();
                
                // guarda los campo agregado por la ventana
                
                String apellido = jTextField_apellido.getText();
                String direccion = jTextField_direccion.getText();
                String correo = jTextField_direccioncorreo.getText();
                int dni = Integer.parseInt(jTextField_documento.getText());
                String nombre = jTextField_nombre.getText();
                String telefono = jTextField_telefono.getText();
                String fecha_nacimiento = fecha.format(jDateChooser_fecha.getDate());
                
                // fecha de nacimiento
                
                Fecha fecha = new Fecha(2,3,45);
                
                // Creacion Ojeto Afiliado
                
                Choferes chofer = new Choferes(nombre,apellido,direccion,fecha,dni,telefono,correo);
                
                //ingresa al metodo para agregar nueva objeto a la lista

                centro.Ingresar_Choferes(chofer, dni);
 
  
       }catch(ChoferesIgualExcepcion l){
            //hay que ver de hacer una nueva excepcion
           //exepcion afiliado con el mismo documento
           JOptionPane.showConfirmDialog(null, "Ya existe un afiliado con este documento");
            jTextField_documento.setText("");
            
        }catch(NumberFormatException a){
            //exepcion limpia los campos
            JOptionPane.showConfirmDialog(null, "Falta Campos");
            jTextField_apellido.setText("");
            jTextField_direccion.setText("");
            jTextField_direccioncorreo.setText("");
            jTextField_documento.setText("");
            jTextField_nombre.setText("");
            jTextField_telefono.setText("");
       } 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha;
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
    private javax.swing.JTextField jTextField_documento;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
