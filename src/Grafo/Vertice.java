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
    String etiqueta;
    String nombre;
    int numeroVertices;
    
    /**
     * Constructor de la clase Vertice
     * @param nombre2 El parámetro nombre2 define el nombre del vertice
     */
    public Vertice(String etiqueta){
        this(etiqueta, "");
    }
    
    public Vertice(String etiqueta, String nombre) {
        this.etiqueta = etiqueta;
        this.nombre = nombre;;
        numeroVertices = -1;
    }
    
    public String getEtiqueta(){
        return etiqueta;
    }

    public String getNombre() {
        return nombre;
     }
    
    /**
     * Método...
     * @param n
     * @return 
     */
    public boolean equals(Vertice n){
        return etiqueta.equals(n.etiqueta);

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
        return etiqueta + "(" + numeroVertices + ")";
    }

    /**
     * Método que retorna el color del vertice
     * @return Retorna el color del vertice
     */
    public Color getColorPreferencia() {
        return Color.black;
    }
    
    public int getNumeroVertices() {
        return numeroVertices;
    }
    
}
