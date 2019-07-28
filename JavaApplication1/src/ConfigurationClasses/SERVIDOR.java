/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConfigurationClasses;

/**
 *
 * @author leone
 */

public class SERVIDOR {
 private String MULTICAST;
 private String SERV;
 private String ESC;
 private String PortUDP;


 // Getter Methods 

 public String getMULTICAST() {
  return MULTICAST;
 }

 public String getSERV() {
  return SERV;
 }

 public String getESC() {
  return ESC;
 }

 public String getPortUDP() {
  return PortUDP;
 }

 // Setter Methods 

 public void setMULTICAST(String MULTICAST) {
  this.MULTICAST = MULTICAST;
 }

 public void setSERV(String SERV) {
  this.SERV = SERV;
 }

 public void setESC(String ESC) {
  this.ESC = ESC;
 }

 public void setPortUDP(String PortUDP) {
  this.PortUDP = PortUDP;
 }
}