/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author Jose
 */
public class Vertice {
    String nombre;
    int numeroVertices;
    
    public Vertice(String nombre2){
        nombre = nombre2;
        numeroVertices = -1;
    }
    
    public String nomVertice(){
        return nombre;
    }
    
    public boolean equals(Vertice n){
        return nombre.equals(n.nombre);
    }
    
    public void asignarVertices(int n){
        numeroVertices = n;
    }
    
    public String toString(){
        return nombre + "(" + numeroVertices + ")";
    }
    
}
