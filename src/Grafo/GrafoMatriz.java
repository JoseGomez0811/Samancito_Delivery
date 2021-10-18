/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class GrafoMatriz {
    int numeroVertices;
    int MaxVertices; 
    Vertice [] vertices;
    int [][] matAd;
    
    public GrafoMatriz(){
        this.MaxVertices = 20;
    }
    public GrafoMatriz(int n){
        matAd = new int [n][n];
        vertices = new Vertice[n];
        
        for (int i = 0; i < n; i++){
            for (int j = 0; i < n; i++){
                matAd[i][j] = 0;
            }
        }
        numeroVertices = 0;
    }
    
    public void nuevoVertice(String nombre2){
        boolean esta = numeroVertices >= 0;
        if(!esta){
            Vertice vertice = new Vertice(nombre2);
            vertice.asignarVertices(numeroVertices);
            vertices[numeroVertices++] = vertice;
        }
    }
    
    public boolean numeroDeVertices(String nombreVertice){
        Vertice vertice = new Vertice(nombreVertice);
        boolean encontrado = false;
        int i;
        for(i = 0; i < numeroVertices && (!encontrado); i++){
            encontrado = vertices[i].equals(vertice);
        }
        return (i < numeroVertices);
    }
    
    public void nuevoArco(int va, int vb)throws Exception{
        if(va < 0 || vb < 0){
            JOptionPane.showMessageDialog(null, "Vertice no existe");
        }
        matAd[va][vb] = 1;
    }
    
    public boolean adyacente(int va, int vb) throws Exception{
        if(va < 0 || vb < 0){
            JOptionPane.showMessageDialog(null, "Vertice no existe");
        }
        return matAd[va][vb] == 1;
    }
}
