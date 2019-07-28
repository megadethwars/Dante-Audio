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
public class CONFIGURACION {
 SERVIDOR SERVIDORObject;
 ASIO ASIOObject;
 IMAGES IMAGESObject;


 // Getter Methods 

 public SERVIDOR getSERVIDOR() {
  return SERVIDORObject;
 }

 public ASIO getASIO() {
  return ASIOObject;
 }

 public IMAGES getIMAGES() {
  return IMAGESObject;
 }

 // Setter Methods 

 public void setSERVIDOR(SERVIDOR SERVIDORObject) {
  this.SERVIDORObject = SERVIDORObject;
 }

 public void setASIO(ASIO ASIOObject) {
  this.ASIOObject = ASIOObject;
 }

 public void setIMAGES(IMAGES IMAGESObject) {
  this.IMAGESObject = IMAGESObject;
 }
}