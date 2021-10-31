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
public class ListaMenu {
    private NodoPlato primero;
    private NodoPlato ultimo;
    private int tamaño;
    
    public ListaMenu(){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;   
    }
    
    public boolean esta_vacia(){
        return getPrimero() == null;
    }
    
    public void vaciar(){
        this.setPrimero(ultimo = null);
        this.setTamaño(0);
        
    }
    
    public void agregar_al_final(NodoPlato plato){
        if(this.esta_vacia()){
            primero = ultimo = plato;
        }else{
            ultimo.setSiguiente(plato);
            plato.setAnterior(ultimo);
            ultimo = plato;
        }
        tamaño ++;
        plato.setIdentificador(tamaño); 
    }
    public NodoPlato buscarPlato(int identificador){
        NodoPlato plato = primero;
        while(plato != null){
            if(plato.getIdentificador() == identificador){
                return plato;
            }
            plato = plato.getSiguiente();
        }
        return null;
    } 
    
    public void eliminarPlato(NodoPlato plato){
        if (plato != null){
            if (tamaño == 1 ){
                this.vaciar();
            }else{
                if(primero == plato){
                    primero = primero.getSiguiente();
                    primero.setAnterior(null);
                }else if(ultimo == plato){
                    ultimo = ultimo.getAnterior();
                    ultimo.setSiguiente(null);
                }else{
                    plato.getAnterior().setSiguiente(plato.getSiguiente());
                    plato.getSiguiente().setAnterior(plato.getAnterior());
                }
                tamaño --;
            }
        }
        
    }
    
    public void imprimir(){
<<<<<<< Updated upstream
=======
        String mostrar_completo = "";
>>>>>>> Stashed changes
        if(esta_vacia()){
            JOptionPane.showMessageDialog(null,"La lista esta vacia.");
        }else{
            NodoPlato temporal;
            temporal = getPrimero();
<<<<<<< Updated upstream
            String mostrar_completo = "";
            for (int i = 0; i < getTamaño(); i ++){
               mostrar_completo += temporal.getPlatillo() + "\n";
                temporal = temporal.getSiguiente();
            }
           System.out.println(mostrar_completo);
=======
            System.out.println(temporal.getPlatillo());
            for (int i = 0; i < getTamaño(); i ++){
               mostrar_completo += temporal.getIdentificador() + ":" + temporal.getPlatillo() + "/";
               temporal = temporal.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, mostrar_completo);
>>>>>>> Stashed changes
        }
    }

    /**
     * @return the primero
     */
    public NodoPlato getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoPlato primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoPlato getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoPlato ultimo) {
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
