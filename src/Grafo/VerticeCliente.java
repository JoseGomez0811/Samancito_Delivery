/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import Clases.Cliente;
import java.awt.Color;

/**
 *
 * @author s_ant
 */
public class VerticeCliente extends Vertice{   
    
    private Cliente cliente;
    
    public VerticeCliente(String nombre2) {
        super(nombre2);
    }

    public VerticeCliente(Cliente cliente) {
        super(cliente.getNombre());
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        return new Color(96, 148, 254);
    }
    
    
    
    
}
