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
public class Local {
    private String nombre;
    private String[] menu;


    public Local(String nombre, String[] menu) {
        this.nombre = nombre;
        this.menu = menu;
    }
    

    public void setMenu(String[] menu) {
        this.menu = menu;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getMenu() {
        return menu;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
