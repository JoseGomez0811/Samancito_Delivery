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
public class GrupoListas {
    private ListaCliente clientes;
    private ListaRestaurant restaurantes;
    private ListaPedidos pedidos;
    
    
    public GrupoListas(ListaCliente clientes, ListaRestaurant restaurantes, ListaPedidos pedidos){
        this.clientes = clientes;
        this.restaurantes = restaurantes;
        this.pedidos = pedidos;
        
    }

    /**
     * @return the restaurantes
     */
    public ListaRestaurant getRestaurantes() {
        return restaurantes;
    }

    /**
     * @param restaurantes the restaurantes to set
     */
    public void setRestaurantes(ListaRestaurant restaurantes) {
        this.restaurantes = restaurantes;
    }

    /**
     * @return the pedidos
     */
    public ListaPedidos getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos the pedidos to set
     */
    public void setPedidos(ListaPedidos pedidos) {
        this.pedidos = pedidos;
    }
    
}
