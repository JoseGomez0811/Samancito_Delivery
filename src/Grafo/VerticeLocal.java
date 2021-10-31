/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import Clases.Local;
import java.awt.Color;

/**
 *
 * @author s_ant
 */
public class VerticeLocal extends Vertice{
    
    private Local local;
    
    public VerticeLocal(String nombre2) {
        super(nombre2);
    }

    public VerticeLocal(Local local) {
        super(local.getNombre());
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
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
