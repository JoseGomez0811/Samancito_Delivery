/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.ManejoDeData;
import Clases.Funciones;
import Clases.GrupoListas;
import Clases.ListaCliente;
import Clases.ListaMenu;
import Clases.NodoCliente;
import Clases.ListaPedidos;
import Clases.ListaRestaurant;
import Clases.ListaRutas;
import Clases.NodoPedido;
import Clases.NodoPlato;
import Clases.NodoRestaurant;
import javax.swing.JOptionPane;
/**
 *
 * @author Jose
 */
public class VentanaOrdenar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaOrdenar
     */
    
    ManejoDeData objeto = new ManejoDeData();
    GrupoListas grupo_listas = objeto.leer_txt();
    Funciones funcion = new Funciones();
    ListaRestaurant restaurantes = grupo_listas.getRestaurantes();
    ListaPedidos pedidos = grupo_listas.getPedidos();
    ListaCliente clientes = grupo_listas.getClientes();
    ListaRutas rutas = grupo_listas.getRutas();
    public VentanaOrdenar() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoCantidad = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoRestaurante = new javax.swing.JTextField();
        campoMenu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnRestaurantes = new javax.swing.JButton();
        BotonMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel3.setText("Menú:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Restaurante:");

        jLabel2.setText("ID del cliente:");

        jLabel4.setText("Menú");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel5.setText("ORDENAR");

        jLabel6.setText("Cantidad:");

        btnRestaurantes.setText("Lista Restaurantes");
        btnRestaurantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantesActionPerformed(evt);
            }
        });

        BotonMenu.setText("Menu");
        BotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuActionPerformed(evt);
            }
        });

        jLabel7.setText("Ingrese solo la letra del restaurante");

        jLabel8.setText("Ingrese solo el numero del producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRestaurantes)
                                .addGap(37, 37, 37)
                                .addComponent(btnConfirmar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BotonMenu)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar)
                    .addComponent(btnRestaurantes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMenu)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt(campoID.getText());
            int menu = Integer.parseInt(campoMenu.getText());
            int cantidad = Integer.parseInt(campoCantidad.getText());
            String restaurante = campoRestaurante.getText();
            if (!restaurante.isBlank()){
                String cliente = String.valueOf(id);
                NodoRestaurant aux = restaurantes.buscarRestaurant(restaurante);
                ListaMenu temporal = aux.getMenu();
                NodoPlato plato = temporal.buscarPlato(menu);
                String platillo = plato.getPlatillo();
                String porcion = String.valueOf(cantidad);
                String pedido = porcion + "-" + platillo;
                NodoPedido nuevo_pedido = new NodoPedido(cliente,restaurante,pedido);
                pedidos.agregar_al_final(nuevo_pedido);
                objeto.guardar_txt(restaurantes, clientes, pedidos, rutas);
                JOptionPane.showMessageDialog(null,"Pedido registrado con exito");
            }
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Por favor ingrese valores validos");    
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantesActionPerformed
         // TODO add your handling code here:
         restaurantes.imprimir();
                 
    }//GEN-LAST:event_btnRestaurantesActionPerformed

    private void BotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuActionPerformed
        // TODO add your handling code here:
        String restaurante = campoRestaurante.getText();
        try{
            if(!restaurante.isBlank()){
                NodoRestaurant restaurant = restaurantes.buscarRestaurant(restaurante);
                ListaMenu menu = restaurant.getMenu();
                menu.imprimir();
            }
        }catch(Exception er){
            JOptionPane.showMessageDialog(null,"Por favor ingrese el restaurant para poder ver el menu");
        }   
        
    }//GEN-LAST:event_BotonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOrdenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOrdenar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMenu;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRestaurantes;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoMenu;
    private javax.swing.JTextField campoRestaurante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
