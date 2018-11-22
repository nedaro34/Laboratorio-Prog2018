/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.AfiliadoNoExistenteExcepcion;
import principal.Afiliados;
import principal.CentroClinicaMedica;
import principal.DocumentoIncorrectoExcepcion;
import principal.ListaVaciaExcepcion;

/**
 *
 * @author Administrador
 */
public class Eliminar_Afiliado extends javax.swing.JPanel {

    /**
     * Creates new form Ingresar_Afiliado
     */
    public Eliminar_Afiliado() {
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
        jTextField_direccion = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_correo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField_documento = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField_Fecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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
        add(jTextField_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 210, -1));
        add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, -1));
        add(jTextField_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Numero de Documento :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 400, 30));
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nombre :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));
        add(jTextField_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 210, -1));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 140, -1));
        add(jTextField_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 120, -1));
        add(jTextField_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Eliminar Afiliados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 130, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            CentroClinicaMedica centro = new CentroClinicaMedica();
            
            
            int dni = Integer.parseInt(jTextField_dni.getText());
            centro.EliminarAfiliado(dni);
           
            

        }catch(DocumentoIncorrectoExcepcion e){
           
            
        }catch(ListaVaciaExcepcion e){
            
            
        }
            
            
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //camptura de exepciones
        try{
            // dni a buscar
            int dni = Integer.parseInt(jTextField_dni.getText());
            
            //asede a listas
            
            CentroClinicaMedica centro = new CentroClinicaMedica();
            
            Afiliados afiliado = centro.BuscarAfiliado(dni);
            
            
            //muestra los datos   
            jTextField_apellido.setText(afiliado.getApellido());
            jTextField_correo.setText(afiliado.getDireccionCorreo());
            jTextField_documento.setText(String.valueOf(afiliado.getDocumento()));
            jTextField_direccion.setText(afiliado.getDireccion());
            jTextField_telefono.setText(afiliado.getTelefono());
            jTextField_nombre.setText(afiliado.getNombre());
            jTextField_Fecha.setText(afiliado.getFechadenacimiento());

            
           
        }catch(NumberFormatException a){
            //exepcion limpia los campos
            JOptionPane.showMessageDialog(null,"Faltan Campos ");
            jTextField_apellido.setText("");
            jTextField_direccion.setText("");
            jTextField_correo.setText("");
            jTextField_documento.setText("");
            jTextField_nombre.setText("");
            jTextField_telefono.setText("");
       } catch (AfiliadoNoExistenteExcepcion ex) { 
            Logger.getLogger(Eliminar_Afiliado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListaVaciaExcepcion ex) {
            Logger.getLogger(Eliminar_Afiliado.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_Fecha;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_documento;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
