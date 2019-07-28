/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author leone
 */
public class Estado {
    
    private boolean conect;
    private boolean running;
    private int canales;
    
      public void Setconect(boolean conect){
       this.conect=conect;
    }
      
    public boolean Getconect(){
      return conect;
    }
    
    public void Setrunning(boolean running){
      this.running=running;
    }
    
    public boolean getrunning(){
      return running;
    }
    
    public void Setcanales(int canales)
    {
       this.canales=canales;
    }
    
    
    public int getcanales(){  
    return canales;
    }
    
    
}
