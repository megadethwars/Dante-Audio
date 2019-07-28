/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaz.Panel;
import java.io.DataInputStream;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import Datos.XmlRead;
import Datos.Configuracion;
import java.util.Arrays;

/**
 *
 * @author leone
 */
public class Solicitud {
    
   private Socket socket;
   private ArrayList<String> canales;
   private ArrayList<Integer> ganancias;
   private Panel P;
   private BufferedReader fromServer;
   private DataOutputStream outToServer;
   private ThreadAudio Audio;
   private XmlRead X;
   private Configuracion Conf;
  
    public Solicitud(Panel P){
     this.P=P;
     X=new XmlRead();
     Conf=X.Read("configuracion.xml");
   //  Audio=new ThreadAudio("90000",Conf.GetMultiCast(),P);
   
    }
    
    public void SetCanales(ArrayList<String> canales){
        this.canales=canales;
    
    }
    
    public void SetGanancias(ArrayList<Integer> ganancias){
        this.ganancias=ganancias;
    }
    
    
    public String Send(String servidor,int puerto,String channel){
           P.SetLog("Enviando solicitud  ");
       try {
           socket=new Socket(servidor, puerto);
           socket.setSoTimeout(1000);
           
           DataOutputStream outtoserver=new DataOutputStream(socket.getOutputStream());
       //    DataInputStream  inFromClient = new DataInputStream (socket.getInputStream());
           fromServer=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            char[] cbuf = new char[1024];
           //crear flujos de fdatos
           StringBuilder dato=new StringBuilder();
           dato.append("P="+channel);
           dato.append("/");
           for(int i=0;i<32;i++){
               dato.append("C"+Integer.toString(i+1)+"="+canales.get(i));
               dato.append("/");
           }
           for(int i=0;i<32;i++){
               dato.append("V"+Integer.toString(i+1)+"="+Integer.toString(ganancias.get(i)));
               dato.append("/");
           }
           dato.append("\n");
          
           outtoserver.writeBytes(dato.toString());
           //outtoserver.write(dato.toString());  
           char[] buffer=new char[64];
           int resp=fromServer.read(buffer);
           System.out.println(buffer.toString());
            
           P.SetLog("Solicitud enviada ");
       //    String response=inFromClient.readLine();
       //    System.out.println(response);
           //wait
           
           socket.close();
           
           
           
       } catch (IOException ex) {
           Logger.getLogger(Solicitud.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("sin conexion ");
           P.SetLog("ERROR EN ENVIO DE SOLICITUD, SERVICIO NO ENCONTRADO ");
           return "FAIL";
           
       }
      
       return null;
   
    }
    
    
    public boolean StopThread(){
        System.out.println("deteniendo hilo ");
                   
           if(Audio.isAlive()){
            Audio.detener();
            Audio.stop();
          
        }
                   
      return false;
    }
    
    /*
    public boolean ReadStatusServ(String serv,String port,String channel){
        P.SetLog("Enviando solicitud");
        P.SetMSG("Enviando Solicitud", true);
        byte[] buffer=new byte[256];
        
        try {
            socket=new Socket(serv,Integer.parseInt(port));
            
                if(!socket.isConnected()){
                    System.out.println("NO CONECTADO");
                    return false;
                }
            
            socket.setSoTimeout(4000);
                
            
            
             outToServer = new DataOutputStream(socket.getOutputStream());
            fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String sentence = channel;
                    
            StringBuilder dato=new StringBuilder();
           dato.append("P="+channel);
           dato.append("/");
           for(int i=0;i<16;i++){
               
               if(canales.get(i).equals("ON")){
                   dato.append("1");
               }
               else if(canales.get(i).equals("OFF")){
                 dato.append("0");
               }
           }
           dato.append("/");
           for(int i=0;i<16;i++){
               dato.append(Integer.toString(ganancias.get(i)));               
           }        
             dato.append("/"); 
             dato.append("\n");
             System.out.println(dato.toString());                          
             //outToServer.writeBytes(dato.toString()+'\n');
           outToServer.write(dato.toString().getBytes());
           String modifiedSentence=null;
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Solicitud.class.getName()).log(Level.SEVERE, null, ex);
            }
           modifiedSentence = fromServer.readLine();
           
           String nuevopuerto=null;
           buffer=modifiedSentence.getBytes();
           if(modifiedSentence.startsWith("OK")){
             
               nuevopuerto = modifiedSentence.substring(3);
               System.out.println("PUERTO DEL SERVIDOR  "+nuevopuerto);
           }
           
           System.out.println("FROM SERVER: " + Arrays.toString(buffer));
           P.SetLog("From Server: "+modifiedSentence+" ");      
           
           socket.close();  
           P.SetLog("Solicitud enviada ");           
           Conf=X.Read("configuracion.xml");
          
           
             if(Integer.parseInt(nuevopuerto)>10){
              //   Audio.detener();
          //       Audio.stop();
                                      
                  if(!Audio.isAlive()){
                        Audio=new ThreadAudio(nuevopuerto,Conf.GetMultiCast(),P);
                      System.out.println("HILO TERMINADO");   
                        Audio.start();
                  }              
               //P.TurnOffSend();
               P.TurnOnStop();
             }
             else
             {
              P.SetLog("ERROR DE APERTURA DE PUERTO ");
            P.SetMSG("ERROR DE APERTURA DE PUERTO", true);
             P.TurnOnSend();
             P.TurnOffStop();
                return false;              
             }
                          
                   return true;
                   //iniciar audio                                    
        } catch (IOException ex) {
            Logger.getLogger(ThreadStart.class.getName()).log(Level.SEVERE, null, ex);
         //   JOptionPane.showMessageDialog(null, "Servicio no encontrado");
            P.SetLog("ERROR EN ENVIO DE SOLICITUD, SERVICIO NO ENCONTRADO ");
            P.SetMSG("ERROR DE SOLICITUD", true);
             //P.TurnOnSend();
             P.TurnOffStop();
             System.out.println("Error de envio de solicitud");
            return false;            
        }
        
    }
    */
    
    
}
