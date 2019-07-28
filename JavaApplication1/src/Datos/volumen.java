/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.IOException;
import javax.swing.JSlider;
/**
 *
 * @author ocamp
 */
public class volumen {
    private JSlider vol;
    public volumen(JSlider vol)
    {
        this.vol=vol;
    }
    public void setSystemVolume(int volume)
{
    String nircmdFilePath="C:\\Windows\\nircmd.exe"; 
    if(volume < 0 || volume > 100)
    {
        throw new RuntimeException("Error: " + volume + " is not a valid number. Choose a number between 0 and 100");
    }

    else
    {
        double endVolume = 655.35 * volume;

        Runtime rt = Runtime.getRuntime();
        Process pr;
        try 
        {
            pr = rt.exec(nircmdFilePath + " setsysvolume " + endVolume);
            pr = rt.exec(nircmdFilePath + " mutesysvolume 0");
            System.out.println("ajuste sonido");

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
}