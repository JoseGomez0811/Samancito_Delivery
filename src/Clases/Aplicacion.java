/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Grafo.GrafMatPeso;
import Grafo.Vertice;
import Grafo.VerticeRestaurant;
import Interfaces.VentanaInicial;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SebasBD
 */
public class Aplicacion {
    private static GrupoListas grupoListas;
    private static ManejoDeData mdd;
    private static GrafMatPeso grafo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicialización de la data contenida en el txt.
        mdd = new ManejoDeData();
        grupoListas = mdd.leer_txt();
        // Ahora todas las clases pueden acceder a las listas con Aplicacion.getGrupoListas()
        // Inicializamos grafo
        grafo = GrafMatPeso.desdeListas(grupoListas.getClientes(), grupoListas.getRestaurantes(), grupoListas.getRutas());
        // Inicializamos ventana inicial
        VentanaInicial ventanaInicial = new VentanaInicial();
        try {
            EventQueue.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    ventanaInicial.setVisible(true);
                    ventanaInicial.addWindowListener(new AdaptadorVentana());
                }
            });
        } catch (InterruptedException | InvocationTargetException ex) {
            System.out.println("Ejecución interrumpida");
            System.out.println(ex.getMessage());
        }
    }

    public static GrupoListas getGrupoListas() {
        return grupoListas;
    }

    public static GrafMatPeso getGrafo() {
        return grafo;
    }
    
    
 
    private static class AdaptadorVentana extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            mdd.guardar_txt(grupoListas.getRestaurantes(), grupoListas.getClientes(), grupoListas.getPedidos(), grupoListas.getRutas());   
        }
        
    }
    
    public static Vertice agregarVerticeRestaurant(NodoRestaurant nodoRestaurant) {
        Vertice verticeRestaurant = new VerticeRestaurant(nodoRestaurant);
        grafo.nuevoVertice(verticeRestaurant);
        grupoListas.getRestaurantes().agregar_al_final(nodoRestaurant);
        return verticeRestaurant;
    }
    
    public static NodoRuta agregarRuta(Vertice a, Vertice b, int distancia) {
        NodoRuta nodoRuta = new NodoRuta(a.getEtiqueta(), b.getEtiqueta(), String.valueOf(distancia));
        grafo.nuevoArco(a, b, distancia);
        grupoListas.getRutas().agregar_al_final(nodoRuta);
        return nodoRuta;
    }
}
