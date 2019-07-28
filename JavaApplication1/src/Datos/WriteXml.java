/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
/**
 *
 * @author Leonel López
 */
public class WriteXml {
    private Configuracion Conf;
    private String file;
    public WriteXml(){
    
    }
    
    public boolean Write(Configuracion Conf,String file){
        this.Conf=Conf;
        this.file=file;
        
        try {
            ArrayList<String> canalesConf=Conf.GetLista();  //lista de puertos de canales
            ArrayList<String> Alias=Conf.GetAlias();
            
            if(canalesConf.isEmpty() || Alias.isEmpty()){
                return false;
            }
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, file, null);
            document.setXmlVersion("1.0");
            
            //escritura de archvo
            Element raiz = document.getDocumentElement();
            //servidor
                 
            Element servidor=document.createElement("SERVIDOR");                       
            Element multicast=document.createElement("MULTICAST");
            Text ValueMulticast=document.createTextNode(Conf.GetMultiCast());
            multicast.appendChild(ValueMulticast);
            Element serv=document.createElement("SERV");
            Text Valueserv=document.createTextNode(Conf.GetServidor());
            serv.appendChild(Valueserv);
            Element esc=document.createElement("ESC");
            Text Valuesc=document.createTextNode(Conf.GetPuerto());
            esc.appendChild(Valuesc);           
            servidor.appendChild(multicast);
            servidor.appendChild(serv);
            servidor.appendChild(esc);
            raiz.appendChild(servidor);
            
            //canales
            Element Asio=document.createElement("ASIO");
            for(int i=0;i<Conf.GetLista().size();i++){
                Element canal=document.createElement("CANAL");
                canal.setAttribute("id", Conf.GetAlias().get(i));
                Text Valuecanal=document.createTextNode(Conf.GetLista().get(i));
                canal.appendChild(Valuecanal);
                Asio.appendChild(canal);
               
            }
            
            Element frecuencia=document.createElement("FRECUENCIA");
            Text Valuefrecuencia=document.createTextNode(Integer.toString(Conf.GetFrecuencia()));
            frecuencia.appendChild(Valuefrecuencia);
            Asio.appendChild(frecuencia);
            Element muestra=document.createElement("MUESTRA");
            Text Valuemuestra=document.createTextNode(Integer.toString(Conf.GetMuestra()));
            muestra.appendChild(Valuemuestra);
            Asio.appendChild(muestra);
            
            
            raiz.appendChild(Asio);
            
            //muestreo y frecuencia
            
            Source source = new DOMSource(document);
            //Indicamos donde lo queremos almacenar
            Result result = new StreamResult(new java.io.File(file+".xml")); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            
            return true;
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(WriteXml.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(WriteXml.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        } catch (TransformerException ex) {
            Logger.getLogger(WriteXml.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
        
     
    }
    
}
