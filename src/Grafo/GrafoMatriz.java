/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import Clases.Cliente;
import Clases.Local;
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
                matAd[i][j] = Integer.MAX_VALUE ; //numero infinito
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
    
    public void nuevoArco(int va, int vb, int peso)throws Exception{
        if(va < 0 || vb < 0 || va >= numeroVertices || vb >= numeroVertices){ // evitar crear una arista con vértice mayor a la cantidad de vértices que tenemos
            JOptionPane.showMessageDialog(null, "Vertice no existe");
        }
        matAd[va][vb] = peso;
    }
    
    public boolean adyacente(int va, int vb) throws Exception{
        if(va < 0 || vb < 0 || va >= numeroVertices || vb >= numeroVertices){
            JOptionPane.showMessageDialog(null, "Vertice no existe");
        }
        return matAd[va][vb] != Integer.MAX_VALUE; //devolver falso si el valor es infinito 
    }
    
    public void cargarVerticeLocal(String linea){ //pasar linea de txt insertar el vertice
        String[] componentes = linea.split(",");
        String nombre = componentes[1];
        String [] menu = componentes[2].split("/");
        
        Local local = new Local(nombre, menu);
        Vertice vertice = new VerticeLocal(local);
        vertice.asignarVertices(numeroVertices);
        vertices[numeroVertices++] = vertice;
    }
    
    public void cargarVerticeCliente(String linea){ //pasar linea de txt insertar el vertice
        String[] componentes = linea.split(",");
        String primerNombre = componentes[1];
        String apellido = componentes[2];
        int cedula = Integer.parseInt(componentes[3]);
        Cliente cliente = new Cliente(primerNombre, apellido, cedula);
        Vertice vertice = new VerticeCliente(cliente);
        vertice.asignarVertices(numeroVertices);
        vertices[numeroVertices++] = vertice;
    }
    
}
