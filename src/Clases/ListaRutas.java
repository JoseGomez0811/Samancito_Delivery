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
public class ListaRutas {
    private NodoRuta primero;
    private NodoRuta ultimo;
    private int tamaño;
    
    public ListaRutas(){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }
    
    public boolean esta_vacia(){
        return getPrimero() == null;
    }
    
    public void agregar_al_inicio(NodoRuta ruta){
        if(esta_vacia()){
            setPrimero(ruta);
            setUltimo(ruta);
        }else{
            ruta.setSiguiente(getPrimero());
            setPrimero(ruta);
        }
        setTamaño(getTamaño() + 1);
    }
    
    public void agregar_al_final(NodoRuta ruta){
        if(esta_vacia()){
            agregar_al_inicio(ruta);
        }else{
            getUltimo().setSiguiente(ruta);
            setUltimo(ruta);
            setTamaño(getTamaño() + 1);
        }
    }
    
    public void imprimir(){
        if(esta_vacia()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia.");
        }else{
            NodoRuta temporal;
            temporal = getPrimero();
            String mostrar_completo = "";
            for (int i = 0; i < getTamaño(); i ++){
                mostrar_completo += temporal.getPosicion1() + "," + temporal.getPosicion2() + "," + temporal.getPosicion3() + "\n";
                temporal = temporal.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,mostrar_completo);
        }
    }

    /**
     * @return the primero
     */
    public NodoRuta getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoRuta primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoRuta getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoRuta ultimo) {
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
