/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Interfaz.Panel;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ocamp
 */
public class Threadtime extends Thread{
    
    private Panel P;
    
    public Threadtime(Panel P){
        this.P=P;
    
    }
    
    @Override
   public void run(){
        while(true){
            try {
                P.SetTime();
                
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threadtime.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   }
    
}
