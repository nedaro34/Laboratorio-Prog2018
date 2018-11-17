/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jFrame;

import caja.Ingresar_Pago;
import caja.Primer_Pago;
import javax.swing.JOptionPane;
import paneles.CambiaPanel;



/**
 *
 * @author Administrador
 */
public class jPago extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public jPago() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMenu = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel_Caja = new javax.swing.JPanel();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons_menu.png"))); // NOI18N
        jLabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons_delete.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons_expand.png"))); // NOI18N
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pago");
        jPanelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, -1));

        jButton2.setText("Registro Pago");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, -1));

        jButton4.setText("Ingresar Pago");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, -1));

        jPanel1.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 50, 170, 260));

        jPanel_Caja.setLayout(new javax.swing.BoxLayout(jPanel_Caja, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(jPanel_Caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -500, 900, 440));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        try{
            //crea una variable para la opcion
            int dialogButton = JOptionPane.YES_NO_OPTION;
            //muestra el mensaje
            int result = JOptionPane.showConfirmDialog(null,"Desea Cerrar el Systema","Salir",dialogButton);
            //pregunta si rusult == si
            if(result == 0){
                //Sale del sistema
                System.exit(0);
            }
            //para los errores que salen
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        this.setState(jFrame.jLogin.ICONIFIED);
        //Minimiza la ventana
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseClicked

        int posicion = this.jPanelMenu.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -170, 2, 2, jPanelMenu);
        }else{
            Animacion.Animacion.mover_derecha(-170, 0, 2, 2, jPanelMenu);
        }
    }//GEN-LAST:event_jLabelMenuMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CambiaPanel(jPanel_Caja,new Primer_Pago());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jInicio a = new jInicio();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new CambiaPanel(jPanel_Caja,new Ingresar_Pago());
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanel_Caja;
    // End of variables declaration//GEN-END:variables
}
