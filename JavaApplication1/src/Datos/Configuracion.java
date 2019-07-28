/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.ArrayList;

/**
 *
 * @author leone
 */
public class Configuracion {
    
    private String multicast;
    private String servidor;
    private String puerto;
    private ArrayList<String> ListaPuertos;
    private ArrayList<String> ListaAlias;
    private ArrayList<String> ListaImages;
    private int Frecuencia;
    private int Muestra;
    private String Network;
    private String PortUDP;
    
    
    public void SetMultiCast(String multicast){
      this.multicast=multicast;
    }
    
    public String GetMultiCast(){
      return multicast;
    }
    
    public void SetPuerto(String puerto){
      this.puerto=puerto;
    }
    
    public String GetPuerto(){
      return puerto;
    }
    
    public void SetServidor(String servidor){
       this.servidor=servidor;
    }
    
    public String GetServidor(){
       return servidor;
    }
    
    public void SetLista(ArrayList<String> ListaPuertos){
        this.ListaPuertos=ListaPuertos;
    }
    
    public ArrayList<String> GetLista(){
      return ListaPuertos;
    }
    
    public void SetAlias(ArrayList<String> ListaAlias){
      this.ListaAlias=ListaAlias;
    }
    
    public ArrayList<String> GetAlias(){
      return ListaAlias;
    }
    
    public void SetFrecuencia(int Frecuencia){
        this.Frecuencia=Frecuencia;
    }
    
    public int GetFrecuencia(){
      return Frecuencia;
    }
    
    public void SetMuestra(int Muestra){
        
        this.Muestra=Muestra;
    }
    
    public int GetMuestra(){
      return Muestra;
    }
    
    public void SetPortUDP(String PortUDP){
        this.PortUDP=PortUDP;
    }
    public String GetPortUDP(){
        return PortUDP;
    }
   
   public void SetNet(String Network){
     this.Network=Network;
   }
   
   public String GetNet(){
       return Network;
   }
   
   public void SetListaImages(ArrayList<String> ListaImages){
       this.ListaImages=ListaImages;
   } 
   
   public ArrayList<String> GetListaImages(){
       return ListaImages;
   }
    
}
