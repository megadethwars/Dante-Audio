/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConfigurationClasses;

import java.util.ArrayList;

/**
 *
 * @author leone
 */

public class ASIO {
 ArrayList < Object > CANAL = new ArrayList < Object > ();
 private String FRECUENCIA;
 private String MUESTRA;
 private String NETWORK;


 // Getter Methods 

 public String getFRECUENCIA() {
  return FRECUENCIA;
 }

 public String getMUESTRA() {
  return MUESTRA;
 }

 public String getNETWORK() {
  return NETWORK;
 }

 // Setter Methods 

 public void setFRECUENCIA(String FRECUENCIA) {
  this.FRECUENCIA = FRECUENCIA;
 }

 public void setMUESTRA(String MUESTRA) {
  this.MUESTRA = MUESTRA;
 }

 public void setNETWORK(String NETWORK) {
  this.NETWORK = NETWORK;
 }
}