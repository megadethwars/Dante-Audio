/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Leonel López
 */
public class Logs {
    private static FileWriter archivo;
    private Calendar fechaActual;
    
    public static Boolean Write(String mensaje){
        
        try {
            if(!new File("log.txt").exists()){
                try {
                    archivo=new FileWriter(new File("log.txt"),false);
                } catch (IOException ex) {
                    Logger.getLogger(Logs.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
            
            archivo = new FileWriter(new File("log.txt"), true);
            Calendar fechaActual = Calendar.getInstance(); //Para poder utilizar el paquete calendar
            //Empieza a escribir en el archivo
            archivo.write((String.valueOf(fechaActual.get(Calendar.DAY_OF_MONTH))
                    +"/"+String.valueOf(fechaActual.get(Calendar.MONTH)+1)
                    +"/"+String.valueOf(fechaActual.get(Calendar.YEAR))
                    +";"+String.valueOf(fechaActual.get(Calendar.HOUR_OF_DAY))
                    +":"+String.valueOf(fechaActual.get(Calendar.MINUTE))
                    +":"+String.valueOf(fechaActual.get(Calendar.SECOND)))+" - "+mensaje+"\r\n");
            archivo.close();
            
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Logs.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
