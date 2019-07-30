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
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import javax.sound.sampled.FloatControl;
import javax.swing.JOptionPane;


/**
 *
 * @author leone
 */
public class ThreadAudio extends Thread{
    private AudioFormat format;
    private SourceDataLine sourceline;
    private Configuracion Conf;
    private XmlRead X;
    private String puerto;
    private String multicast;
    private InetAddress grupo;
    private MulticastSocket socket;
    private byte[] buffer;
    private byte[] sonido;
    private DatagramSocket Sock;
    private DatagramPacket PaqueteCliente;
    private Panel P;
    private int Frecuencia;
    private int Muestra;
    private volatile boolean continuar=false;
    private int numerodecanal;
    private JSlider V;
    private JButton B;
    private String Network=null;
    FloatControl volCtrl;
    private ThreadSocket hilosocket;
    short y;
    private boolean isrunning = false;
    private boolean isforcedOff = false;
    
    
    public ThreadAudio(String Network,String puerto,String multicast,Panel P,int Frecuencia,int muestra,int numerocanal,JSlider V,JButton B,ThreadSocket hilosocket){
       
        format=new AudioFormat(Frecuencia, 16, 1, true, true);
        this.hilosocket=hilosocket;
        DataLine.Info info=new DataLine.Info(SourceDataLine.class,format);
        this.puerto=puerto;
        this.multicast=multicast;
        this.P=P;
        this.Frecuencia=Frecuencia;
        this.Muestra=muestra;
        this.numerodecanal=numerodecanal;
        this.V=V;
        this.numerodecanal=numerocanal;
        this.B=B;
        this.Network=Network;
        sonido=new byte[Muestra*2];
        buffer=new byte[8192];
        if (!AudioSystem.isLineSupported(info)){
                try {
                    System.out.println("Line matching " + info + " is not supported.");
                    P.SetLog("Error de tarjeta de audio ");
                    P.SetMSG("Error de Audio",true);
                    Logs.Write("Error de tarjeta de Audio");
                    throw new LineUnavailableException();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(ThreadAudio.class.getName()).log(Level.SEVERE, null, ex);
                     P.SetLog("Error de tarjeta de audio ");
                     P.SetMSG("Error de Audio",true);
                     Logs.Write("Error de tarjeta de audio");
                    //audio no soportado
                }
                B.setBackground(Color.red);
            }
         
         try {
             sourceline = (SourceDataLine)AudioSystem.getLine(info);
             sourceline.open(format);
             FloatControl control = (FloatControl)sourceline.getControl(FloatControl.Type.MASTER_GAIN);
             //control.setValue(100.0f);
             sourceline.start();
             
         } catch (LineUnavailableException ex) {
            try {
                Logger.getLogger(ThreadAudio.class.getName()).log(Level.SEVERE, null, ex);
                
                //error de audio
                B.setBackground(Color.red);
                Thread.sleep(1000);
                B.setBackground(Color.GRAY);
            } catch (InterruptedException ex1) {
                Logger.getLogger(ThreadAudio.class.getName()).log(Level.SEVERE, null, ex1);
                B.setBackground(Color.GRAY);
            }

         }
                 
    }
    
    //audio ya instanciado
    
    @Override
    public void run(){
        try {
            
            try{
            if(Network.equals("default")){
            socket=new MulticastSocket(Integer.parseInt(puerto));
            grupo=InetAddress.getByName("224.0.0.3");
            
            socket.joinGroup(grupo);
            socket.setSoTimeout(5000);
            
            
            socket.setSoTimeout(5000);
            }
            else{
            NetworkInterface nif = NetworkInterface.getByName(Network);
            socket = new MulticastSocket(Integer.parseInt(puerto));
            socket.setSoTimeout(5000);
            socket.joinGroup(new InetSocketAddress("224.0.0.3",Integer.parseInt(puerto)), nif);
            
            }
            }catch(Exception ex){
            System.out.println("error de socket");
            }
            
            
            //Sock = new DatagramSocket(Integer.parseInt(puerto));
            PaqueteCliente = new DatagramPacket(buffer,0,buffer.length,grupo,Integer.parseInt(puerto));
            //Sock.setSoTimeout(5000);
            int canal=selectorAudio(numerodecanal);
            sonido=new byte[Muestra*2];
            //cliclo while de recepcion de audio
            // PaqueteCliente=new DatagramPacket(buffer, 0, buffer.length);
            System.out.println("asignado el puerto  "+Integer.parseInt(puerto));
            Logs.Write("Iniciando audio por canal  "+numerodecanal);
            P.SetLog("Asignado el puerto "+Integer.parseInt(puerto));
            P.SetMSG("INICIO DE AUDIO", true);
            System.out.println(Muestra);
            System.out.println("canal"+canal);
            System.out.println(sonido.length);
            byte b1,b2;
            short contador = 0,s3;
            float vol = 1 ,resta =1;
            
            float pot = 1;
            int tiempo = 0;
            Boolean baja1 = false,baja2= false,sube1=false;
            long RMS=0;
            isrunning = true;
            while(!continuar){
                socket.receive(PaqueteCliente);
                //Sock.receive(PaqueteCliente);
               
                for(int x=0;x<(Muestra*2);x+=2){
                    sonido[x+1]= (PaqueteCliente.getData()[x+canal]);
                    sonido[x]= (PaqueteCliente.getData()[x+1+canal]);
                    
                    b1=sonido[x];
                    b2=sonido[x+1];
                    //System.out.println(b1+b2);
                    //sh1=(short)b1;
                    //sh2=(short)b2;
                    //sh1<<=8;
                    
                    //y=(short)(sh1 | sh2);
                    //sh2=(short) (((sh2>>8)&0xFF)|((sh2&0xFF)<<8));
                    //y=(float)sh2;
                    
                    //y/=Math.pow(2,8-V.getValue());
                    // System.out.println(b1+"   "+b2);
                    
                    //y=sh2;
                    
                    y=ByteBuffer.wrap(new byte[]{b1,b2}).getShort();
                    
                    
                    y/=pot;
                    
                    y*=V.getValue()/10.0;
                    //y=(short) (1024*Math.pow(y, (1/3)));
                    //y*=vol;
                    s3=y;
                    b2=(byte)s3;   ///lsb
                    s3>>=8;
                    s3=(short) (s3);  ////msb
                    b1=(byte)s3;
                    //System.out.println(y);
                    
                    
                    //b1=(byte)sh1;
                    //b2=(byte)sh2;
                    
                    sonido[x]=b1;          /////msb
                    sonido[x+1]=b2;            
                         
                    //System.out.println(b2+" dsdfsdfsdf  "+b1);
                    //a=(int)sonido[x]/2;
                    //sonido[x]=(byte)a;
                    // if(sonido[x]<0)
                    //sonido[x]-=128;
                /*if(baja1=true && vol>200)
                    {
                        vol=(vol-resta);
                        
                        //vol = Math.round((vol * 100d)/100d);
                        System.out.println(vol);
                    }*/
                    //if(tiempo > 0)
                      //  tiempo --;
                    //RMS+=y*y;
                }
                /*
                contador++;
                int v2=9;
                if(contador>=10){
                    RMS=(long) Math.sqrt(RMS/640);
                    
                    
                    if (RMS>15000){
                    tiempo = 131072;
                    //V.setValue(5);
                    pot = 1; //baja el volumen  
                    //vol = 1; // sube el volumen
                   
                    if (vol!=1)
                        vol--;
                        v2--;
                        V.setValue(v2);
                    }
                    
                    
                    if(RMS>5000 && RMS<15000 && tiempo ==0)
                    {
                        //vol = (float)2;
                        vol = 2;
                        tiempo = 131072;
                        V.setValue(7);
                        baja1=true;
                    }
                    
                    
                    
                    if(RMS<5000 && tiempo==0){
                        
                        if (vol!=4)
                        {
                            v2++;
                            vol++;
                            V.setValue(v2);
                        }
                        
                        pot = 1;
                        baja1=false;
                        //V.setValue(9);
                        //vol = (float) 4;
                        
                    }
                    RMS=0;
                    contador=0;
                    */
                    
                
                
               
                /* for(int x=0;x<(Muestra*2);x++){
                sonido[x]= (PaqueteCliente.getData()[x+canal]);
                }*/
                    
                sourceline.write(sonido,0,sonido.length);
                
            }   System.out.println("hilo finalizado ");
            P.SetLog("Audio Finalizado ");
            Logs.Write("Audio por canal  "+numerodecanal+" finalizado ");
            socket.disconnect();
            socket.close();
            P.SetMSG("FIN DE AUDIO", true);
            P.TurnOnSend();
            P.TurnOffStop();
            System.out.println("FINALIZADO");
            
        } catch (SocketException ex) {
            isrunning=false;
            Logger.getLogger(ThreadAudio.class.getName()).log(Level.SEVERE, null, ex);
            P.SetLog("error de socket ");
            B.setBackground(Color.red);
        } catch (IOException ex) {
            isrunning = false;
            Logger.getLogger(ThreadAudio.class.getName()).log(Level.SEVERE, null, ex);
            P.SetLog("error de socket ");
            B.setBackground(Color.red);
        }
    }
    
     public void detener(){
         isrunning = false;
      System.out.println("hilo detenido ");
        P.SetLog("Audio detenido  ");
        P.SetMSG("FIN DE AUDIO", true);
        continuar=true;
        sourceline.flush();      
        socket.close();
      //    P.TurnOnSend();
      //    P.TurnOffStop();
 }
     
    public int selectorAudio(int canal){
        int cuenta=0;
        System.out.println("canalS"+canal);
        cuenta=canal*Muestra*2;
        return cuenta;
    }
    
    public boolean IsRunning(){
      return isrunning;
    }
    
    public boolean GetForcedDown(){
     return isforcedOff;   
    }
    
    public void SetForcedDown(boolean isforcedoff){
        this.isforcedOff = isforcedoff;
    
    }
    
    private static float limit(FloatControl control,float level)
    { 
        return Math.min(control.getMaximum(), Math.max(control.getMinimum(), level)); 
    }
    
}
