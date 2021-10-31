/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.awt.Color;

/**
 *
 * @author Jose
 */
public class Vertice {
    String nombre;
    int numeroVertices;
    
    /**
     * Constructor de la clase Vertice
     * @param nombre2 El parámetro nombre2 define el nombre del vertice
     */
    public Vertice(String nombre2){
        nombre = nombre2;
        numeroVertices = -1;
    }
    
    /**
     * Método que retorna el nombre del vertice
     * @return Retorna el nombre del vertice
     */
    public String nomVertice(){
        return nombre;
    }
    
    /**
     * Método...
     * @param n
     * @return 
     */
    public boolean equals(Vertice n){
        return nombre.equals(n.nombre);
    }
    
    /**
     * Método que asigna...
     * @param n 
     */
    public void asignarVertices(int n){
        numeroVertices = n;
    }
    
    /**
     * Método que convierte a String
     * @return Retorna el nombre del vertice más el número convertidos en String
     */
    public String toString(){
        return nombre + "(" + numeroVertices + ")";
    }

    /**
     * Método que retorna el color del vertice
     * @return Retorna el color del vertice
     */
    public Color getColorPreferencia() {
        return Color.black;
    }
    
}
