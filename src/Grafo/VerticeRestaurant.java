/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import Clases.NodoRestaurant;
import java.awt.Color;

/**
 *
 * @author s_ant
 */
public class VerticeRestaurant extends Vertice{
    
    private NodoRestaurant restaurant;
    
    public VerticeRestaurant(String nombre2) {
        super(nombre2);
    }

    public VerticeRestaurant(NodoRestaurant restaurant) {
        super(restaurant.getNombre());
        this.restaurant = restaurant;
    }

    public NodoRestaurant restaurant() {
        return restaurant;
    }

    public void setLocal(NodoRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroVertices() {
        return numeroVertices;
    }

    public void setNumeroVertices(int numeroVertices) {
        this.numeroVertices = numeroVertices;
    }

    @Override
    public Color getColorPreferencia() {
        return new Color(143, 220, 180);
    }
    
    
    
}
