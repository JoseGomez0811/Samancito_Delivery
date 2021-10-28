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
public class ListaCliente {
    private NodoCliente primero;
    private NodoCliente ultimo;
    private int tamaño;
    
    public ListaCliente(){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }
    
    public boolean esta_vacia(){
        return getPrimero() == null;
    }
    
    public void agregar_al_inicio(NodoCliente cliente){
        if(esta_vacia()){
            setPrimero(cliente);
            setUltimo(cliente);
        }else{
            cliente.setSiguiente(getPrimero());
            setPrimero(cliente);
        }
        setTamaño(getTamaño() + 1);
    }
    
    public void agregar_al_final(NodoCliente cliente){
        if(esta_vacia()){
            agregar_al_inicio(cliente);
        }else{
            getUltimo().setSiguiente(cliente);
            setUltimo(cliente);
            setTamaño(getTamaño() + 1);
        }
    }
    
    public void imprimir(){
        if(esta_vacia()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia.");
        }else{
            NodoCliente temporal;
            temporal = getPrimero();
            String mostrar_completo = "";
            for (int i = 0; i < getTamaño(); i ++){
                mostrar_completo += temporal.getNombre() + "," + temporal.getApellido() + "," + temporal.getCedula() + "\n";
                temporal = temporal.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,mostrar_completo);
        }
    }

    /**
     * @return the primero
     */
    public NodoCliente getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoCliente primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoCliente getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoCliente ultimo) {
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
