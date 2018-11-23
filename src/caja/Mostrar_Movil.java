/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.CentroClinicaMedica;
import principal.ListaVaciaExcepcion;
import principal.Moviles;


/**
 *
 * @author TAPIA
 */
public class Mostrar_Movil extends javax.swing.JPanel {
    LinkedList<Moviles>listar = new LinkedList<Moviles>();
    /**
     * Creates new form Mostrar_Afiliados
     */
    public Mostrar_Movil() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_afiiliado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_afiiliado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Patente", "Año", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable_afiiliado);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 323));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        CentroClinicaMedica centro = new CentroClinicaMedica();
        try {
            listar = centro.MostrarMovil();
        } catch (ListaVaciaExcepcion ex) {
            Logger.getLogger(Mostrar_Movil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        mostrar();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void mostrar(){
        String matriz[][] = new String[listar.size()][7];
        for (int i =0;i<listar.size();i++){
            matriz[i][0]=listar.get(i).getMarca();
            matriz[i][1] = listar.get(i).getModelo();
            matriz[i][2] = listar.get(i).getPatente();
            matriz[i][3] = String.valueOf(listar.get(i).getAño());
            matriz[i][4] = listar.get(i).getEstado();
            
        }
        jTable_afiiliado.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Marca", "Modelo", "Patente","Año", "Estado", "", "", "",
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_afiiliado;
    // End of variables declaration//GEN-END:variables
}
