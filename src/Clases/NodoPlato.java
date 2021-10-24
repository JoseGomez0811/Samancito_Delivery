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
public class NodoPlato {
    private NodoPlato siguiente;
    private String platillo;
    
    public NodoPlato(String platillo){
        this.siguiente = null;
        this.platillo = platillo;
    }

    /**
     * @return the siguiente
     */
    public NodoPlato getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPlato siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the platillo
     */
    public String getPlatillo() {
        return platillo;
    }

    /**
     * @param platillo the platillo to set
     */
    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }
}
