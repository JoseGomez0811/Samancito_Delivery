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
public class GrafMatPeso {
    public static int INFINITO = Integer.MAX_VALUE;
    public int [][] matPeso;
    private Vertice [] verts;
    private int numVerts;
    
    /**
    *Constructor de la clase GrafMatPeso
    *@param mx El parámetro mx define
    */
    public GrafMatPeso(int mx){
        matPeso = new int [mx][mx];
        verts = new Vertice[mx];
        for(int i = 0; i < mx; i++){
            for(int j = 0; j < mx; j++){
                matPeso[i][j] = INFINITO;
            }
        }
        numVerts = 0;
    }
    
    /**
     * Método que construye un nuevo vertice en el grafo
     * @param vertice El parámetro vertice define el vertice que se desea
     * agregar al grafo
     */
    public void nuevoVertice(Vertice vertice){
        boolean esta = numVertice(vertice) >= 0;
        if(!esta){
            vertice.asignarVertices(numVerts);
            verts[numVerts++] = vertice;
        }
    }
    
    /**
     * Método que define el peso de las conexiones entre los nodos del grafo 
     * @param a El parámetro a define el punto de partida del recorrido del grafo
     * @param b El parámetro b define el punto de llegada del recorrido del grafo
     * @return Retorna la distancia entre el punto a y el punto b
     */
    public int pesoArco(Vertice a, Vertice b){
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        return matPeso[va][vb];
    }
    
    /**
     * Método que defina el número de vertices del grafo
     * @return Retorna el número del vertices
     */
    public int numeroDeVertice(){
        return numVerts;
    }
    
    /**
     * Método que 
     * @return 
     */
    public Vertice[] vertices(){
        return verts;
    }
    
    /**
     * Método que construye nuevas conexiones entre los vertices
     * @param a El parámero a define el punto de partido del recorrido del grafo
     * @param b El parámero b define el punto de llegada del recorrido del grafo
     * @param peso El parámetro peso define la distancia entre los dos puntos del grafo
     */
    public void nuevoArco(Vertice a, Vertice b, int peso){
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        matPeso[va][vb] = peso;
    }
    
    /**
     * 
     * @param vertice
     * @return 
     */
    public int numVertice(Vertice vertice){
        boolean encontrado = false;
        int i = 0;
        for(;(i < numVerts) && !encontrado;){
            encontrado = verts[i].equals(vertice);
            if(!encontrado) i++;
        }
        return (i < numVerts)? i : -1;
    }
    
    /**
     * Método 
     * @return 
     */
    public int [][] getMatPeso(){
        return matPeso;
    }
    
}
