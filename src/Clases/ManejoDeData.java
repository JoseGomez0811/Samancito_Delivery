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
 * @author SebasBD
 */
public class ManejoDeData {
    
    File masterdata = new File("test\\MasterData");
    
    public ManejoDeData(){
    }
    
    public GrupoListas leer_txt(){
        String linea;
        String txt = "";
        String path = "test\\MasterData.txt";
        File file = new File(path);
        ListaRestaurant restaurantes = new ListaRestaurant();
        ListaCliente clientes = new ListaCliente();
        ListaPedidos pedidos = new ListaPedidos();
        try{
            if (!file.exists()){
                file.createNewFile();
                //System.out.println("xd"); entra
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((linea = br.readLine()) != null){
                    if(!linea.isEmpty()){
                        txt += linea + "\n";
   
                    }
                }
            
            
                if (!"".equals(txt) && !txt.isEmpty()){
                    String[] txt_split = txt.split("\n");
                    for(int i = 0; i < txt_split.length; i++){
                        if (txt_split[i].contains("Restaurantes")){
                            i++;
                            while(!txt_split[i].contains("Clientes")){
                                String [] restaurant_split1 = txt_split[i].split(",");
                                String [] restaurant_split2 = restaurant_split1[2].split("/");
                                ListaMenu menu = new ListaMenu();
                                NodoRestaurant restaurant = new NodoRestaurant(restaurant_split1[0],restaurant_split1[1], menu);
                                for(int j = 0; j < restaurant_split2.length; j++){
                                    NodoPlato platillo = new NodoPlato(restaurant_split2[j]);
                                    menu.agregar_al_final(platillo);
                                }
                                restaurantes.agregar_al_final(restaurant);
                                i++;
                                
                            }
                        } 
                        if (txt_split[i].contains("Clientes")){
                            i++;
                            while(!txt_split[i].contains("Pedidos")){
                                String [] clientes_split = txt_split[i].split(",");
                                NodoCliente cliente = new NodoCliente(clientes_split[0],clientes_split[1],clientes_split[2],clientes_split[3]);  
                                clientes.agregar_al_final(cliente);
                                i++;
                            }
                        }
                        if (txt_split[i].contains("Pedidos")){
                            i++;
                              while(!txt_split[i].contains("Rutas")){
                                String [] pedidos_split = txt_split[i].split(",");
                                NodoPedido pedido = new NodoPedido(pedidos_split[0],pedidos_split[1],pedidos_split[2]);
                                pedidos.agregar_al_final(pedido);
                                i++;
                            }
                        //}else if (txt_split[i].contains("Rutas")){
                        //    i++;
                        //    while(!txt_split[i].contains("")){
                            
                        //    }
                        }
                        
                    }
                    br.close();
                    }
                }
                JOptionPane.showMessageDialog(null,"Lectura exitosa");
                
            }catch(Exception er){
                JOptionPane.showMessageDialog(null,"Ocurrio un problema al leer el archivo");
            }
        
            return new GrupoListas(clientes,restaurantes,pedidos);
    }
    
    public void guardar_txt( ListaRestaurant restaurantes, ListaCliente clientes, ListaPedidos pedidos){
        String restaurantes_actuales = "";
        if (!restaurantes.esta_vacia()) {
            NodoRestaurant temp = restaurantes.getPrimero();
            for(int i = 0; i < restaurantes.getTamaño(); i++){
                restaurantes_actuales += temp.getLetra() + "," + temp.getNombre() + "," + temp.getMenu() + "\n";
                temp = temp.getSiguiente();
            }
        }
        String clientes_actuales = "";
        if (!clientes.esta_vacia()) {
            NodoCliente temp = clientes.getPrimero();
            for(int i = 0; i < restaurantes.getTamaño(); i++){
                clientes_actuales += temp.getIdentificador() + "," + temp.getNombre() + "," + temp.getApellido() + "," + temp.getCedula() + "\n";
                temp = temp.getSiguiente();
            }
        }
        String pedidos_actuales = "";
        if (!pedidos.esta_vacia()) {
            NodoPedido temp = pedidos.getPrimero();
            for(int i = 0; i < pedidos.getTamaño(); i++){
                clientes_actuales += temp.getCliente() + "," + temp.getRestaurant() + "," + temp.getOrden() + "\n";
                temp = temp.getSiguiente();
            }
        }
        try{
            PrintWriter pw = new PrintWriter("test\\MasterData.txt");
            pw.print("Restaurantes");
            pw.print(restaurantes_actuales);
            pw.print("Clientes");
            pw.print(clientes_actuales);
            pw.print("Pedidos");
            pw.print(pedidos_actuales);
            pw.print("Rutas");
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");
        
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar");
        
        }
        
        
    }
}

