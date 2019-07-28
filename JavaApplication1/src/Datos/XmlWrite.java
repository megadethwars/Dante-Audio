/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import com.sun.jndi.ldap.LdapName;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import pruebas.PruebaXML.*;
import xml.analizador.dom.*;
import xml.analizador.dom.modelo.Tag;
import xml.analizador.dom.modelo.Atributo;
import xml.analizador.dom.JespXML;

/**
 *
 * @author leone
 */
 

public class XmlWrite {
    
  
    public XmlWrite(){
    }
    
    public boolean write(Configuracion Conf,String file){
      
        try {
            // TODO code application logic here
             ArrayList<String> canalesConf=Conf.GetLista();  //lista de puertos de canales
             ArrayList<String> Alias=Conf.GetAlias();
             ArrayList<String> Ims=Conf.GetListaImages();
            
            JespXML J=new JespXML(file);
            Tag raiz=new Tag("CONFIGURACION");
            Tag servidor=new Tag("SERVIDOR");
            Tag Images=new Tag("IMAGES");
            Tag multicast=new Tag("MULTICAST");
            Tag serv=new Tag("SERV");
            Tag escape=new Tag("ESC");
            Tag Asio=new Tag("ASIO");
            Tag Frecuencia=new Tag("FRECUENCIA");
            Tag Muestra=new Tag("MUESTRA");
            Tag Network=new Tag("NETWORK");
            Tag PortUDP=new Tag("PortUDP");
            ArrayList<Tag> canales=new ArrayList<Tag>();
            ArrayList<Tag> Imagenes=new ArrayList<Tag>();
           
            
            multicast.addContenido(Conf.GetMultiCast());
            serv.addContenido(Conf.GetServidor());         
            escape.addContenido(Conf.GetPuerto());
            PortUDP.addContenido(Conf.GetPortUDP());
            
            for(int a=0;a<32;a++){
                canales.add(new Tag("CANAL"));
                canales.get(a).addAtributo("id",Alias.get(a));
                           
                canales.get(a).addContenido(Conf.GetPortUDP());
                              
                Asio.addTagHijo(canales.get(a));
            }
            
            Frecuencia.addContenido(Integer.toString(Conf.GetFrecuencia()));
            Muestra.addContenido(Integer.toString(Conf.GetMuestra()));
            Network.addContenido(Conf.GetNet());
            Asio.addTagHijo(Frecuencia);
            Asio.addTagHijo(Muestra);
            Asio.addTagHijo(Network);
            
            
            for(int i=0;i<32;i++){
                Imagenes.add(new Tag("IMAGE"));
                //Imagenes.get(i).addAtributo("id",Alias.get(i));
                               
                Imagenes.get(i).addContenido(Ims.get(i));
                              
                Images.addTagHijo(Imagenes.get(i));
            }
            
            raiz.addTagHijo(servidor);
            raiz.addTagHijo(Asio);
            raiz.addTagHijo(Images);
            
            
                     
            servidor.addTagHijo(multicast);
            servidor.addTagHijo(serv);
            servidor.addTagHijo(escape);
            servidor.addTagHijo(PortUDP);
           
            
            J.escribirXML(raiz);
            System.out.println("Escrito correctamente");
            Logs.Write("Configuracion escrita correctamente");
            return true;
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XmlWrite.class.getName()).log(Level.SEVERE, null, ex);
            Logs.Write("error de configuracion");
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XmlWrite.class.getName()).log(Level.SEVERE, null, ex);
            Logs.Write("NO se encontro el archivo xml");
            return false;
        } catch (TransformerException ex) {
            Logger.getLogger(XmlWrite.class.getName()).log(Level.SEVERE, null, ex);
            Logs.Write("Error de escritura de xml");
            return false;
        }
      
    }
    
}
