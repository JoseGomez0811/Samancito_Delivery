/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class ManejoArchivo {
    private String nombre;
    private String apellido;
    private int cedula;
    private int n = 0;
    
    File ficheroCliente = new File("test\\clientes.txt");
    
    public ManejoArchivo(){
        
    }
    
    public void escribirDatosclientes(String nombre2, String apellido2, int cedula2){
        nombre = nombre2;
        apellido = apellido2;
        cedula = cedula2;
        
        try{           
            BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroCliente, true)));
            escribir.write((n+1) + "," + nombre + "," + apellido + "," + cedula);
            escribir.write("\n");
            JOptionPane.showMessageDialog(null, "El usuario ha sido registrado exitosamente");
            escribir.close();
            n = 0;
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void leerDatosClientes(){
        try{
            FileReader fr = new FileReader("test\\clientes.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            
            while((cadena =  br.readLine()) != null){
                n++;
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
