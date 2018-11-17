/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import principal.CentroClinicaMedica;
import principal.Moviles;
import principal.MovilesIgualExcepcion;

/**
 *
 * @author SALA3
 */
public class Eliminar_Moviles extends javax.swing.JPanel {

    /**
     * Creates new form Ingresar_Moviles
     */
    public Eliminar_Moviles() {
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
        jTextField_año = new javax.swing.JTextField();
        jTextField_Marca = new javax.swing.JTextField();
        jTextField_Modelo = new javax.swing.JTextField();
        jTextField_patente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField_Patente = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Año :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 104, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Marca :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 104, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Modelo :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 104, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Patente :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 104, 26));
        add(jTextField_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 180, 30));
        add(jTextField_Marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 30));
        add(jTextField_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 180, 30));
        add(jTextField_patente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 180, 30));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, -1));
        add(jTextField_Patente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 32, 330, 30));

        jButton2.setText("Buscar");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CentroClinicaMedica centro = new CentroClinicaMedica();
        String marca = jTextField_Marca.getText();
        String modelo = jTextField_Modelo.getText();
        String patente = jTextField_patente.getText();
        int año = Integer.parseInt(jTextField_año.getText());
        Moviles movil = new Moviles(marca,modelo,año,patente);
        try {
            centro.Ingresar_Movil(movil, patente);
        } catch (MovilesIgualExcepcion ex) {
            
        }catch(NumberFormatException a){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField_Marca;
    private javax.swing.JTextField jTextField_Modelo;
    private javax.swing.JTextField jTextField_Patente;
    private javax.swing.JTextField jTextField_año;
    private javax.swing.JTextField jTextField_patente;
    // End of variables declaration//GEN-END:variables
}
