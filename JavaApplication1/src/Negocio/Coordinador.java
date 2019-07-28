/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Datos.XmlWrite;
import Datos.XmlRead;
import Interfaz.PanelAjustes;
import Interfaz.PanelMixer;
import Interfaz.Panel;
import Datos.*;
import java.util.ArrayList;
/**
 *
 * @author leone
 */
public class Coordinador {
    private Configuracion Conf;
    private XmlRead X;
    private Channels Ch;
    private char[] buffer;
    private String status;
    private Status E;
    private Panel P;
    private XmlWrite XW;
    private Solicitud Proceso;
    private WriteXml W;
    private Configuracion Conf2;
    private XmlRead X2;
    
    public Coordinador(Panel P){
        this.P=P;
         X=new XmlRead();
         buffer=new char[64];
         Ch=new Channels();
         E=new Status();
         XW=new XmlWrite();
         ReadXml();
         //Proceso=new Solicitud(this.P);
         W=new WriteXml();
    }
    
    public void SetPanel(Panel P){
        this.P=P;
    }
    
    public Panel GetPanel(){
    return P;
    }
    
    
    
    public void ReadXml(){
      //leer archivo xml
     
        Conf=X.Read("config.xml");
      //pintar en panel
        
    }
     
    public void WriteXml(Configuracion Conf2,String file){
        
      XW.write(Conf2,file);
      //W.Write(Conf, file);
    }
    
    public void DefaultXml(){
        //leer archivo xml
      X2=new XmlRead();
      Conf2=X2.Read("default.xml");        
      XW.write(Conf2,"config.xml");
        //re-estribir archivo xml
       
    }
    
    public void StartProcess(){
      //leer xml
     
        Conf=X.Read("config.xml");
      //conocer numero de canales disponibles 
       buffer=Ch.ReadStatusServ(Conf.GetServidor(),Conf.GetPuerto(),"C");
      
       status=E.ReadStatusServ(Conf.GetServidor(),Conf.GetPuerto(), "S");
            
    }
    
    public void StartProcess2(){
        //leer configuracion
         Conf=X.Read("config.xml");
         //capturar configuraciones
        
        ArrayList<String> canales=P.GetCanales();
        ArrayList<Integer> ganancias=P.GetGanancias();
        Proceso.SetCanales(canales);
        Proceso.SetGanancias(ganancias);
         
      //Proceso.Send(Conf.GetServidor(), Integer.parseInt(Conf.GetPuerto()), Conf.GetLista().get(0));
        //iniciar envio de datos hacia servidor
        
        
      // boolean comprobar= Proceso.ReadStatusServ(Conf.GetServidor(),Conf.GetPuerto(), Conf.GetLista().get(0));
    }
    
    public void StopProcess(){
       //parar proceso
       boolean comprobar=Proceso.StopThread();
    }
    
    public void Ping(){
    
    }
    
    public void ListaProcesos(){
    
    }
    
    public void SetConfiguracion(Configuracion Conf){
      this.Conf=Conf;
    }
    
    public Configuracion GetConfiguracion(){
      return Conf;
    }
   
}
