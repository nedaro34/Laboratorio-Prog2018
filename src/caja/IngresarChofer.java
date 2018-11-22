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
import principal.AfiliadosDIgualExcepcion;
import principal.CentroClinicaMedica;
import principal.Choferes;
import principal.ChoferesIgualExcepcion;
import principal.Fecha;
import principal.verificar_documentosExcepcion;

/**
 *
 * @author Administrador
 */
public class IngresarChofer extends javax.swing.JPanel {
    DateFormat fecha = DateFormat.getDateInstance();
    /**
     * Creates new form Ingresar_Afiliado
     */
    public IngresarChofer() {
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
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Dirección :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 80, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Documento :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telefono :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 80, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Dirección Correo :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 20));
        add(jTextField_direccioncorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 270, -1));
        add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 320, -1));
        add(jTextField_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 300, -1));
        add(jTextField_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 320, -1));
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 330, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nombre :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 70, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 160, 20));
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 330, -1));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));
        add(jDateChooser_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 200, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar Chofer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 920, 50));
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
                int longitud = jTextField_documento.getText().length();
                centro.verificar_documentos(dni, longitud);
                // fecha de nacimiento
                

                
                // Creacion Ojeto Afiliado
                
                Choferes chofer = new Choferes(nombre,apellido,direccion,fecha_nacimiento,dni,telefono,correo);
                
                //ingresa al metodo para agregar nueva objeto a la lista

                centro.Ingresar_Choferes(chofer, dni);
 
  
       }catch(ChoferesIgualExcepcion l){
            //hay que ver de hacer una nueva excepcion
           //exepcion afiliado con el mismo documento
            JOptionPane.showMessageDialog(null,"EL Chofer ya existe  ");
            jTextField_documento.setText("");
            
        }catch(NumberFormatException a){
            //exepcion limpia los campos
            JOptionPane.showMessageDialog(null, "Falta Campos");
            jTextField_apellido.setText("");
            jTextField_direccion.setText("");
            jTextField_direccioncorreo.setText("");
            jTextField_documento.setText("");
            jTextField_nombre.setText("");
            jTextField_telefono.setText("");
       } catch (verificar_documentosExcepcion ex) { 
            Logger.getLogger(IngresarChofer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private javax.swing.JLabel jLabel1;
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
