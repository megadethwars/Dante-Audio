/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Datos.Configuracion;
import Datos.XmlRead;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.net.*;

import Interfaz.Panel;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import Datos.ThreadPing;

/**
 *
 * @author leone
 */
public class ThreadStart extends Thread {
    private Configuracion Conf;
    private XmlRead X;
    private Estado E;
    private String servidor;
    private String puerto;
    private InetAddress Inet;
    private Socket clientsocket;
    private DataOutputStream outToServer;
    private BufferedReader inFromServer;
    
    private boolean status=false;
    private boolean status2=false;
    private ArrayList<Thread> procesos;
    
    private Panel P;
    
    
    
    public ThreadStart(Panel P){
       this.P=P;
         
    }
    
    @Override
    public void run(){
      
        //leer xml
        X=new XmlRead();
        Conf=X.Read("config.xml");
        //asignar string servidor
        servidor=Conf.GetServidor();
        puerto=Conf.GetPuerto();
        status=Ping(servidor);
        if(status){
            P.setEtiquetaConect("SERVER FOUND");
            P.SetLog("Server found ");
            status2=ReadStatusServ(servidor,puerto,"S");
        }
        if(status2){
            P.setEtiquetaStatus("ONLINE");
            P.SetLog("Service Online ");
            P.SetAlarma(0);
        }
        else{
            P.setEtiquetaStatus("SERVICE DOWN");
            P.SetAlarma(2);
        }
        
        Ping(servidor);
        
       ListaProcesos();
    }
    public boolean Ping(String serv)
    {       
        try {
           Inet=InetAddress.getByName(serv);            
            if(Inet.isReachable(2000)){
                status=true;   
                P.setEtiquetaConect(serv);
                P.SetLog("servidor remoto encontrado ");
            }
            else{                
                //JOptionPane.showMessageDialog(null,"Servidor no encontrado  ");
                P.SetLog("Server found");
                status=false;
            }                       
        } catch (IOException ex) {
            Logger.getLogger(ThreadStart.class.getName()).log(Level.SEVERE, null, ex);
               //JOptionPane.showMessageDialog(null,"Servidor no encontrado  ");
               P.SetLog("servidor no encontrado");
        }
         return status;
    }

    
    public boolean ReadStatusServ(String serv,String port,String cmd){
        try {
            
              clientsocket=new Socket(serv,Integer.parseInt(port));
                   
            clientsocket.setSoTimeout(3000);
            outToServer = new DataOutputStream(clientsocket.getOutputStream());
            inFromServer = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
            String sentence = cmd+'\n';
            // outToServer.writeBytes(sentence+'\n');
            outToServer.write(sentence.getBytes());
           String modifiedSentence = inFromServer.readLine();
            System.out.println("FROM SERVER: " + modifiedSentence);
            P.SetLog("From Server: "+modifiedSentence+" ");
             
            
            System.out.println(modifiedSentence);
           clientsocket.close();  
                   return true;
        } catch (IOException ex) {
            Logger.getLogger(ThreadStart.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "Servicio no encontrado");
            P.SetLog("Error de conexion, servicio no encontrado ");
            return false;
        }
    }
     
      public void ListaProcesos(){
      
        new ThreadStatus(P).start();
   //     new ThreadChannels(P).start();
        new ThreadPing(P).start();
        new Threadtime(P).start();
        
        
     }

}