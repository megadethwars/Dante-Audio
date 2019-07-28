/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.ThreadStart;
import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import Interfaz.Panel;
import java.net.SocketException;

/**
 *
 * @author leone
 */
public class ThreadPing extends Thread{
    private InetAddress Inet;
    private boolean status;
    private Panel P;
    private Configuracion Conf;
    private XmlRead X;
    
    public ThreadPing(Panel P){
        this.P=P; 
        X=new XmlRead();
    }
    
    
    @Override
    public void run(){  
        while (true) {    
            try {
                Thread.sleep(3000);
                Conf=X.Read("config.xml");
                HeartBeat(Conf.GetServidor());
               
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadPing.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("error de red");
                System.out.println("Error de lectura de xml");
                Logs.Write("Error de ping, fallo en red y/o configuracion xml");
            }
        }           
    }
    
    public void SetConfiguracion(Configuracion Conf){
        this.Conf=Conf;
    }
    
    public boolean HeartBeat(String serv)
    {             
        try {
           Inet=InetAddress.getByName(serv);            
            if(Inet.isReachable(1000)){
                   
                P.setEtiquetaConect(serv);
              
            }
            else{                
               // JOptionPane.showMessageDialog(null,"Servidor no encontrado  ");
                P.setEtiquetaConect("NO SERVER ");
                P.SetLog("Servidor remoto no encontrado  ");
                Logs.Write("No se encontro el servidor");
            }                       
        } catch (IOException ex) {
            Logger.getLogger(ThreadStart.class.getName()).log(Level.SEVERE, null, ex);
               //JOptionPane.showMessageDialog(null,"Servidor no encontrado  ");
                P.setEtiquetaConect("NETWORK ERROR ");
                P.SetLog("Error de red ");
                P.SetLog("Servidor remoto no encontrado ");
                Logs.Write("Error de red, servicio no encontrado");
        }
         return status;
    }
    
}
