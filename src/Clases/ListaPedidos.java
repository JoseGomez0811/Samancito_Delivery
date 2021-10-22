/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
/**
 *
 * @author SebasBD
 */
public class ListaPedidos {
    private NodoPedido primero;
    private NodoPedido ultimo;
    private int tamaño;
    
    public ListaPedidos(){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }
    
    public boolean esta_vacia(){
        return getPrimero() == null;
    }
    
    public void agregar_al_final(NodoPedido pedido){
        if(this.esta_vacia()){
            primero = ultimo = pedido;
        }else{
            ultimo.setSiguiente(pedido);
            pedido.setAnterior(ultimo);
            ultimo = pedido;
        }
        tamaño ++;
    }
    
    public void imprimir(){
        if(esta_vacia()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia.");
        }else{
            NodoPedido temporal;
            temporal = getPrimero();
            String mostrar_completo = "";
            for (int i = 0; i < getTamaño(); i ++){
                mostrar_completo += "Nombre: " + temporal.getCliente() + "," + temporal.getRestaurant() + "," + temporal.getOrden() + "\n";
                temporal = temporal.getSiguiente();
            }
            System.out.println(mostrar_completo);
        }
    }
    
    public NodoPedido buscarPedido(String cliente, String restaurant, String orden){
        NodoPedido pedido = primero;
        while(pedido != null){
            if(pedido.getCliente() == cliente && pedido.getRestaurant() == restaurant && pedido.getOrden() == orden){
                return pedido;
            }
            pedido = pedido.getSiguiente();
        }
        return null;
    } 
    
    public void vaciar(){
        this.setPrimero(ultimo = null);
        this.setTamaño(0);
        
    }
    
    public void eliminarPedido(NodoPedido pedido){
        if (pedido != null){
            if (tamaño == 1 ){
                this.vaciar();
            }else{
                if(primero == pedido){
                    primero = primero.getSiguiente();
                    primero.setAnterior(null);
                }else if(ultimo == pedido){
                    ultimo = ultimo.getAnterior();
                    ultimo.setSiguiente(null);
                }else{
                    pedido.getAnterior().setSiguiente(pedido.getSiguiente());
                    pedido.getSiguiente().setAnterior(pedido.getAnterior());
                }
                tamaño --;
            }
        }
        
    }
    

    /**
     * @return the primero
     */
    public NodoPedido getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoPedido primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoPedido getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoPedido ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
}