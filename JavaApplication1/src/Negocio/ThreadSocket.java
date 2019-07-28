/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import Datos.Configuracion;
import Datos.XmlRead;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import Interfaz.Panel;
import java.awt.Color;
import javax.swing.JSlider;
import java.math.*;
import javax.swing.JButton;
import Datos.Logs;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.sound.sampled.FloatControl;
import javax.swing.JOptionPane;

/**
 *
 * @author ocamp
 */
public  class ThreadSocket extends Thread{
  
    private Configuracion Conf;
    private XmlRead X;
    private int puerto;
    
    private InetAddress grupo;
   
    private byte[] buffer=new byte[8192];
  
    private DatagramPacket PaqueteCliente;
    private Panel P;
    private int Frecuencia;
    private int Muestra;
    private volatile boolean continuar=false;
    
    private static DatagramSocket socket;
    
    public ThreadSocket(int puerto){
         
        this.puerto=puerto;
          
        this.P=P;
        this.Frecuencia=Frecuencia;  
      
    }
    
    
    public byte[] GetVector(){
        return buffer;
    }
    
    
     @Override
     
     public  void run(){
        try {
             socket = new DatagramSocket(10006);
  
            PaqueteCliente = new DatagramPacket(buffer,buffer.length);
            System.out.println("gay");
           while(true){
               
                      // System.out.println("esperando");  
                 try {
                     socket.receive(PaqueteCliente);
                     buffer=PaqueteCliente.getData();
                     
                     //System.out.println("gay");
                 } catch (IOException ex) {
                     Logger.getLogger(ThreadSocket.class.getName()).log(Level.SEVERE, null, ex);
                     System.out.println("error");
                 }
           
           }      
            
        } catch (SocketException ex) {
            Logger.getLogger(ThreadSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     }
    
    
}
