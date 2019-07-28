/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConfigurationClasses;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author leone
 */

@XmlRootElement  
public class PrimaryClass {
 CONFIGURACION CONFIGURACIONObject;


 // Getter Methods 

 public CONFIGURACION getCONFIGURACION() {
  return CONFIGURACIONObject;
 }

 // Setter Methods 

 public void setCONFIGURACION(CONFIGURACION CONFIGURACIONObject) {
  this.CONFIGURACIONObject = CONFIGURACIONObject;
 }
}
