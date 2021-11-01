/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Aplicacion;
import Grafo.CaminoMinimo;
import Grafo.GrafMatPeso;
import Grafo.Vertice;
import Grafo.VerticeCliente;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;


public class MapaGrafo extends javax.swing.JFrame {
    private final List<VerticeGrafico> vertices = new ArrayList<>();
    private final List<AristaGrafica> aristas = new ArrayList<>();
    
    public MapaGrafo(List<VerticeGrafico> vertices, List<AristaGrafica> aristas) {
        this.vertices.addAll(vertices);
        this.aristas.addAll(aristas);
        initComponents();
    }
    
    // constructor usado para probar
    public MapaGrafo() {
        VerticeGrafico vertice1 = new VerticeGrafico(200, 50, new VerticeCliente("Test"), Color.YELLOW);
        VerticeGrafico vertice2 = new VerticeGrafico(300, 150, new VerticeCliente("Test2"), Color.CYAN);
        vertices.add(vertice1);
        vertices.add(vertice2);
        aristas.add(new AristaGrafica(40, vertice1, vertice2));
        initComponents();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMapa = new PanelMapa(vertices, aristas);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mapa de Grafos");
        setSize(new java.awt.Dimension(800, 600));

        add(panelMapa);
        getContentPane().add(panelMapa, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MapaGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapaGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapaGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapaGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapaGrafo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMapa;
    // End of variables declaration//GEN-END:variables

    void aplicarRuta(Vertice origen, Vertice destino) {
        VerticeGrafico nodoOrigen = null;
        VerticeGrafico nodoDestino = null;
        for (VerticeGrafico vg: vertices) {
            if (vg.getVertice().equals(origen)) {
                nodoOrigen = vg;
            }
            
            if (vg.getVertice().equals(destino)) {
                nodoDestino = vg;
            }
        }
        
        if (nodoOrigen != null) {
            nodoOrigen.setMarcado(true);
            nodoOrigen.setColorBorde(new Color(254, 160, 74));
        }
        
        if (nodoDestino != null) {
            nodoDestino.setMarcado(true);
            nodoDestino.setColorBorde(new Color(255, 131, 186));
        }
        
        // Tratamiento de las aristas
        GrafMatPeso grafo = Aplicacion.getGrafo();
        CaminoMinimo caminoMinimo = new CaminoMinimo(grafo, grafo.numVertice(origen));
        caminoMinimo.caminoMinimos();
        caminoMinimo.recuperaCamino(grafo.numVertice(destino));
        
    }
}
