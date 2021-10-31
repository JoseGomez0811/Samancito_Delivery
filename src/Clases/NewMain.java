/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author SebasBD
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManejoDeData mdd = new ManejoDeData();
        GrupoListas gl = mdd.leer_txt();
        ListaRestaurant restaurantes = gl.getRestaurantes();
        ListaCliente clientes = gl.getClientes();
        ListaPedidos pedidos = gl.getPedidos();
        ListaRutas rutas = gl.getRutas();
        NodoRestaurant restaurante = restaurantes.getPrimero();
        ListaMenu menu = restaurante.getMenu();
        menu.imprimir();
        mdd.guardar_txt(restaurantes, clientes, pedidos, rutas);
        
    }
    
}
