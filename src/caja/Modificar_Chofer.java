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
import principal.Choferes;
import principal.ChoferesNoExisteExcepcion;
import principal.Fecha;
import principal.ListaVaciaExcepcion;

/**
 *
 * @author Administrador
 */
public class Modificar_Chofer extends javax.swing.JPanel {
    DateFormat fecha = DateFormat.getDateInstance();
    /**
     * Creates new form Ingresar_Afiliado
     */
    public Modificar_Chofer() {
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
        jTextField_fecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Direccion :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Documento :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 90, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telefono :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Direccion Correo :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 130, 20));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 220, -1));
        add(jTextField_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 320, -1));
        add(jTextField_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 300, -1));
        add(jTextField_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 320, -1));
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 330, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Numero de Documento :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 180, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nueva Fecha de Nacimiento :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 210, 20));
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 330, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Nombre :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 20));
        add(jTextField_direccioncorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 270, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 140, 20));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 140, 20));
        add(jTextField_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Actual Fecha de Nacimiento :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 210, 20));
        add(jDateChooser_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 150, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Chofer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 910, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
             //camptura de exepciones
        try{
            // dni a buscar
            int dni = Integer.parseInt(jTextField2.getText());
            
            //asede a listas
            
            CentroClinicaMedica centro = new CentroClinicaMedica();
            
            Choferes chofer= centro.BuscarChofer(dni);
            
            
            //muestra los datos   
            jTextField_apellido.setText(chofer.getApellido());
            jTextField_direccioncorreo.setText(chofer.getDireccionCorreo());
            jTextField_documento.setText(String.valueOf(chofer.getDocumento()));
            jTextField_direccion.setText(chofer.getDireccion());
            jTextField_telefono.setText(chofer.getTelefono());
            jTextField_nombre.setText(chofer.getNombre());
            jTextField_fecha.setText(chofer.getFechadenacimiento());

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
       } catch (ListaVaciaExcepcion ex) { 
            Logger.getLogger(Modificar_Chofer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ChoferesNoExisteExcepcion ex) {
            Logger.getLogger(Modificar_Chofer.class.getName()).log(Level.SEVERE, null, ex);
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
            String fecha_nacimiento = fecha.format(jDateChooser_fecha.getDate());
                
            Choferes chofer = new Choferes(nombre,apellido,direccion,fecha_nacimiento,dni,telefono,correo);
            
            centro.ModificarChofer(chofer, dni);


       }catch(NumberFormatException e){
           
            JOptionPane.showMessageDialog(null,"Faltan Campos ");
            jTextField_apellido.setText("");

            jTextField_direccion.setText("");
            jTextField_direccioncorreo.setText("");
            jTextField_documento.setText("");
            jTextField_nombre.setText("");
            jTextField_telefono.setText("");
            
       } catch (ListaVaciaExcepcion ex) {
            JOptionPane.showMessageDialog(null, "La lista est5a vacia");
           
// Logger.getLogger(Modificar_Chofer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ChoferesNoExisteExcepcion ex) {
          
            JOptionPane.showMessageDialog(null, "El Chofer no existe");

//  Logger.getLogger(Modificar_Chofer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

                                      
                                    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField jTextField_documento;
    private javax.swing.JTextField jTextField_fecha;
    private javax.swing.JTextField jTextField_nombre;
    private javax.swing.JTextField jTextField_telefono;
    // End of variables declaration//GEN-END:variables
}
