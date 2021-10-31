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
public class NodoRuta {
    private NodoRuta siguiente;
    private String posicion1;
    private String posicion2;
    private String posicion3;
    
    public NodoRuta(String posicion1, String posicion2, String posicion3){
        this.siguiente = null;
        this.posicion1 = posicion1;
        this.posicion2 = posicion2;
        this.posicion3 = posicion3;
    }

    /**
     * @return the siguiente
     */
    public NodoRuta getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoRuta siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the posicion1
     */
    public String getPosicion1() {
        return posicion1;
    }

    /**
     * @param posicion1 the posicion1 to set
     */
    public void setPosicion1(String posicion1) {
        this.posicion1 = posicion1;
    }

    /**
     * @return the posicion2
     */
    public String getPosicion2() {
        return posicion2;
    }

    /**
     * @param posicion2 the posicion2 to set
     */
    public void setPosicion2(String posicion2) {
        this.posicion2 = posicion2;
    }

    /**
     * @return the posicion3
     */
    public String getPosicion3() {
        return posicion3;
    }

    /**
     * @param posicion3 the posicion3 to set
     */
    public void setPosicion3(String posicion3) {
        this.posicion3 = posicion3;
    }
    
}
