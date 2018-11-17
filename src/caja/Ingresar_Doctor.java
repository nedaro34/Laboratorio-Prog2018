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
import principal.Doctores;
import principal.DoctoresIgualExcepcion;
import principal.Fecha;

/**
 *
 * @author alumno
 */
public class Ingresar_Doctor extends javax.swing.JPanel {
    DateFormat fecha = DateFormat.getDateInstance();
    /**
     * Creates new form Ingresar_Doctor
     */
    public Ingresar_Doctor() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_documento = new javax.swing.JTextField();
        jTextField_telefono = new javax.swing.JTextField();
        jTextField_direccioncorreo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha de Nacimiento ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 120, 43));

        jLabel2.setText("Apellido");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 101, 73, 44));

        jLabel3.setText("Direccion");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 151, 73, 56));

        jLabel4.setText("Documento");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 213, 100, 42));

        jLabel5.setText("Telefono");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 291, 79, 37));

        jLabel6.setText("Direccion Correo");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 346, -1, 22));

        jTextField_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreActionPerformed(evt);
            }
        });
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 63, 154, -1));
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 113, 154, -1));
        add(jTextField_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 169, 154, -1));
        add(jTextField_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 224, 154, -1));
        add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 299, 154, -1));
        add(jTextField_direccioncorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 347, 162, -1));

        jButton3.setText("Ingresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 386, -1, -1));
        add(jDateChooser_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 140, -1));

        jLabel10.setText("Nombre");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, 89, 43));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
                
                Doctores Doctor = new Doctores(nombre,apellido,direccion,fecha,dni,telefono,correo);
                
                //ingresa al metodo para agregar nueva objeto a la lista

                centro.Ingresar_Doctores(Doctor, dni);
 
  
       }catch(DoctoresIgualExcepcion l){
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
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_direccioncorreo;
    private javax.swing.JTextField jTextField_documento;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
