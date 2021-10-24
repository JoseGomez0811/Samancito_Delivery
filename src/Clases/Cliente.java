/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author s_ant
 */
public class Cliente {
    private String primerNombre;
    private String apellido;
    private int cedula;
    private int direccion;

    public Cliente(String primerNombre, String apellido, int cedula, int direccion) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public Cliente(String primerNombre, String apellido, int cedula) {
        this(primerNombre, apellido, cedula, -1);
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public int getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return primerNombre;
    }
    
    
}
