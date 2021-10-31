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
public class ListaRestaurant {
    private NodoRestaurant primero;
    private NodoRestaurant ultimo;
    private int tamaño;
    
    /**
     * Constructor de la clase ListaRestaurante
     */
    public ListaRestaurant(){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }
    
    /**
     * Método que determina si la lista está vacía 
     * @return Retorna null en el nodo primero si la lista está vacía
     */
    public boolean esta_vacia(){
        return getPrimero() == null;
    }
    
    /**
     * Método que agrega un nuevo elemento al principio de la lista
     * @param restaurant El parámetro restaurante define...
     */
    public void agregar_al_inicio(NodoRestaurant restaurant){
        if(esta_vacia()){
            setPrimero(restaurant);
            setUltimo(restaurant);
        }else{
            restaurant.setSiguiente(getPrimero());
            setPrimero(restaurant);
        }
        setTamaño(getTamaño() + 1);
    }
    
    /**
     * Método que agrega un nuevo elemento al final de la lista
     * @param restaurant El parámetro restaurante define...
     */
    public void agregar_al_final(NodoRestaurant restaurant){
        if(esta_vacia()){
            agregar_al_inicio(restaurant);
        }else{
            getUltimo().setSiguiente(restaurant);
            setUltimo(restaurant);
            setTamaño(getTamaño() + 1);
        }
    }
    
    /**
     *Método que imprime la lista creada
     */
    public void imprimir(){
        if(esta_vacia()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia.");
        }else{
            NodoRestaurant temporal;
            temporal = getPrimero();
            String mostrar_completo = "";
            String menu = "";
            for (int i = 0; i < getTamaño(); i ++){
                ListaMenu platillos = temporal.getMenu();
                NodoPlato plato = platillos.getPrimero();
                menu = "";  
                for (int j = 0; j < platillos.getTamaño(); j++){
                menu += plato.getPlatillo() + "/";
                plato = plato.getSiguiente();
                
                }
                mostrar_completo += temporal.getLetra() + "," + temporal.getNombre() + "," + menu + "\n";
                temporal = temporal.getSiguiente(); 
                
            }
            JOptionPane.showMessageDialog(null, mostrar_completo);
        }
    }
    
    /**
     * Método que busca un elemento en la lista
     * @param restaurant El parámetro restaurant define el restaurante que desea buscar
     * @return Retorna null si el plato no es contrado
     */
    public NodoRestaurant buscarRestaurant(String restaurant){
        NodoRestaurant restaurante = primero;
        while(restaurant != null){
            if(restaurante.getLetra().equals(restaurant)){
                return restaurante;
            }
            restaurante = restaurante.getSiguiente();
        }
        return null;
    } 
 

    /**
     * @return the primero
     */
    public NodoRestaurant getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoRestaurant primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoRestaurant getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoRestaurant ultimo) {
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
