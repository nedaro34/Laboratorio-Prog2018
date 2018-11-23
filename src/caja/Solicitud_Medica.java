/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.AdministrativoNoExistenteExcepcion;
import principal.Administrativos;
import principal.AfiliadoNoExistenteExcepcion;
import principal.Afiliados;
import principal.CentroClinicaMedica;
import principal.Choferes;
import principal.ChoferesNoExisteExcepcion;
import principal.DoctorNoExistenteExcepcion;
import principal.Doctores;
import principal.EnfermeroNoExistenteExcepcion;
import principal.Enfermeros;
import principal.GrupoFamiliar;
import principal.ListaVaciaExcepcion;
import principal.MovilNoExistenteExcepcion;
import principal.Moviles;
import principal.RegistroPago;
import principal.Solicitud;

/**
 *
 * @author TAPIA
 */
public class Solicitud_Medica extends javax.swing.JPanel {

    /**
     * Creates new form Solicitud_Medica
     */
    public Solicitud_Medica() {
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

        jComboBox_dni = new javax.swing.JComboBox<>();
        jTextField_dni_solicitud = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField_mora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_dni_enfermero = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_dni_administrativo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_dni_chofer = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_patente = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jTextField_medico_dni = new javax.swing.JTextField();
        jTextField_result_movil = new javax.swing.JTextField();
        jTextField_result_medico = new javax.swing.JTextField();
        jTextField_result_enfermero = new javax.swing.JTextField();
        jTextField_result_administrativo = new javax.swing.JTextField();
        jTextField_result_chofer = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox_dni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afiliado", "Familiar" }));
        jComboBox_dni.setSelectedIndex(-1);
        add(jComboBox_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));
        add(jTextField_dni_solicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 100, -1));

        jTextField_mora.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_mora.setEnabled(false);
        jTextField_mora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_moraKeyTyped(evt);
            }
        });
        add(jTextField_mora, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 40, -1));

        jLabel1.setText("Mora");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 50, 20));

        jLabel2.setText("Medico Documento : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, 20));

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 110, -1));

        jLabel3.setText("Enfermero Documento : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, 20));
        add(jTextField_dni_enfermero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 150, -1));

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, -1));

        jLabel4.setText("Administrativo Documento : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 20));
        add(jTextField_dni_administrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 150, -1));

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 110, -1));

        jLabel5.setText("Chofer Documento : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 20));
        add(jTextField_dni_chofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, -1));

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 110, -1));

        jLabel6.setText("Movil Patente : ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 20));
        add(jTextField_patente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 150, -1));

        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 110, -1));
        add(jTextField_medico_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 150, -1));

        jTextField_result_movil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_result_movil.setEnabled(false);
        jTextField_result_movil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_result_movilKeyTyped(evt);
            }
        });
        add(jTextField_result_movil, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 160, -1));

        jTextField_result_medico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_result_medico.setEnabled(false);
        jTextField_result_medico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_result_medicoKeyTyped(evt);
            }
        });
        add(jTextField_result_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 160, -1));

        jTextField_result_enfermero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_result_enfermero.setEnabled(false);
        jTextField_result_enfermero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_result_enfermeroKeyTyped(evt);
            }
        });
        add(jTextField_result_enfermero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 160, -1));

        jTextField_result_administrativo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_result_administrativo.setEnabled(false);
        jTextField_result_administrativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_result_administrativoKeyTyped(evt);
            }
        });
        add(jTextField_result_administrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 160, -1));

        jTextField_result_chofer.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField_result_chofer.setEnabled(false);
        jTextField_result_chofer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_result_choferKeyTyped(evt);
            }
        });
        add(jTextField_result_chofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 160, -1));

        jButton7.setText("Registrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CentroClinicaMedica centro = new CentroClinicaMedica();
        int dni = Integer.parseInt(jTextField_dni_solicitud.getText());
        int opc = jComboBox_dni.getSelectedIndex();
        if(opc == 0){
            RegistroPago pago = centro.BuscarPago(dni);
            int mora = pago.mora();
            jTextField_mora.setText(String.valueOf(mora));
        }if(opc == 1){
            GrupoFamiliar familia = centro.BuscarFamiliar(dni);
            RegistroPago pago = centro.BuscarPago(familia.getAfiliado().getDocumento());
            int mora = pago.mora();
            jTextField_mora.setText(String.valueOf(mora));

         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_moraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_moraKeyTyped

    }//GEN-LAST:event_jTextField_moraKeyTyped

    private void jTextField_result_movilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_result_movilKeyTyped

    }//GEN-LAST:event_jTextField_result_movilKeyTyped

    private void jTextField_result_medicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_result_medicoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_result_medicoKeyTyped

    private void jTextField_result_enfermeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_result_enfermeroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_result_enfermeroKeyTyped

    private void jTextField_result_administrativoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_result_administrativoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_result_administrativoKeyTyped

    private void jTextField_result_choferKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_result_choferKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_result_choferKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        CentroClinicaMedica centro = new CentroClinicaMedica();
        int dni = Integer.parseInt(jTextField_medico_dni.getText());
        Doctores nuevo = centro.BuscarDoctor(dni);
        jTextField_result_medico.setText(nuevo.getNombre()+" "+nuevo.getApellido());
        //jTextField_result_medico.setText("Se Agrego con exito el Medico ");

        } catch (DoctorNoExistenteExcepcion ex) {
                         JOptionPane.showMessageDialog(null, "Doctor no existe  ");
           
//Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListaVaciaExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "La lista esta vacia");
            
//Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
        CentroClinicaMedica centro = new CentroClinicaMedica();
        int dni = Integer.parseInt(jTextField_dni_enfermero.getText());
        Enfermeros nuevo = centro.BuscarEnfermero(dni);
        jTextField_result_enfermero.setText(nuevo.getNombre()+" "+nuevo.getApellido());
       } catch (EnfermeroNoExistenteExcepcion ex) {
                                 JOptionPane.showMessageDialog(null, "Enfermero no existe");
 
           //Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListaVaciaExcepcion ex) {
                                    JOptionPane.showMessageDialog(null, "La lista esta vacia");

            //Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
        CentroClinicaMedica centro = new CentroClinicaMedica();
        int dni = Integer.parseInt(jTextField_dni_administrativo.getText());
        Administrativos nuevo = centro.BuscarAdministrativos(dni);
        jTextField_result_administrativo.setText(nuevo.getNombre()+" "+nuevo.getApellido());
        } catch (AdministrativoNoExistenteExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "El administrativo no existe");
         
//   Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListaVaciaExcepcion ex) {
                                    JOptionPane.showMessageDialog(null, "La lista esta vacia");

          //  Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try{
        CentroClinicaMedica centro = new CentroClinicaMedica();
        int dni = Integer.parseInt(jTextField_dni_chofer.getText());
        Choferes nuevo = centro.BuscarChofer(dni);
        jTextField_result_chofer.setText(nuevo.getNombre()+" "+nuevo.getApellido());
       } catch (ListaVaciaExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "La lista esta vacia");
            
//Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ChoferesNoExisteExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "El chofer no existe");
            
//Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try{
        CentroClinicaMedica centro = new CentroClinicaMedica();
        String patente = jTextField_patente.getText();
        Moviles nuevo = centro.BuscarMovil(patente);
       jTextField_result_movil.setText("El movil esta "+nuevo.getEstado());
       } catch (MovilNoExistenteExcepcion ex) {
                                   JOptionPane.showMessageDialog(null, "El movil no existe");

// Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListaVaciaExcepcion ex) {
                                    JOptionPane.showMessageDialog(null, "La lista esta vacia");

           // Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
        CentroClinicaMedica centro = new CentroClinicaMedica();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = "";
        String hora = "";
        int dni = Integer.parseInt(jTextField_dni_solicitud.getText());
        int dni_medico = Integer.parseInt(jTextField_medico_dni.getText());
        int dni_enfermero = Integer.parseInt(jTextField_dni_enfermero.getText());
        int dni_chofer = Integer.parseInt(jTextField_dni_chofer.getText());
        int dni_administrativo = Integer.parseInt(jTextField_dni_administrativo.getText());
        String patente = jTextField_patente.getText();
        Doctores medico = centro.BuscarDoctor(dni_medico);
        Enfermeros enfermero = centro.BuscarEnfermero(dni_enfermero);
        Choferes chofer = centro.BuscarChofer(dni_chofer);
        Administrativos administrativo = centro.BuscarAdministrativos(dni_administrativo);
        Moviles movil = centro.BuscarMovil(patente);
        
        int opc = jComboBox_dni.getSelectedIndex();
        if(opc == 0){
            Afiliados afiliado = centro.BuscarAfiliado(dni);
            String nombre = afiliado.getNombre();
            int documento = afiliado.getDocumento();
            Solicitud solicitud = new Solicitud(nombre,documento,fecha,hora,afiliado,medico,enfermero,chofer,administrativo,movil);
            centro.IngresarSolicitud(solicitud);
        }if(opc==1){
            GrupoFamiliar familia = centro.BuscarFamiliar(dni);
            Afiliados afiliado = centro.BuscarAfiliado(familia.getAfiliado().getDocumento());
            String nombre = familia.getNombre();
            int documento = familia.getDocumento();
            Solicitud solicitud = new Solicitud(nombre,documento,fecha,hora,afiliado,medico,enfermero,chofer,administrativo,movil);
            centro.IngresarSolicitud(solicitud);
         }
        } catch (DoctorNoExistenteExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "El registro no existe");

          //  Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListaVaciaExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "La lista esta vacia");

            //Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EnfermeroNoExistenteExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "El enfermero no existe");

            //Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ChoferesNoExisteExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "El chofer no existe");

            //Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AdministrativoNoExistenteExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "El administrativo no existe");

            //Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MovilNoExistenteExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "El movil no existe");

            //Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AfiliadoNoExistenteExcepcion ex) {
                        JOptionPane.showMessageDialog(null, "El afiliado no existe");

            //Logger.getLogger(Solicitud_Medica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox_dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField_dni_administrativo;
    private javax.swing.JTextField jTextField_dni_chofer;
    private javax.swing.JTextField jTextField_dni_enfermero;
    private javax.swing.JTextField jTextField_dni_solicitud;
    private javax.swing.JTextField jTextField_medico_dni;
    private javax.swing.JTextField jTextField_mora;
    private javax.swing.JTextField jTextField_patente;
    private javax.swing.JTextField jTextField_result_administrativo;
    private javax.swing.JTextField jTextField_result_chofer;
    private javax.swing.JTextField jTextField_result_enfermero;
    private javax.swing.JTextField jTextField_result_medico;
    private javax.swing.JTextField jTextField_result_movil;
    // End of variables declaration//GEN-END:variables
}
