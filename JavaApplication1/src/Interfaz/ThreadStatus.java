/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.Configuracion;
import Datos.XmlRead;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Datos.Configuracion;
import Datos.XmlRead;
import Interfaz.Panel;

/**
 *
 * @author leone
 */
public class ThreadStatus extends Thread {
    private Configuracion Conf;
    private XmlRead X;
    private String servidor;
    private String puerto;
    private InetAddress Inet;
    private Socket clientsocket;
    private DataOutputStream outToServer;
    private BufferedReader inFromServer;
    private int status;
        private Panel P;
        
    public ThreadStatus(Panel P){
        
        this.P=P;
    }
    
   
    @Override
    public void run(){
      
        while(true) 
      {
            try {
                Thread.sleep(10000);
                X=new XmlRead();
                Conf=X.Read("config.xml");
            
             //asignar string servidor
                  servidor=Conf.GetServidor();
                  puerto=Conf.GetPuerto();
                  
                
                status=ReadStatusServ(servidor, puerto, "S");
                
                if(status==0){
                  P.setEtiquetaStatus("ONLINE");
                  P.SetAlarma(0);
                    System.out.println("OK");
                }              
                else if(status==1)
                {
                  P.setEtiquetaStatus("Sound Down");
                  P.SetAlarma(1);              
                }
                else if(status==2){
                  P.setEtiquetaStatus("Service Down");
                  P.SetAlarma(2);
                }
                    
            }catch (InterruptedException ex) {
                Logger.getLogger(ThreadStatus.class.getName()).log(Level.SEVERE, null, ex);
                //error de thread
                P.SetLog("Thread error Thread Status");
                 P.setEtiquetaStatus("Service Down");
            }
            //error de red     
      }        
    }
    
    public int ReadStatusServ(String serv,String port,String cmd){
        try {
            
            clientsocket=new Socket(serv,Integer.parseInt(port));
            
            outToServer = new DataOutputStream(clientsocket.getOutputStream());
            inFromServer = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
            String sentence = cmd;
            outToServer.writeBytes(sentence + '\n');
            String modifiedSentence = inFromServer.readLine();
            System.out.println("FROM SERVER: " + modifiedSentence);
            P.SetLog("FROM SERVER: " + modifiedSentence);
            clientsocket.close();  
           
            if(modifiedSentence.equals("OK")){
               return 0;
            }
            else{
                return 1;
            }
            
                  
        } catch (IOException ex) {
            Logger.getLogger(ThreadStart.class.getName()).log(Level.SEVERE, null, ex);
           // JOptionPane.showMessageDialog(null, "Servicio no encontrado");
            P.SetLog("Servicio no encontrado");
            return 2;
        }
    }
    
    
}
