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
    
    public void agregar_al_inicio(NodoPlato plato){
        if(esta_vacia()){
            setPrimero(plato);
            setUltimo(plato);
        }else{
            plato.setSiguiente(getPrimero());
            setPrimero(plato);
        }
        setTamaño(getTamaño() + 1);
    }
    
    public void agregar_al_final(NodoPlato plato){
        if(esta_vacia()){
            agregar_al_inicio(plato);
        }else{
            getUltimo().setSiguiente(plato);
            setUltimo(plato);
            setTamaño(getTamaño() + 1);
        }
    }
    
    public void imprimir(){
        if(esta_vacia()){
            System.out.println("La lista esta vacia.");
        }else{
            NodoPlato temporal;
            temporal = getPrimero();
            String mostrar_completo = "";
            for (int i = 0; i < getTamaño(); i ++){
               mostrar_completo += temporal.getPlatillo() + "\n";
                temporal = temporal.getSiguiente();
            }
           System.out.println(mostrar_completo);
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
