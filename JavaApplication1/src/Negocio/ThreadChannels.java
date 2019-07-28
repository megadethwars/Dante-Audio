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
import java.util.Arrays;

/**
 *
 * @author leone
 */
public class ThreadChannels extends Thread{
    
    private Configuracion Conf;
    private XmlRead X;
    private String servidor;
    private String puerto;
    private InetAddress Inet;
    private Socket clientsocket;
    private DataOutputStream outToServer;
    private BufferedReader inFromServer;
    private boolean status;
    private Panel P;
        

    public ThreadChannels(Panel P){
        this.P=P;
    
    }
    
   
    @Override
    public void run(){
      
        while(true) 
      {
            try {
                Thread.sleep(13000);
                X=new XmlRead();
                Conf=X.Read("Configuracion.xml");
            
             //asignar string servidor
               servidor=Conf.GetServidor();
                  puerto=Conf.GetPuerto();
                  clientsocket=new Socket(servidor,Integer.parseInt(puerto));
                
                status=ReadStatusServ(servidor, puerto, "C");
                
              
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadStatus.class.getName()).log(Level.SEVERE, null, ex);
                //error de thread
                P.SetLog("Thread error ThreadChnnels");
            } catch (IOException ex) {
                Logger.getLogger(ThreadStatus.class.getName()).log(Level.SEVERE, null, ex);
                //error de red
                P.SetLog("Error de red, verifique conexion");
            }     
      }        
    }
    
    public boolean ReadStatusServ(String serv,String port,String cmd){
        try {
            outToServer = new DataOutputStream(clientsocket.getOutputStream());
            inFromServer = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
            String sentence = cmd;
           outToServer.writeBytes(sentence + '\n');
           char[] buffer=new char[64];
           //int in=inFromServer.read(buffer);
           String in=inFromServer.readLine();
           //System.out.println(Arrays.toString(buffer));
            StringBuilder canales=new StringBuilder();
            System.out.println("From server = "+Arrays.toString(in.getBytes()));
          
            canales.append("[");
              for(int i=0;i<in.getBytes().length;i++){
                if(in.getBytes()[i]==48)
                {
                    canales.append("0");
                    canales.append(",");
                }
                
                if(in.getBytes()[i]==49)
                {
                    canales.append("1");
                    canales.append(",");
                }
                 
              }
            canales.append("]");
            P.SetLog("Canales disponibles "+canales);
           clientsocket.close();  
           P.setEtiquetaCanales("PUERTOS DISPONIBLES: "+canales);
                   return true;
        } catch (IOException ex) {
            Logger.getLogger(ThreadStart.class.getName()).log(Level.SEVERE, null, ex);
           // JOptionPane.showMessageDialog(null, "Servicio no encontrado");
            P.SetLog("Servicio no encntrado");
            P.setEtiquetaCanales("NO PORTS AVAILABLES ");
            return false;
        }
    }
    
}
