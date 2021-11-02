/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Aplicacion;
import Grafo.GrafMatPeso;
import Grafo.Vertice;
import Grafo.VerticeCliente;
import Grafo.VerticeRestaurant;

/**
 *
 * @author Jose
 */
public class VentanaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCliente
     */
    public VentanaAdmin() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        agregarPlatosButton = new javax.swing.JButton();
        eliminarPlatoButton = new javax.swing.JButton();
        agregarRestauranteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Samancito Delivery");

        jLabel1.setText("VENTANA ADMINISTRADOR");

        jButton1.setText("Agregar Nuevo Camino");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        agregarPlatosButton.setText("Agregar Platos");
        agregarPlatosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPlatosButtonActionPerformed(evt);
            }
        });

        eliminarPlatoButton.setText("Eliminar Platos");
        eliminarPlatoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPlatoButtonActionPerformed(evt);
            }
        });

        agregarRestauranteButton.setText("Agregar Restaurante");
        agregarRestauranteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarRestauranteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(eliminarPlatoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarPlatosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarRestauranteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(agregarRestauranteButton)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(agregarPlatosButton)
                .addGap(40, 40, 40)
                .addComponent(eliminarPlatoButton)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarRestauranteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarRestauranteButtonActionPerformed
        VentanaAgregarRestaurante ventanaAgregarRestaurante = new VentanaAgregarRestaurante();
        ventanaAgregarRestaurante.setVisible(true);
    }//GEN-LAST:event_agregarRestauranteButtonActionPerformed

    private void agregarPlatosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPlatosButtonActionPerformed
        VentanaAgregarPlato ventanaAgregarPlato = new VentanaAgregarPlato();
        ventanaAgregarPlato.setVisible(true);
    }//GEN-LAST:event_agregarPlatosButtonActionPerformed

    private void eliminarPlatoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPlatoButtonActionPerformed
        VentanaEliminarPlato ventanaEliminarPlato = new VentanaEliminarPlato();
        ventanaEliminarPlato.setVisible(true);
    }//GEN-LAST:event_eliminarPlatoButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:     
        VentanaNuevoCamino venNuevoCamino = new VentanaNuevoCamino();
        venNuevoCamino.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarPlatosButton;
    private javax.swing.JButton agregarRestauranteButton;
    private javax.swing.JButton eliminarPlatoButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
