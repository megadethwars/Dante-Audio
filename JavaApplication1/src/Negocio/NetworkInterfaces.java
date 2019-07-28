/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import Datos.Logs;
import Interfaz.Panel;
import java.util.ArrayList;
/**
 *
 * @author leone
 */
public class NetworkInterfaces {
    
    //buscar todas la interfaces de red
    private Enumeration<NetworkInterface> en;
 
    private ArrayList<String> AllNetworks;
    public NetworkInterfaces(){
      AllNetworks=new ArrayList<>();
        try {
            en = NetworkInterface.getNetworkInterfaces();
            while(en.hasMoreElements()){
                 NetworkInterface ni = en.nextElement();
               if(ni.isUp() && ni.supportsMulticast()){
                   String nombre=ni.getDisplayName();
                   String segundoNombre=ni.getName();
                   
                   AllNetworks.add(nombre);
                   AllNetworks.add(segundoNombre);
               }
            }
            
            
        } catch (SocketException ex) {
            Logger.getLogger(NetworkInterfaces.class.getName()).log(Level.SEVERE, null, ex);
           Logs.Write("Error:  no se pudieron listar las interfaces de red");
        }
        
    }
    
    public ArrayList<String> GetInterfaces(){
       return AllNetworks;   
    }
    
    
}
