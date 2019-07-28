/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.ThreadStart;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author leone
 */
public class Status {
       private String servidor;
    private String puerto;
    private InetAddress Inet;
    private Socket clientsocket;
    private DataOutputStream outToServer;
    private BufferedReader inFromServer;
    
    public Status(){
    }
    
    
    public String ReadStatusServ(String serv,String port,String cmd){
        try {
            
            servidor=serv;
            puerto=port;
            clientsocket=new Socket(servidor,Integer.parseInt(puerto));
            
            outToServer = new DataOutputStream(clientsocket.getOutputStream());
            inFromServer = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
            String sentence = cmd;
            outToServer.writeBytes(sentence + '\n');
            String buffer=null;
            buffer=inFromServer.readLine();
           // System.out.println(Arrays.toString(buffer));
            clientsocket.close(); 
            
            System.out.println("PUERTOS ENCONTRADOS  ");
                   return buffer;
               } catch (IOException ex) {
                  Logger.getLogger(ThreadStart.class.getName()).log(Level.SEVERE, null, ex);
                  JOptionPane.showMessageDialog(null, "Servicio no encontrado");
                  return null;
        }
    }
    
}
