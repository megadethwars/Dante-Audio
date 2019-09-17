/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Negocio.ThreadAudio;
import Negocio.ThreadSocket;
import Datos.Configuracion;
import Datos.XmlRead;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import javafx.scene.control.RadioButton;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
/**
 *
 * @author leone
 */
public class PanelMixer extends javax.swing.JPanel {
    
    private ArrayList<Integer> ganancias;
    private ArrayList<String> canales;
    private int Frecuencia;
    private int Muestra;
  
    private int alternarSOLO = 0;
    
    private  int alternar0=0;
    private  int alternar1=0;
    private  int alternar2=0;
    private  int alternar3=0;
    private  int alternar4=0;
    private  int alternar5=0;
    private  int alternar6=0;
    private  int alternar7=0;
    private  int alternar8=0;
    private  int alternar9=0;
    private  int alternar10=0;
    private  int alternar11=0;
    private  int alternar12=0;
    private  int alternar13=0;
    private  int alternar14=0;
    private  int alternar15=0;
    private  int alternar16=0;
    private  int alternar17=0;
    private  int alternar18=0;
    private  int alternar19=0;
    private  int alternar20=0;
    private  int alternar21=0;
    private  int alternar22=0;
    private  int alternar23=0;
    private  int alternar24=0;
    private  int alternar25=0;
    private  int alternar26=0;
    private  int alternar27=0;
    private  int alternar28=0;
    private  int alternar29=0;
    private  int alternar30=0;
    private  int alternar31=0;
    private  int alternar32=0;
    
    
    private ThreadAudio audio0;
    private ThreadAudio audio1;
    private ThreadAudio audio2;       
    private ThreadAudio audio3;
    private ThreadAudio audio4;
    private ThreadAudio audio5;
    private ThreadAudio audio6;
    private ThreadAudio audio7;
    private ThreadAudio audio8;
    private ThreadAudio audio9;
    private ThreadAudio audio10;
    private ThreadAudio audio11;
    private ThreadAudio audio12;
    private ThreadAudio audio13;
    private ThreadAudio audio14;
    private ThreadAudio audio15;
    private ThreadAudio audio16;
    private ThreadAudio audio17;
    private ThreadAudio audio18;
    private ThreadAudio audio19;
    private ThreadAudio audio20;
    private ThreadAudio audio21;
    private ThreadAudio audio22;
    private ThreadAudio audio23;
    private ThreadAudio audio24;
    private ThreadAudio audio25;
    private ThreadAudio audio26;
    private ThreadAudio audio27;
    private ThreadAudio audio28;
    private ThreadAudio audio29;
    private ThreadAudio audio30;
    private ThreadAudio audio31;
    private ThreadAudio audio32;
    
    private boolean LastAtivate0=false;
    private boolean LastAtivate1=false;
    private boolean LastAtivate2=false;
    private boolean LastAtivate3=false;
    private boolean LastAtivate4=false;
    private boolean LastAtivate5=false;
    private boolean LastAtivate6=false;
    private boolean LastAtivate7=false;
    private boolean LastAtivate8=false;
    private boolean LastAtivate9=false;
    private boolean LastAtivate10=false;
    private boolean LastAtivate11=false;
    private boolean LastAtivate12=false;
    private boolean LastAtivate13=false;
    private boolean LastAtivate14=false;
    private boolean LastAtivate15=false;
    private boolean LastAtivate16=false;
    private boolean LastAtivate17=false;
    private boolean LastAtivate18=false;
    private boolean LastAtivate19=false;
    private boolean LastAtivate20=false;
    private boolean LastAtivate21=false;
    private boolean LastAtivate22=false;
    private boolean LastAtivate23=false;
    private boolean LastAtivate24=false;
    private boolean LastAtivate25=false;
    private boolean LastAtivate26=false;
    private boolean LastAtivate27=false;
    private boolean LastAtivate28=false;
    private boolean LastAtivate29=false;
    private boolean LastAtivate30=false;
    private boolean LastAtivate31=false;
    
    private boolean audioforceddown0 = false;
    private boolean audioforceddown1 = false;
    private boolean audioforceddown2 = false;
    private boolean audioforceddown3 = false;
    private boolean audioforceddown4 = false;
    private boolean audioforceddown5 = false;
    private boolean audioforceddown6 = false;
    private boolean audioforceddown7 = false;
    private boolean audioforceddown8 = false;
    private boolean audioforceddown9 = false;
    private boolean audioforceddown10 = false;
    private boolean audioforceddown11 = false;
    private boolean audioforceddown12 = false;
    private boolean audioforceddown13 = false;
    private boolean audioforceddown14 = false;
    private boolean audioforceddown15 = false;
    private boolean audioforceddown16 = false;
    private boolean audioforceddown17 = false;
    private boolean audioforceddown18 = false;
    private boolean audioforceddown19 = false;
    private boolean audioforceddown20 = false;
    private boolean audioforceddown21 = false;
    private boolean audioforceddown22 = false;
    private boolean audioforceddown23 = false;
    private boolean audioforceddown24 = false;
    private boolean audioforceddown25 = false;
    private boolean audioforceddown26 = false;
    private boolean audioforceddown27 = false;
    private boolean audioforceddown28 = false;
    private boolean audioforceddown29 = false;
    private boolean audioforceddown30 = false;
    private boolean audioforceddown31 = false;
    
    
    
    
    private Configuracion Conf;
    private XmlRead X;
    private Panel P;
    
    private ThreadSocket socket;
    /**
     * Creates new form NewJPanel
     */
    public PanelMixer(Panel P) {
        this.P=P;
        initComponents();
        X=new XmlRead();
       
        Conf= X.Read("config.xml");
        canales=new ArrayList<String>();
        ganancias=new ArrayList<Integer>();
        
        for(int i=0;i<32;i++){
            canales.add("OFF");
            ganancias.add(1);
            
           }
        
        ///init
        V1.setValue(10);
        V2.setValue(10);
        V3.setValue(10);
        V4.setValue(10);
        V5.setValue(10);
        V6.setValue(10);
        V7.setValue(10);
        V8.setValue(10);
        V9.setValue(10);
        V10.setValue(10);
        V11.setValue(10);
        V12.setValue(10);
        V13.setValue(10);
        V14.setValue(10);
        V15.setValue(10);
        V16.setValue(10);
        V17.setValue(10);
        V18.setValue(10);
        V19.setValue(10);
        V20.setValue(10);
        V21.setValue(10);
        V22.setValue(10);
        V23.setValue(10);
        V24.setValue(10);
        V25.setValue(10);
        V26.setValue(10);
        V27.setValue(10);
        V28.setValue(10);
        V29.setValue(10);
        V30.setValue(10);
        V31.setValue(10);
        V32.setValue(10);
        
        S1.setEnabled(false);
        S2.setEnabled(false);
        S3.setEnabled(false);
        S4.setEnabled(false);
        S5.setEnabled(false);
        S6.setEnabled(false);
        S7.setEnabled(false);
        S8.setEnabled(false);
        S9.setEnabled(false);
        S10.setEnabled(false);
        S11.setEnabled(false);
        S12.setEnabled(false);
        S13.setEnabled(false);
        S14.setEnabled(false);
        S15.setEnabled(false);
        S16.setEnabled(false);
        S17.setEnabled(false);
        S18.setEnabled(false);
        S19.setEnabled(false);
        S20.setEnabled(false);
        S21.setEnabled(false);
        S22.setEnabled(false);
        S23.setEnabled(false);
        S24.setEnabled(false);
        S25.setEnabled(false);
        S26.setEnabled(false);
        S27.setEnabled(false);
        S28.setEnabled(false);
        S29.setEnabled(false);
        S30.setEnabled(false);
        S31.setEnabled(false);
        S32.setEnabled(false);
        
        
        LoadImages(Conf);
        LoadAlias(Conf);
        
        
        ////instanciar hilosocket
         
         //socket.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    public void SetGanancias(ArrayList<Integer> ganancias){
       this.ganancias=ganancias;
    }
    
    public ArrayList<Integer> GetGanacias(){
      return ganancias;
    }
    
     public void SetCanales(ArrayList<String> canales){
       this.canales=canales;
    }
    
    public ArrayList<String> GetCanales(){
      return canales;
    }
 
    public void SetAlias(ArrayList<String> Nombres){
       
       this.C1.setText(Nombres.get(0));
       this.C2.setText(Nombres.get(1));
       this.C3.setText(Nombres.get(2));
       this.C4.setText(Nombres.get(3));
       this.C5.setText(Nombres.get(4));
       this.C6.setText(Nombres.get(28));
       this.C7.setText(Nombres.get(6));
       this.C8.setText(Nombres.get(7));
      
       this.C9.setText(Nombres.get(8));
       this.C10.setText(Nombres.get(9));
       this.C11.setText(Nombres.get(10));
       this.C12.setText(Nombres.get(11));
       this.C13.setText(Nombres.get(12));
       this.C14.setText(Nombres.get(13));
       this.C15.setText(Nombres.get(14));
       this.C16.setText(Nombres.get(15));
       
       this.C17.setText(Nombres.get(16));
       this.C18.setText(Nombres.get(17));
       this.C19.setText(Nombres.get(18));
       this.C20.setText(Nombres.get(19));
       this.C21.setText(Nombres.get(20));
       this.C22.setText(Nombres.get(21));
       this.C23.setText(Nombres.get(22));
       this.C24.setText(Nombres.get(23));
       
       this.C25.setText(Nombres.get(24));
       this.C26.setText(Nombres.get(25));
       this.C27.setText(Nombres.get(26));
       this.C28.setText(Nombres.get(27));
       this.C29.setText(Nombres.get(5));
       this.C30.setText(Nombres.get(29));
       this.C31.setText(Nombres.get(30));
       this.C32.setText(Nombres.get(31));
       
       this.repaint();
             
    }
    
    
    
    public void SetImages(ArrayList<String> Images){
             
       if(!Images.get(0).equals("0")){
            try{
                I1.setIcon(new javax.swing.ImageIcon(Images.get(0)));
                this.repaint();
            }
                catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
       else
       {
           try{
                I1.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(1).equals("0")){
                try{
                    I2.setIcon(new javax.swing.ImageIcon(Images.get(1)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I2.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(2).equals("0")){
                try{
                    I3.setIcon(new javax.swing.ImageIcon(Images.get(2)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I3.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(3).equals("0")){
                try{
                    I4.setIcon(new javax.swing.ImageIcon(Images.get(3)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I4.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!Images.get(4).equals("0")){
                try{
                    I5.setIcon(new javax.swing.ImageIcon(Images.get(4)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I5.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       } 
       
       
       if(!Images.get(5).equals("0")){
                try{
                    I6.setIcon(new javax.swing.ImageIcon(Images.get(5)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I6.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
      if(!Images.get(6).equals("0")){
                try{
                    I7.setIcon(new javax.swing.ImageIcon(Images.get(6)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
      
       else{
           try{
                I7.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       if(!Images.get(7).equals("0")){
                try{
                    I8.setIcon(new javax.swing.ImageIcon(Images.get(7)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I8.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(8).equals("0")){
                try{
                    I9.setIcon(new javax.swing.ImageIcon(Images.get(8)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I9.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
      
       if(!Images.get(9).equals("0")){
                try{
                    I10.setIcon(new javax.swing.ImageIcon(Images.get(9)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I10.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!Images.get(10).equals("0")){
                try{
                    I11.setIcon(new javax.swing.ImageIcon(Images.get(10)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I11.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!Images.get(11).equals("0")){
                try{
                    I12.setIcon(new javax.swing.ImageIcon(Images.get(11)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I12.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(12).equals("0")){
                try{
                    I13.setIcon(new javax.swing.ImageIcon(Images.get(12)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I13.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!Images.get(13).equals("0")){
                try{
                    I14.setIcon(new javax.swing.ImageIcon(Images.get(13)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I14.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(14).equals("0")){
            try{
                I15.setIcon(new javax.swing.ImageIcon(Images.get(14)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I15.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(15).equals("0")){
            try{
                I16.setIcon(new javax.swing.ImageIcon(Images.get(15)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I16.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
        if(!Images.get(16).equals("0")){
            try{
                I17.setIcon(new javax.swing.ImageIcon(Images.get(16)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I17.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(17).equals("0")){
            try{
                I18.setIcon(new javax.swing.ImageIcon(Images.get(17)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I18.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(18).equals("0")){
            try{
                I19.setIcon(new javax.swing.ImageIcon(Images.get(18)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I19.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(19).equals("0")){
            try{
                I20.setIcon(new javax.swing.ImageIcon(Images.get(19)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I20.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(20).equals("0")){
            try{
                I21.setIcon(new javax.swing.ImageIcon(Images.get(20)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I21.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(21).equals("0")){
            try{
                I22.setIcon(new javax.swing.ImageIcon(Images.get(21)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I22.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!Images.get(22).equals("0")){
            try{
                I23.setIcon(new javax.swing.ImageIcon(Images.get(22)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I23.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        if(!Images.get(23).equals("0")){
            try{
                I24.setIcon(new javax.swing.ImageIcon(Images.get(23)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I24.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(24).equals("0")){
            try{
                I25.setIcon(new javax.swing.ImageIcon(Images.get(24)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I25.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(25).equals("0")){
            try{
                I26.setIcon(new javax.swing.ImageIcon(Images.get(25)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I26.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(26).equals("0")){
            try{
                I27.setIcon(new javax.swing.ImageIcon(Images.get(26)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I27.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(27).equals("0")){
            try{
                I28.setIcon(new javax.swing.ImageIcon(Images.get(27)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I28.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(28).equals("0")){
            try{
                I29.setIcon(new javax.swing.ImageIcon(Images.get(28)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I29.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(29).equals("0")){
            try{
                I30.setIcon(new javax.swing.ImageIcon(Images.get(29)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I30.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        if(!Images.get(30).equals("0")){
            try{
                I31.setIcon(new javax.swing.ImageIcon(Images.get(30)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I31.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        if(!Images.get(31).equals("0")){
            try{
                I32.setIcon(new javax.swing.ImageIcon(Images.get(31)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I32.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        
       
       
    }
    
    public void LoadAlias(Configuracion C){
       this.C1.setText(C.GetAlias().get(0));
       this.C2.setText(C.GetAlias().get(1));
       this.C3.setText(C.GetAlias().get(2));
       this.C4.setText(C.GetAlias().get(3));
       this.C5.setText(C.GetAlias().get(4));
       this.C6.setText(C.GetAlias().get(28));
       this.C7.setText(C.GetAlias().get(6));
       this.C8.setText(C.GetAlias().get(7));
       this.C9.setText(C.GetAlias().get(8));
       this.C10.setText(C.GetAlias().get(9));
       this.C11.setText(C.GetAlias().get(10));
       this.C12.setText(C.GetAlias().get(11));
       this.C13.setText(C.GetAlias().get(12));
       this.C14.setText(C.GetAlias().get(13));
       this.C15.setText(C.GetAlias().get(14));
       this.C16.setText(C.GetAlias().get(15));
       this.C17.setText(C.GetAlias().get(16));
       this.C18.setText(C.GetAlias().get(17));
       this.C19.setText(C.GetAlias().get(18));
       this.C20.setText(C.GetAlias().get(19));
       this.C21.setText(C.GetAlias().get(20));
       this.C22.setText(C.GetAlias().get(21));
       this.C23.setText(C.GetAlias().get(22));
       this.C24.setText(C.GetAlias().get(23));
       this.C25.setText(C.GetAlias().get(24));
       this.C26.setText(C.GetAlias().get(25));
       this.C27.setText(C.GetAlias().get(26));
       this.C28.setText(C.GetAlias().get(27));
       this.C29.setText(C.GetAlias().get(5));
       this.C30.setText(C.GetAlias().get(29));
       this.C31.setText(C.GetAlias().get(30));
       this.C32.setText(C.GetAlias().get(31));
       this.repaint();
    } 
 
    private void LoadImages(Configuracion C){
             
       if(!C.GetListaImages().get(0).equals("0")){
                try{
                    I1.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(0)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I1.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       
       if(!C.GetListaImages().get(1).equals("0")){
                try{
                    I2.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(1)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I2.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!C.GetListaImages().get(2).equals("0")){
                try{
                    I3.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(2)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I3.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       
       if(!C.GetListaImages().get(3).equals("0")){
                try{
                    I4.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(3)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I4.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(4).equals("0")){
                try{
                    I5.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(4)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I5.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(5).equals("0")){
                try{
                    I6.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(5)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I6.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
         if(!C.GetListaImages().get(6).equals("0")){
                try{
                    I7.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(6)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I7.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
         if(!C.GetListaImages().get(7).equals("0")){
                try{
                    I8.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(7)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I8.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!C.GetListaImages().get(8).equals("0")){
                try{
                    I9.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(8)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I9.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(9).equals("0")){
                try{
                    I10.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(9)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I10.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(10).equals("0")){
                try{
                    I11.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(10)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I11.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(11).equals("0")){
                try{
                    I12.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(11)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I12.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(12).equals("0")){
                try{
                    I13.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(12)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I13.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(13).equals("0")){
                try{
                    I14.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(13)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I14.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
         if(!C.GetListaImages().get(14).equals("0")){
                try{
                    I15.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(14)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I15.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
         if(!C.GetListaImages().get(15).equals("0")){
                try{
                    I16.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(15)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I16.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       
       
        if(!C.GetListaImages().get(16).equals("0")){
            try{
                I17.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(16)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I17.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(17).equals("0")){
            try{
                I18.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(17)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I18.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(18).equals("0")){
            try{
                I19.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(18)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I19.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(19).equals("0")){
            try{
                I20.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(19)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I20.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(20).equals("0")){
            try{
                I21.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(20)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I21.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(21).equals("0")){
            try{
                I22.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(21)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I22.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
         if(!C.GetListaImages().get(22).equals("0")){
                try{
                    I23.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(22)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I23.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
          if(!C.GetListaImages().get(23).equals("0")){
                try{
                    I24.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(23)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I24.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
        
        if(!C.GetListaImages().get(24).equals("0")){
            try{
                I25.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(24)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I25.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(25).equals("0")){
            try{
                I26.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(25)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I26.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(26).equals("0")){
            try{
                I27.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(26)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I27.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(27).equals("0")){
            try{
                I28.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(27)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I28.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(28).equals("0")){
            try{
                I29.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(28)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I29.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(29).equals("0")){
            try{
                I30.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(29)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I30.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
         if(!C.GetListaImages().get(30).equals("0")){
                try{
                    I31.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(30)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I31.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
         if(!C.GetListaImages().get(31).equals("0")){
                try{
                    I32.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(31)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I32.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
      
       
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C1 = new javax.swing.JButton();
        V1 = new javax.swing.JSlider();
        C2 = new javax.swing.JButton();
        V2 = new javax.swing.JSlider();
        C3 = new javax.swing.JButton();
        V3 = new javax.swing.JSlider();
        C4 = new javax.swing.JButton();
        V4 = new javax.swing.JSlider();
        C9 = new javax.swing.JButton();
        V9 = new javax.swing.JSlider();
        V12 = new javax.swing.JSlider();
        C12 = new javax.swing.JButton();
        V11 = new javax.swing.JSlider();
        C11 = new javax.swing.JButton();
        V10 = new javax.swing.JSlider();
        C10 = new javax.swing.JButton();
        C13 = new javax.swing.JButton();
        V13 = new javax.swing.JSlider();
        V14 = new javax.swing.JSlider();
        C14 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        V5 = new javax.swing.JSlider();
        V6 = new javax.swing.JSlider();
        C6 = new javax.swing.JButton();
        C17 = new javax.swing.JButton();
        V17 = new javax.swing.JSlider();
        V20 = new javax.swing.JSlider();
        C20 = new javax.swing.JButton();
        V19 = new javax.swing.JSlider();
        C19 = new javax.swing.JButton();
        V18 = new javax.swing.JSlider();
        C18 = new javax.swing.JButton();
        C21 = new javax.swing.JButton();
        V21 = new javax.swing.JSlider();
        V22 = new javax.swing.JSlider();
        C22 = new javax.swing.JButton();
        C25 = new javax.swing.JButton();
        V25 = new javax.swing.JSlider();
        V28 = new javax.swing.JSlider();
        C28 = new javax.swing.JButton();
        V27 = new javax.swing.JSlider();
        C27 = new javax.swing.JButton();
        V26 = new javax.swing.JSlider();
        C26 = new javax.swing.JButton();
        C29 = new javax.swing.JButton();
        V29 = new javax.swing.JSlider();
        V30 = new javax.swing.JSlider();
        C30 = new javax.swing.JButton();
        I25 = new javax.swing.JLabel();
        I26 = new javax.swing.JLabel();
        I9 = new javax.swing.JLabel();
        I17 = new javax.swing.JLabel();
        I1 = new javax.swing.JLabel();
        I27 = new javax.swing.JLabel();
        I10 = new javax.swing.JLabel();
        I18 = new javax.swing.JLabel();
        I2 = new javax.swing.JLabel();
        I12 = new javax.swing.JLabel();
        I11 = new javax.swing.JLabel();
        I19 = new javax.swing.JLabel();
        I3 = new javax.swing.JLabel();
        I20 = new javax.swing.JLabel();
        I28 = new javax.swing.JLabel();
        I4 = new javax.swing.JLabel();
        I29 = new javax.swing.JLabel();
        I13 = new javax.swing.JLabel();
        I21 = new javax.swing.JLabel();
        I5 = new javax.swing.JLabel();
        I22 = new javax.swing.JLabel();
        I30 = new javax.swing.JLabel();
        I6 = new javax.swing.JLabel();
        I14 = new javax.swing.JLabel();
        I15 = new javax.swing.JLabel();
        I7 = new javax.swing.JLabel();
        I8 = new javax.swing.JLabel();
        I16 = new javax.swing.JLabel();
        I24 = new javax.swing.JLabel();
        I23 = new javax.swing.JLabel();
        I31 = new javax.swing.JLabel();
        I32 = new javax.swing.JLabel();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        C15 = new javax.swing.JButton();
        C16 = new javax.swing.JButton();
        C23 = new javax.swing.JButton();
        C24 = new javax.swing.JButton();
        C31 = new javax.swing.JButton();
        C32 = new javax.swing.JButton();
        V7 = new javax.swing.JSlider();
        V8 = new javax.swing.JSlider();
        V15 = new javax.swing.JSlider();
        V16 = new javax.swing.JSlider();
        V23 = new javax.swing.JSlider();
        V24 = new javax.swing.JSlider();
        V31 = new javax.swing.JSlider();
        V32 = new javax.swing.JSlider();
        S1 = new javax.swing.JToggleButton();
        S9 = new javax.swing.JToggleButton();
        S17 = new javax.swing.JToggleButton();
        S25 = new javax.swing.JToggleButton();
        S3 = new javax.swing.JToggleButton();
        S11 = new javax.swing.JToggleButton();
        S19 = new javax.swing.JToggleButton();
        S27 = new javax.swing.JToggleButton();
        S2 = new javax.swing.JToggleButton();
        S10 = new javax.swing.JToggleButton();
        S18 = new javax.swing.JToggleButton();
        S26 = new javax.swing.JToggleButton();
        S4 = new javax.swing.JToggleButton();
        S12 = new javax.swing.JToggleButton();
        S20 = new javax.swing.JToggleButton();
        S28 = new javax.swing.JToggleButton();
        S5 = new javax.swing.JToggleButton();
        S13 = new javax.swing.JToggleButton();
        S21 = new javax.swing.JToggleButton();
        S6 = new javax.swing.JToggleButton();
        S29 = new javax.swing.JToggleButton();
        S14 = new javax.swing.JToggleButton();
        S22 = new javax.swing.JToggleButton();
        S30 = new javax.swing.JToggleButton();
        S7 = new javax.swing.JToggleButton();
        S8 = new javax.swing.JToggleButton();
        S15 = new javax.swing.JToggleButton();
        S16 = new javax.swing.JToggleButton();
        S23 = new javax.swing.JToggleButton();
        S24 = new javax.swing.JToggleButton();
        S31 = new javax.swing.JToggleButton();
        S32 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(51, 51, 51));

        C1.setBackground(new java.awt.Color(102, 102, 102));
        C1.setFont(new java.awt.Font("Montserrat", 0, 21)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setText("CHANNEL 1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        V1.setMaximum(10);
        V1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V1StateChanged(evt);
            }
        });

        C2.setBackground(new java.awt.Color(102, 102, 102));
        C2.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setText("CHANNEL 2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        V2.setMaximum(10);
        V2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V2StateChanged(evt);
            }
        });

        C3.setBackground(new java.awt.Color(102, 102, 102));
        C3.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setText("CHANNEL 3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        V3.setMaximum(10);
        V3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V3StateChanged(evt);
            }
        });

        C4.setBackground(new java.awt.Color(102, 102, 102));
        C4.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C4.setForeground(new java.awt.Color(255, 255, 255));
        C4.setText("CHANNEL 4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        V4.setMaximum(10);
        V4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V4StateChanged(evt);
            }
        });

        C9.setBackground(new java.awt.Color(102, 102, 102));
        C9.setFont(new java.awt.Font("Montserrat", 0, 21)); // NOI18N
        C9.setForeground(new java.awt.Color(255, 255, 255));
        C9.setText("CHANNEL 9");
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        V9.setMaximum(10);
        V9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V9StateChanged(evt);
            }
        });

        V12.setMaximum(10);
        V12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V12StateChanged(evt);
            }
        });

        C12.setBackground(new java.awt.Color(102, 102, 102));
        C12.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C12.setForeground(new java.awt.Color(255, 255, 255));
        C12.setText("CHANNEL 12");
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });

        V11.setMaximum(10);
        V11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V11StateChanged(evt);
            }
        });

        C11.setBackground(new java.awt.Color(102, 102, 102));
        C11.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C11.setForeground(new java.awt.Color(255, 255, 255));
        C11.setText("CHANNEL 11");
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });

        V10.setMaximum(10);
        V10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V10StateChanged(evt);
            }
        });

        C10.setBackground(new java.awt.Color(102, 102, 102));
        C10.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C10.setForeground(new java.awt.Color(255, 255, 255));
        C10.setText("CHANNEL 10");
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        C13.setBackground(new java.awt.Color(102, 102, 102));
        C13.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C13.setForeground(new java.awt.Color(255, 255, 255));
        C13.setText("CHANNEL 13");
        C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C13ActionPerformed(evt);
            }
        });

        V13.setMaximum(10);
        V13.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V13StateChanged(evt);
            }
        });

        V14.setMaximum(10);
        V14.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V14StateChanged(evt);
            }
        });

        C14.setBackground(new java.awt.Color(102, 102, 102));
        C14.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C14.setForeground(new java.awt.Color(255, 255, 255));
        C14.setText("CHANNEL 14");
        C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(102, 102, 102));
        C5.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C5.setForeground(new java.awt.Color(255, 255, 255));
        C5.setText("CHANNEL5");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        V5.setMaximum(10);
        V5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V5StateChanged(evt);
            }
        });

        V6.setMaximum(10);
        V6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V6StateChanged(evt);
            }
        });

        C6.setBackground(new java.awt.Color(102, 102, 102));
        C6.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C6.setForeground(new java.awt.Color(255, 255, 255));
        C6.setText("CHANNEL 6");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C17.setBackground(new java.awt.Color(102, 102, 102));
        C17.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C17.setForeground(new java.awt.Color(255, 255, 255));
        C17.setText("CHANNEL 17");
        C17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C17ActionPerformed(evt);
            }
        });

        V17.setMaximum(10);
        V17.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V17StateChanged(evt);
            }
        });

        V20.setMaximum(10);
        V20.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V20StateChanged(evt);
            }
        });

        C20.setBackground(new java.awt.Color(102, 102, 102));
        C20.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C20.setForeground(new java.awt.Color(255, 255, 255));
        C20.setText("CHANNEL 20");
        C20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C20ActionPerformed(evt);
            }
        });

        V19.setMaximum(10);
        V19.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V19StateChanged(evt);
            }
        });

        C19.setBackground(new java.awt.Color(102, 102, 102));
        C19.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C19.setForeground(new java.awt.Color(255, 255, 255));
        C19.setText("CHANNEL 19");
        C19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C19ActionPerformed(evt);
            }
        });

        V18.setMaximum(10);
        V18.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V18StateChanged(evt);
            }
        });

        C18.setBackground(new java.awt.Color(102, 102, 102));
        C18.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C18.setForeground(new java.awt.Color(255, 255, 255));
        C18.setText("CHANNEL 18");
        C18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C18ActionPerformed(evt);
            }
        });

        C21.setBackground(new java.awt.Color(102, 102, 102));
        C21.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C21.setForeground(new java.awt.Color(255, 255, 255));
        C21.setText("CHANNEL 21");
        C21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C21ActionPerformed(evt);
            }
        });

        V21.setMaximum(10);
        V21.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V21StateChanged(evt);
            }
        });

        V22.setMaximum(10);
        V22.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V22StateChanged(evt);
            }
        });

        C22.setBackground(new java.awt.Color(102, 102, 102));
        C22.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C22.setForeground(new java.awt.Color(255, 255, 255));
        C22.setText("CHANNEL 22");
        C22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C22ActionPerformed(evt);
            }
        });

        C25.setBackground(new java.awt.Color(102, 102, 102));
        C25.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C25.setForeground(new java.awt.Color(255, 255, 255));
        C25.setText("CHANNEL 25");
        C25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C25ActionPerformed(evt);
            }
        });

        V25.setMaximum(10);
        V25.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V25StateChanged(evt);
            }
        });

        V28.setMaximum(10);
        V28.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V28StateChanged(evt);
            }
        });

        C28.setBackground(new java.awt.Color(102, 102, 102));
        C28.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C28.setForeground(new java.awt.Color(255, 255, 255));
        C28.setText("CHANNEL 28");
        C28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C28ActionPerformed(evt);
            }
        });

        V27.setMaximum(10);
        V27.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V27StateChanged(evt);
            }
        });

        C27.setBackground(new java.awt.Color(102, 102, 102));
        C27.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C27.setForeground(new java.awt.Color(255, 255, 255));
        C27.setText("CHANNEL 27");
        C27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C27ActionPerformed(evt);
            }
        });

        V26.setMaximum(10);
        V26.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V26StateChanged(evt);
            }
        });

        C26.setBackground(new java.awt.Color(102, 102, 102));
        C26.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C26.setForeground(new java.awt.Color(255, 255, 255));
        C26.setText("CHANNEL 26");
        C26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C26ActionPerformed(evt);
            }
        });

        C29.setBackground(new java.awt.Color(102, 102, 102));
        C29.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C29.setForeground(new java.awt.Color(255, 255, 255));
        C29.setText("CHANNEL 29");
        C29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C29ActionPerformed(evt);
            }
        });

        V29.setMaximum(10);
        V29.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V29StateChanged(evt);
            }
        });

        V30.setMaximum(10);
        V30.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                V30StateChanged(evt);
            }
        });

        C30.setBackground(new java.awt.Color(102, 102, 102));
        C30.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        C30.setForeground(new java.awt.Color(255, 255, 255));
        C30.setText("CHANNEL 30");
        C30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C30ActionPerformed(evt);
            }
        });

        I25.setForeground(new java.awt.Color(255, 255, 255));
        I25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I26.setBackground(new java.awt.Color(255, 255, 255));
        I26.setForeground(new java.awt.Color(255, 255, 255));
        I26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I9.setForeground(new java.awt.Color(255, 255, 255));
        I9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I17.setForeground(new java.awt.Color(255, 255, 255));
        I17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I1.setBackground(new java.awt.Color(255, 255, 255));
        I1.setForeground(new java.awt.Color(255, 255, 255));
        I1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I27.setBackground(new java.awt.Color(255, 255, 255));
        I27.setForeground(new java.awt.Color(255, 255, 255));
        I27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I10.setBackground(new java.awt.Color(255, 255, 255));
        I10.setForeground(new java.awt.Color(255, 255, 255));
        I10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I18.setBackground(new java.awt.Color(255, 255, 255));
        I18.setForeground(new java.awt.Color(255, 255, 255));
        I18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I2.setBackground(new java.awt.Color(255, 255, 255));
        I2.setForeground(new java.awt.Color(255, 255, 255));
        I2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I12.setBackground(new java.awt.Color(255, 255, 255));
        I12.setForeground(new java.awt.Color(255, 255, 255));
        I12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I11.setBackground(new java.awt.Color(255, 255, 255));
        I11.setForeground(new java.awt.Color(255, 255, 255));
        I11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I19.setBackground(new java.awt.Color(255, 255, 255));
        I19.setForeground(new java.awt.Color(255, 255, 255));
        I19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I3.setBackground(new java.awt.Color(255, 255, 255));
        I3.setForeground(new java.awt.Color(255, 255, 255));
        I3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I20.setBackground(new java.awt.Color(255, 255, 255));
        I20.setForeground(new java.awt.Color(255, 255, 255));
        I20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I28.setBackground(new java.awt.Color(255, 255, 255));
        I28.setForeground(new java.awt.Color(255, 255, 255));
        I28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I4.setBackground(new java.awt.Color(255, 255, 255));
        I4.setForeground(new java.awt.Color(255, 255, 255));
        I4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I29.setBackground(new java.awt.Color(255, 255, 255));
        I29.setForeground(new java.awt.Color(255, 255, 255));
        I29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I13.setBackground(new java.awt.Color(255, 255, 255));
        I13.setForeground(new java.awt.Color(255, 255, 255));
        I13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I21.setBackground(new java.awt.Color(255, 255, 255));
        I21.setForeground(new java.awt.Color(255, 255, 255));
        I21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I5.setBackground(new java.awt.Color(255, 255, 255));
        I5.setForeground(new java.awt.Color(255, 255, 255));
        I5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I22.setBackground(new java.awt.Color(255, 255, 255));
        I22.setForeground(new java.awt.Color(255, 255, 255));
        I22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I30.setBackground(new java.awt.Color(255, 255, 255));
        I30.setForeground(new java.awt.Color(255, 255, 255));
        I30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I6.setBackground(new java.awt.Color(255, 255, 255));
        I6.setForeground(new java.awt.Color(255, 255, 255));
        I6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I14.setBackground(new java.awt.Color(255, 255, 255));
        I14.setForeground(new java.awt.Color(255, 255, 255));
        I14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C7.setBackground(new java.awt.Color(102, 102, 102));
        C7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C7.setForeground(new java.awt.Color(255, 255, 255));
        C7.setText("CHANNEL");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C8.setBackground(new java.awt.Color(102, 102, 102));
        C8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C8.setForeground(new java.awt.Color(255, 255, 255));
        C8.setText("CHANNEL");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C15.setBackground(new java.awt.Color(102, 102, 102));
        C15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C15.setForeground(new java.awt.Color(255, 255, 255));
        C15.setText("CHANNEL");
        C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C15ActionPerformed(evt);
            }
        });

        C16.setBackground(new java.awt.Color(102, 102, 102));
        C16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C16.setForeground(new java.awt.Color(255, 255, 255));
        C16.setText("CHANNEL");
        C16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C16ActionPerformed(evt);
            }
        });

        C23.setBackground(new java.awt.Color(102, 102, 102));
        C23.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C23.setForeground(new java.awt.Color(255, 255, 255));
        C23.setText("CHANNEL");
        C23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C23ActionPerformed(evt);
            }
        });

        C24.setBackground(new java.awt.Color(102, 102, 102));
        C24.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C24.setForeground(new java.awt.Color(255, 255, 255));
        C24.setText("CHANNEL");
        C24.setToolTipText("");
        C24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C24ActionPerformed(evt);
            }
        });

        C31.setBackground(new java.awt.Color(102, 102, 102));
        C31.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C31.setForeground(new java.awt.Color(255, 255, 255));
        C31.setText("CHANNEL");
        C31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C31ActionPerformed(evt);
            }
        });

        C32.setBackground(new java.awt.Color(102, 102, 102));
        C32.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        C32.setForeground(new java.awt.Color(255, 255, 255));
        C32.setText("CHANNEL");
        C32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C32ActionPerformed(evt);
            }
        });

        V7.setMaximum(10);

        V8.setMaximum(10);

        V15.setMaximum(10);

        V16.setMaximum(10);

        V23.setMaximum(10);

        V24.setMaximum(10);

        V31.setMaximum(10);

        V32.setMaximum(10);

        S1.setText("S");
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        S9.setText("S");
        S9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S9ActionPerformed(evt);
            }
        });

        S17.setText("S");
        S17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S17ActionPerformed(evt);
            }
        });

        S25.setText("S");
        S25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S25ActionPerformed(evt);
            }
        });

        S3.setText("S");
        S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S3ActionPerformed(evt);
            }
        });

        S11.setText("S");
        S11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S11ActionPerformed(evt);
            }
        });

        S19.setText("S");
        S19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S19ActionPerformed(evt);
            }
        });

        S27.setText("S");
        S27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S27ActionPerformed(evt);
            }
        });

        S2.setText("S");
        S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S2ActionPerformed(evt);
            }
        });

        S10.setText("S");
        S10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S10ActionPerformed(evt);
            }
        });

        S18.setText("S");
        S18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S18ActionPerformed(evt);
            }
        });

        S26.setText("S");
        S26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S26ActionPerformed(evt);
            }
        });

        S4.setText("S");
        S4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S4ActionPerformed(evt);
            }
        });

        S12.setText("S");
        S12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S12ActionPerformed(evt);
            }
        });

        S20.setText("S");
        S20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S20ActionPerformed(evt);
            }
        });

        S28.setText("S");
        S28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S28ActionPerformed(evt);
            }
        });

        S5.setText("S");
        S5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S5ActionPerformed(evt);
            }
        });

        S13.setText("S");
        S13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S13ActionPerformed(evt);
            }
        });

        S21.setText("S");
        S21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S21ActionPerformed(evt);
            }
        });

        S6.setText("S");
        S6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S6ActionPerformed(evt);
            }
        });

        S29.setText("S");
        S29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S29ActionPerformed(evt);
            }
        });

        S14.setText("S");
        S14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S14ActionPerformed(evt);
            }
        });

        S22.setText("S");
        S22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S22ActionPerformed(evt);
            }
        });

        S30.setText("S");
        S30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S30ActionPerformed(evt);
            }
        });

        S7.setText("S");
        S7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S7ActionPerformed(evt);
            }
        });

        S8.setText("S");
        S8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S8ActionPerformed(evt);
            }
        });

        S15.setText("S");
        S15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S15ActionPerformed(evt);
            }
        });

        S16.setText("S");
        S16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S16ActionPerformed(evt);
            }
        });

        S23.setText("S");
        S23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S23ActionPerformed(evt);
            }
        });

        S24.setText("S");
        S24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S24ActionPerformed(evt);
            }
        });

        S31.setText("S");
        S31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S31ActionPerformed(evt);
            }
        });

        S32.setText("S");
        S32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(I1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(I5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(V2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(V1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(V9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(V10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(S9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(S10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(2, 2, 2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(I13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(I9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17)
                                        .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(S5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(V13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(S13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(I15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(I16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(I23, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(C29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(V18, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(S18, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(S26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(I17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(I18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(I21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(V21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(V17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(S21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(I25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(C25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(V25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(I26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(I29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(S25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(V3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(V6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(S6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(V29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(S29, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(3, 3, 3)))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(C30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(I24, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(S14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(V14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(I31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(I32, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(V22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(S22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(S30, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(V30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addGap(9, 9, 9)
                                                            .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(V11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(S11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(I11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(I12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(27, 27, 27)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(C19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(C27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(V19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(S19, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(V27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(S27, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(I19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(I27, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(I20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(I28, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(I14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(I22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(I30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(V26, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(V4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(S4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(V12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(S12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(S20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(V20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(V28, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(S28, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(C18, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C26, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C28, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(S17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(C16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(V15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(S16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(C23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(V23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(S23, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(C24, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(C31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(C32, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(V24, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(S24, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(V31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(S31, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(S32, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(V32, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(V7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(V8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(S8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(S7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(S15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I25, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I19, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I27, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C17)
                            .addComponent(C25)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(V27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S1)
                    .addComponent(S9)
                    .addComponent(S17)
                    .addComponent(S25)
                    .addComponent(S3)
                    .addComponent(S11)
                    .addComponent(S19)
                    .addComponent(S27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(I28, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I18, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I26, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I20, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(V2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S2)
                    .addComponent(S10)
                    .addComponent(S18)
                    .addComponent(S26)
                    .addComponent(S4)
                    .addComponent(S12)
                    .addComponent(S20)
                    .addComponent(S28))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I29, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C29, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I21, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I22, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I30, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(V5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(V6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(S5)
                        .addComponent(S13)
                        .addComponent(S21))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(S6)
                        .addComponent(S29)
                        .addComponent(S14)
                        .addComponent(S22)
                        .addComponent(S30)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(I15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I24, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I23, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I31, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I32, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(V7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S7)
                    .addComponent(S8)
                    .addComponent(S15)
                    .addComponent(S16)
                    .addComponent(S23)
                    .addComponent(S24)
                    .addComponent(S31)
                    .addComponent(S32))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed

        // TODO add your handling code here:     
    alternar0++;   
    if(alternar0==1){
                     
         try{
            Conf=X.Read("config.xml"); 
            audio0=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(0),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),0,V1,C1,socket);
            audio0.start();
            C1.setBackground(Color.GREEN);
            S1.setEnabled(true);
            S1.setSelected(false);
         }
         catch(Exception e){
            System.out.println("Error de hilo ");
            C1.setBackground(Color.RED);
            S1.setEnabled(false);
            
         }
         
                     
    }   

    if(alternar0==2){
         audio0.detener();
         audio0.stop();
         alternar0=0;
         C1.setBackground(Color.BLUE);
         S1.setEnabled(false);
         S1.setSelected(false);
         
    }
        
      /*         
        alternar0++;   
    if(alternar0==1){
         Conf=X.Read("configuracion.xml");        
         audio0=new ThreadAudio(Conf.GetLista().get(0),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),1);
         audio0.start();   
         C1.setBackground(Color.GREEN);
    }   

    if(alternar0==2){
         audio0.detener();
         audio0.stop();
         alternar0=0;
         C1.setBackground(Color.white);
        }*/
         
       /* 
        alternar0++;
        
        if(alternar0==1){
         canales.set(0,"ON");
         ganancias.set(0,V1.getValue());
         C1.setBackground(Color.BLUE.darker());
        }
        else if(alternar0==2){
            alternar0=0;
              canales.set(0,"OFF");
         ganancias.set(0,V1.getValue());
           C1.setBackground(Color.GRAY.darker());
        
        }
        */
        
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        //leer configuracion
          // AlternarAudio(alternar1, audio1, 2, Conf, C2,V2);
           
       alternar1++;   
    if(alternar1==1){
         Conf=X.Read("config.xml");        
         
         try{
             audio1=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(1),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),8,V2,C2,socket);
             audio1.start();
              C2.setBackground(Color.GREEN);
              S2.setEnabled(true);
              S2.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C2.setBackground(Color.RED);
               S2.setEnabled(false);
               S2.setSelected(false);
         }
                   
      
    }   

    if(alternar1==2){
         audio1.detener();
         audio1.stop();
         alternar1=0;
         C2.setBackground(Color.BLUE);
         S2.setEnabled(false);
         S2.setSelected(false);
    }    
           
        /*
       alternar1++;
        
        if(alternar1==1){
         canales.set(1,"ON");
         ganancias.set(1,V2.getValue());
         C2.setBackground(Color.BLUE.darker());
        }
        else if(alternar1==2){
            alternar1=0;
              canales.set(1,"OFF");
         ganancias.set(1,V2.getValue());
           C2.setBackground(Color.GRAY.darker());
        
        }*/
    
    
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
           //AlternarAudio(alternar2, audio2, 3, Conf, C3,V3);
           
    alternar2++;   
    if(alternar2==1){
         Conf=X.Read("config.xml");        
         
         try{
             audio2=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(2),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),4,V3,C3,socket);
             audio2.start();
              C3.setBackground(Color.GREEN);
              S3.setEnabled(true);
              S3.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C3.setBackground(Color.RED);
               S3.setEnabled(false);
               S3.setSelected(false);
         }
                   
      
    }   

    if(alternar2==2){
         audio2.detener();
         audio2.stop();
         alternar2=0;
         C3.setBackground(Color.BLUE);
         S3.setEnabled(false);
         S3.setSelected(false);
    }
           
           
        /*
        alternar2++;
        
        if(alternar2==1){
         canales.set(2,"ON");
         ganancias.set(2,V3.getValue());
         C3.setBackground(Color.BLUE.darker());
        }
        else if(alternar2==2){
            alternar2=0;
              canales.set(2,"OFF");
         ganancias.set(2,V3.getValue());
           C3.setBackground(Color.GRAY.darker());
        
        }*/
      
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
      //     AlternarAudio(alternar3, audio3, 4, Conf, C4,V4);
      
    alternar3++;   
    if(alternar3==1){
         Conf=X.Read("config.xml");                
         try{
             audio3=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(3),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),12,V4,C4,socket);
             audio3.start();
              C4.setBackground(Color.GREEN);
              S4.setEnabled(true);
              S4.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C4.setBackground(Color.RED);
               S4.setEnabled(false);
               S4.setSelected(false);
         }     
    }   
    if(alternar3==2){
         audio3.detener();
         audio3.stop();
         alternar3=0;
         C4.setBackground(Color.BLUE);
         S4.setEnabled(false);
         S4.setSelected(false);
    }
      
      
      
        /*
        alternar3++;
        
        if(alternar3==1){
         canales.set(3,"ON");
         ganancias.set(3,V4.getValue());
         C4.setBackground(Color.BLUE.darker());
        }
        else if(alternar3==2){
            alternar3=0;
              canales.set(3,"OFF");
         ganancias.set(3,V4.getValue());
           C4.setBackground(Color.GRAY.darker());
        
        }*/
        
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:

       // AlternarAudio(alternar4, audio4, 5, Conf, C5,V5);
        alternar4++;   
    if(alternar4==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio4=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(4),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),16,V5,C5,socket);
             audio4.start();
              C5.setBackground(Color.GREEN);
              S5.setEnabled(true);
              S5.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C5.setBackground(Color.RED);
               S5.setEnabled(false);
               S5.setSelected(false);
         }     
    }   
    if(alternar4==2){
         audio4.detener();
         audio4.stop();
         alternar4=0;
         C5.setBackground(Color.BLUE);
         S5.setEnabled(false);
         S5.setSelected(false);
    }
       
        /*
        alternar4++;
        
        if(alternar4==1){
         canales.set(4,"ON");
         ganancias.set(4,V5.getValue());
         C5.setBackground(Color.BLUE.darker());
        }
        else if(alternar4==2){
            alternar4=0;
              canales.set(4,"OFF");
         ganancias.set(4,V5.getValue());
           C5.setBackground(Color.GRAY.darker());
        
        }
*/
 
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
       
       //   AlternarAudio(alternar5, audio5,6,Conf,C6,V6);
           alternar5++;   
    if(alternar5==1){
         Conf=X.Read("config.xml");                
         try{
             audio5=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(5),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),19,V29,C6,socket);
             audio5.start();
              C6.setBackground(Color.GREEN);
              S6.setEnabled(true);
              S6.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C6.setBackground(Color.RED);
               S6.setEnabled(false);
               S6.setSelected(false);
         }     
    }   
    if(alternar5==2){
         audio5.detener();
         audio5.stop();
         alternar5=0;
         C6.setBackground(Color.BLUE);
         S6.setEnabled(false);
         S6.setSelected(false);
    }
       
        /*
         alternar5++;
        
        if(alternar5==1){
         canales.set(5,"ON");
         ganancias.set(5,V6.getValue());
         C6.setBackground(Color.BLUE.darker());
        }
        else if(alternar5==2){
            alternar5=0;
              canales.set(5,"OFF");
         ganancias.set(5,V6.getValue());
           C6.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C6ActionPerformed

    private void V9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V9StateChanged
        // TODO add your handling code here:
        ganancias.set(8,V9.getValue());
    }//GEN-LAST:event_V9StateChanged

    private void V10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V10StateChanged
        // TODO add your handling code here:
        ganancias.set(9,V10.getValue());
    }//GEN-LAST:event_V10StateChanged

    private void V11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V11StateChanged
        // TODO add your handling code here:
        ganancias.set(10,V11.getValue());
    }//GEN-LAST:event_V11StateChanged

    private void V12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V12StateChanged
        // TODO add your handling code here:
        ganancias.set(11,V12.getValue());
    }//GEN-LAST:event_V12StateChanged

    private void V13StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V13StateChanged
        // TODO add your handling code here:
        ganancias.set(12,V13.getValue());
    }//GEN-LAST:event_V13StateChanged

    private void V14StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V14StateChanged
        // TODO add your handling code here:
        ganancias.set(13,V14.getValue());
    }//GEN-LAST:event_V14StateChanged

    private void V17StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V17StateChanged
        // TODO add your handling code here:
        ganancias.set(16,V17.getValue());
    }//GEN-LAST:event_V17StateChanged

    private void V18StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V18StateChanged
        // TODO add your handling code here:
        ganancias.set(17,V18.getValue());
    }//GEN-LAST:event_V18StateChanged

    private void V19StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V19StateChanged
        // TODO add your handling code here:
        ganancias.set(18,V19.getValue());
    }//GEN-LAST:event_V19StateChanged

    private void V20StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V20StateChanged
        // TODO add your handling code here:
        ganancias.set(19,V20.getValue());
    }//GEN-LAST:event_V20StateChanged

    private void V21StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V21StateChanged
        // TODO add your handling code here:
        ganancias.set(20,V21.getValue());
    }//GEN-LAST:event_V21StateChanged

    private void V22StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V22StateChanged
        // TODO add your handling code here:
        ganancias.set(21,V22.getValue());
    }//GEN-LAST:event_V22StateChanged

    private void V30StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V30StateChanged
        // TODO add your handling code here:
        ganancias.set(29,V30.getValue());
    }//GEN-LAST:event_V30StateChanged

    private void V25StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V25StateChanged
        // TODO add your handling code here:
        ganancias.set(24,V25.getValue());
    }//GEN-LAST:event_V25StateChanged

    private void V26StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V26StateChanged
        // TODO add your handling code here:
        ganancias.set(25,V26.getValue());
    }//GEN-LAST:event_V26StateChanged

    private void V27StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V27StateChanged
        // TODO add your handling code here:
        ganancias.set(26,V27.getValue());
    }//GEN-LAST:event_V27StateChanged

    private void V28StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V28StateChanged
        // TODO add your handling code here:
        ganancias.set(27,V28.getValue());
    }//GEN-LAST:event_V28StateChanged

    private void V29StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V29StateChanged
        // TODO add your handling code here:
        ganancias.set(28,V29.getValue());
    }//GEN-LAST:event_V29StateChanged

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        // TODO add your handling code here:
      //   AlternarAudio(alternar8, audio8,9,Conf,C9,V9);
       alternar8++;   
    if(alternar8==1){
         Conf=X.Read("config.xml");                
         try{
             audio8=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(8),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),1,V9,C9,socket);
             audio8.start();
              C9.setBackground(Color.GREEN);
              S9.setEnabled(true);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C9.setBackground(Color.RED);
               S9.setEnabled(false);
               S9.setSelected(false);
         }     
    }   
    if(alternar8==2){
         audio8.detener();
         audio8.stop();
         alternar8=0;
         C9.setBackground(Color.BLUE);
         S9.setEnabled(false);
         S9.setSelected(false);
    }
      
        /*
                  alternar8++;
               if(alternar8==1){
              canales.set(8,"ON");
            ganancias.set(8,V9.getValue());
                         C9.setBackground(Color.BLUE.darker());
            System.out.println(V9.getValue());
        }
          else if(alternar8==2){
                  alternar8=0;
              canales.set(8,"OFF");
            ganancias.set(8,V9.getValue());
                         C9.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C9ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        // TODO add your handling code here:
          //   AlternarAudio(alternar9, audio9,10,Conf,C10,V10);
       alternar9++;   
    if(alternar9==1){
         Conf=X.Read("config.xml");                
         try{
             audio9=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(9),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),9,V10,C10,socket);
             audio9.start();
              C10.setBackground(Color.GREEN);
              S10.setEnabled(true);
              S10.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C10.setBackground(Color.RED);
               S10.setEnabled(false);
               S10.setSelected(false);
         }     
    }   
    if(alternar9==2){
         audio9.detener();
         audio9.stop();
         alternar9=0;
         C10.setBackground(Color.BLUE);
         S10.setEnabled(false);
         S10.setSelected(false);
    }
          
        /*
                  alternar9++;
               if(alternar9==1){
              canales.set(9,"ON");
            ganancias.set(9,V10.getValue());
                         C10.setBackground(Color.BLUE.darker());
            System.out.println(V10.getValue());
        }
          else if(alternar9==2){
                  alternar9=0;
              canales.set(9,"OFF");
            ganancias.set(9,V10.getValue());
                         C10.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C10ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
        // TODO add your handling code here:
        //AlternarAudio(alternar10, audio10,11,Conf,C11,V11);
            alternar10++;   
    if(alternar10==1){
         Conf=X.Read("config.xml");                
         try{
             audio10=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(10),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),5,V11,C11,socket);
             audio10.start();
              C11.setBackground(Color.GREEN);
              S11.setEnabled(true);
              S11.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C11.setBackground(Color.RED);
               S11.setEnabled(false);
               S11.setSelected(false);
         }     
    }   
    if(alternar10==2){
         audio10.detener();
         audio10.stop();
         alternar10=0;
         C11.setBackground(Color.BLUE);
         S11.setEnabled(false);
         S11.setSelected(false);
    }
        
        /*
                  alternar10++;
               if(alternar10==1){
              canales.set(10,"ON");
            ganancias.set(10,V11.getValue());
                         C11.setBackground(Color.BLUE.darker());
            System.out.println(V11.getValue());
        }
          else if(alternar10==2){
                  alternar10=0;
              canales.set(10,"OFF");
            ganancias.set(10,V11.getValue());
                         C11.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C11ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
        // TODO add your handling code here:
         //  AlternarAudio(alternar11, audio11,12,Conf,C12,V12);
         
                alternar11++;   
    if(alternar11==1){
         Conf=X.Read("config.xml");                
         try{
             audio11=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(11),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),13,V12,C12,socket);
             audio11.start();
              C12.setBackground(Color.GREEN);
              S12.setEnabled(true);
              S12.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C12.setBackground(Color.RED);
               S12.setEnabled(false);
               S12.setSelected(false);
         }     
    }   
    if(alternar11==2){
         audio11.detener();
         audio11.stop();
         alternar11=0;
         C12.setBackground(Color.BLUE);
         S12.setEnabled(false);
         S12.setSelected(false);
    }
         
           /*
                  alternar11++;
               if(alternar11==1){
              canales.set(11,"ON");
            ganancias.set(11,V12.getValue());
                         C12.setBackground(Color.BLUE.darker());
            System.out.println(V12.getValue());
        }
          else if(alternar11==2){
                  alternar11=0;
              canales.set(11,"OFF");
            ganancias.set(11,V12.getValue());
                         C12.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C12ActionPerformed

    private void C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C13ActionPerformed
        // TODO add your handling code here:
          // AlternarAudio(alternar12, audio12,13,Conf,C13,V13);
          
       alternar12++;   
    if(alternar12==1){
         Conf=X.Read("config.xml");                
         try{
             audio12=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(12),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),17,V13,C13,socket);
             audio12.start();
              C13.setBackground(Color.GREEN);
              S13.setEnabled(true);
              S13.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C13.setBackground(Color.RED);
               S13.setEnabled(false);
               S13.setSelected(false);
         }     
    }   
    if(alternar12==2){
         audio12.detener();
         audio12.stop();
         alternar12=0;
         C13.setBackground(Color.BLUE);
         S13.setEnabled(false);
         S13.setSelected(false);
    }
          
        /*
                  alternar12++;
               if(alternar12==1){
              canales.set(12,"ON");
            ganancias.set(12,V13.getValue());
                         C13.setBackground(Color.BLUE.darker());
            System.out.println(V13.getValue());
        }
          else if(alternar12==2){
                  alternar12=0;
              canales.set(12,"OFF");
            ganancias.set(12,V13.getValue());
                         C13.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C13ActionPerformed

    private void C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14ActionPerformed
        // TODO add your handling code here:
        // AlternarAudio(alternar13, audio13,14,Conf,C14,V14);    
        
          alternar13++;   
    if(alternar13==1){
         Conf=X.Read("config.xml");                
         try{
             audio13=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(13),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),21,V14,C14,socket);
             audio13.start();
              C14.setBackground(Color.GREEN);
              S14.setEnabled(true);
              S14.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C14.setBackground(Color.RED);
               S14.setEnabled(false);
               S14.setSelected(false);
         }     
    }   
    if(alternar13==2){
         audio13.detener();
         audio13.stop();
         alternar13=0;
         C14.setBackground(Color.BLUE);
         S14.setEnabled(false);
         S14.setSelected(false);
    }
        
        
        /*
              alternar13++;
               if(alternar13==1){
              canales.set(13,"ON");
            ganancias.set(13,V14.getValue());
                         C14.setBackground(Color.BLUE.darker());
            System.out.println(V14.getValue());
        }
          else if(alternar13==2){
                  alternar13=0;
              canales.set(13,"OFF");
            ganancias.set(13,V14.getValue());
                         C14.setBackground(Color.GRAY.darker());
        
        }*/
                 
    }//GEN-LAST:event_C14ActionPerformed

    private void C17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C17ActionPerformed
        // TODO add your handling code here:
        
      //  AlternarAudio(alternar16,audio16,17,Conf,C17,V17); 
      
        alternar16++;   
    if(alternar16==1){
         Conf=X.Read("config.xml");                
         try{
             audio16=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(16),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),2,V17,C17,socket);
             audio16.start();
              C17.setBackground(Color.GREEN);
              S17.setEnabled(true);
              S17.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C17.setBackground(Color.RED);
               S17.setEnabled(false);
               S17.setSelected(false);
         }     
    }   
    if(alternar16==2){
         audio16.detener();
         audio16.stop();
         alternar16=0;
         C17.setBackground(Color.BLUE);
         S17.setEnabled(false);
         S17.setSelected(false);
    }
        
        /*
                  alternar16++;
               if(alternar16==1){
              canales.set(16,"ON");
            ganancias.set(16,V17.getValue());
                         C17.setBackground(Color.BLUE.darker());
            System.out.println(V17.getValue());
        }
          else if(alternar16==2){
                  alternar16=0;
              canales.set(16,"OFF");
            ganancias.set(16,V17.getValue());
                         C17.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C17ActionPerformed

    private void C18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C18ActionPerformed
        // TODO add your handling code here:
      //  AlternarAudio(alternar17,audio17,18,Conf,C18,V18); 
         alternar17++;   
    if(alternar17==1){
         Conf=X.Read("config.xml");                
         try{
             audio17=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(17),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),10,V18,C18,socket);
             audio17.start();
              C18.setBackground(Color.GREEN);
              S18.setEnabled(true);
              S18.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C18.setBackground(Color.RED);
               S18.setEnabled(false);
               S18.setSelected(false);
         }     
    }   
    if(alternar17==2){
         audio17.detener();
         audio17.stop();
         alternar17=0;
         C18.setBackground(Color.BLUE);
         S18.setEnabled(false);
         S18.setSelected(false);
    }
      
      
        /*
                  alternar17++;
               if(alternar17==1){
              canales.set(17,"ON");
            ganancias.set(17,V18.getValue());
                         C18.setBackground(Color.BLUE.darker());
            System.out.println(V18.getValue());
        }
          else if(alternar17==2){
                  alternar17=0;
              canales.set(17,"OFF");
            ganancias.set(17,V18.getValue());
                         C18.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C18ActionPerformed

    private void C19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C19ActionPerformed
        // TODO add your handling code here:
      //  AlternarAudio(alternar18,audio18,19,Conf,C19,V19); 
      
       alternar18++;   
    if(alternar18==1){
         Conf=X.Read("config.xml");                
         try{
             audio18=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(18),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),6,V19,C19,socket);
             audio18.start();
              C19.setBackground(Color.GREEN);
              S19.setEnabled(true);
              S19.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C19.setBackground(Color.RED);
               S19.setEnabled(false);
               S19.setSelected(false);
         }     
    }   
    if(alternar18==2){
         audio18.detener();
         audio18.stop();
         alternar18=0;
         C19.setBackground(Color.BLUE);
         S19.setEnabled(false);
         S19.setSelected(false);
    }
        /*
        
                  alternar18++;
               if(alternar18==1){
              canales.set(18,"ON");
            ganancias.set(18,V19.getValue());
                         C19.setBackground(Color.BLUE.darker());
            System.out.println(V19.getValue());
        }
          else if(alternar18==2){
                  alternar18=0;
              canales.set(18,"OFF");
            ganancias.set(18,V19.getValue());
                         C19.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C19ActionPerformed

    private void C20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C20ActionPerformed
        // TODO add your handling code here:
          // AlternarAudio(alternar19,audio19,20,Conf,C20,V20); 
          
       alternar19++;   
    if(alternar19==1){
         Conf=X.Read("config.xml");                
         try{
             audio19=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(19),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),14,V20,C20,socket);
             audio19.start();
              C20.setBackground(Color.GREEN);
              S20.setEnabled(true);
              S20.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C20.setBackground(Color.RED);
               S20.setEnabled(false);
               S20.setSelected(false);
         }     
    }   
    if(alternar19==2){
         audio19.detener();
         audio19.stop();
         alternar19=0;
         C20.setBackground(Color.BLUE);
         S20.setEnabled(false);
         S20.setSelected(false);
    }
          
               /*          
                  alternar19++;
               if(alternar19==1){
              canales.set(19,"ON");
            ganancias.set(19,V20.getValue());
                         C20.setBackground(Color.BLUE.darker());
            System.out.println(V20.getValue());
        }
          else if(alternar19==2){
                  alternar19=0;
              canales.set(19,"OFF");
            ganancias.set(19,V20.getValue());
                         C20.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C20ActionPerformed

    private void C21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C21ActionPerformed
        // TODO add your handling code here:
      //  AlternarAudio(alternar20,audio20,21,Conf,C21,V21); 
      
        alternar20++;   
    if(alternar20==1){
         Conf=X.Read("config.xml");                
         try{
             audio20=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(20),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),18,V21,C21,socket);
             audio20.start();
              C21.setBackground(Color.GREEN);
              S21.setEnabled(true);
              S21.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C21.setBackground(Color.RED);
               S21.setEnabled(false);
               S21.setSelected(false);
         }     
    }   
    if(alternar20==2){
         audio20.detener();
         audio20.stop();
         alternar20=0;
         C21.setBackground(Color.BLUE);
         S21.setEnabled(false);
         S21.setSelected(false);
    }
      
        /*
                  alternar20++;
               if(alternar20==1){
              canales.set(20,"ON");
            ganancias.set(20,V21.getValue());
                         C21.setBackground(Color.BLUE.darker());
            System.out.println(V21.getValue());
        }
          else if(alternar20==2){
                  alternar20=0;
              canales.set(20,"OFF");
            ganancias.set(20,V21.getValue());
                         C21.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C21ActionPerformed

    private void C22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C22ActionPerformed
        // TODO add your handling code here:
       // AlternarAudio(alternar21,audio21,22,Conf,C22,V22);
        
       
        alternar21++;   
    if(alternar21==1){
         Conf=X.Read("config.xml");                
         try{
             audio21=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(21),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),22,V22,C22,socket);
             audio21.start();
              C22.setBackground(Color.GREEN);
              S22.setEnabled(true);
              S22.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C22.setBackground(Color.RED);
               S22.setEnabled(false);
               S22.setSelected(false);
         }     
    }   
    if(alternar21==2){
         audio21.detener();
         audio21.stop();
         alternar21=0;
         C22.setBackground(Color.BLUE);
         S22.setEnabled(false);
         S22.setSelected(false);
    }
       
        /*
                  alternar21++;
               if(alternar21==1){
              canales.set(21,"ON");
            ganancias.set(21,V22.getValue());
                         C22.setBackground(Color.BLUE.darker());
            System.out.println(V22.getValue());
        }
          else if(alternar21==2){
                  alternar21=0;
              canales.set(21,"OFF");
            ganancias.set(21,V22.getValue());
                         C22.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C22ActionPerformed

    private void C25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C25ActionPerformed
        // TODO add your handling code here:
        
      //  AlternarAudio(alternar24,audio24,25,Conf,C25,V25);
      
       alternar24++;   
    if(alternar24==1){
         Conf=X.Read("config.xml");                
         try{
             audio24=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(24),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),3,V25,C25,socket);
             audio24.start();
              C25.setBackground(Color.GREEN);
              S25.setEnabled(true);
              S25.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C25.setBackground(Color.RED);
               S25.setEnabled(false);
               S25.setSelected(false);
         }     
    }   
    if(alternar24==2){
         audio24.detener();
         audio24.stop();
         alternar24=0;
         C25.setBackground(Color.BLUE);
         S25.setEnabled(false);
         S25.setSelected(false);
    }
      
        /*
                  alternar24++;
               if(alternar24==1){
              canales.set(24,"ON");
            ganancias.set(24,V25.getValue());
                         C25.setBackground(Color.BLUE.darker());
            System.out.println(V25.getValue());
        }
          else if(alternar24==2){
                  alternar24=0;
              canales.set(24,"OFF");
            ganancias.set(24,V25.getValue());
                         C25.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C25ActionPerformed

    private void C26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C26ActionPerformed
        // TODO add your handling code here:
      //  AlternarAudio(alternar25,audio25,26,Conf,C26,V26);
      
       alternar25++;   
    if(alternar25==1){
         Conf=X.Read("config.xml");                
         try{
             audio25=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(25),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),11,V26,C26,socket);
             audio25.start();
              C26.setBackground(Color.GREEN);
              S26.setEnabled(true);
              S26.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C26.setBackground(Color.RED);
               S26.setEnabled(false);
               S26.setSelected(false);
         }     
    }   
    if(alternar25==2){
         audio25.detener();
         audio25.stop();
         alternar25=0;
         C26.setBackground(Color.BLUE);
         S26.setEnabled(false);
         S26.setSelected(false);
    }
      
        /*
                  alternar25++;
               if(alternar25==1){
              canales.set(25,"ON");
            ganancias.set(25,V26.getValue());
                         C26.setBackground(Color.BLUE.darker());
            System.out.println(V26.getValue());
        }
          else if(alternar25==2){
                  alternar25=0;
              canales.set(25,"OFF");
            ganancias.set(25,V26.getValue());
                         C26.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C26ActionPerformed

    private void C27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C27ActionPerformed
        // TODO add your handling code here:
      //  AlternarAudio(alternar26,audio26,27,Conf,C27,V27);
      
           alternar26++;   
    if(alternar26==1){
         Conf=X.Read("config.xml");                
         try{
             audio26=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(26),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),7,V27,C27,socket);
             audio26.start();
              C27.setBackground(Color.GREEN);
              S27.setEnabled(true);
              S27.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C27.setBackground(Color.RED);
               S27.setEnabled(false);
               S27.setSelected(false);
         }     
    }   
    if(alternar26==2){
         audio26.detener();
         audio26.stop();
         alternar26=0;
         C27.setBackground(Color.BLUE);
         S27.setEnabled(false);
         S27.setSelected(false);
    }
      
        /*
                  alternar26++;
               if(alternar26==1){
              canales.set(26,"ON");
            ganancias.set(26,V27.getValue());
                         C27.setBackground(Color.BLUE.darker());
            System.out.println(V27.getValue());
        }
          else if(alternar26==2){
                  alternar26=0;
              canales.set(26,"OFF");
            ganancias.set(26,V27.getValue());
                         C27.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C27ActionPerformed

    private void C28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C28ActionPerformed
        // TODO add your handling code here:
       //  AlternarAudio(alternar27,audio27,28,Conf,C28,V28);
       
             alternar27++;   
    if(alternar27==1){
         Conf=X.Read("config.xml");                
         try{
             audio27=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(27),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),15,V28,C28,socket);
             audio27.start();
              C28.setBackground(Color.GREEN);
              S28.setEnabled(true);
              S28.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C28.setBackground(Color.RED);
               S28.setEnabled(false);
               S28.setSelected(false);
         }     
    }   
    if(alternar27==2){
         audio27.detener();
         audio27.stop();
         alternar27=0;
         C28.setBackground(Color.BLUE);
         S28.setEnabled(false);
         S28.setSelected(false);
    }
       
        /*
                  alternar27++;
               if(alternar27==1){
              canales.set(27,"ON");
            ganancias.set(27,V28.getValue());
                         C28.setBackground(Color.BLUE.darker());
            System.out.println(V28.getValue());
        }
          else if(alternar27==2){
                  alternar27=0;
              canales.set(27,"OFF");
            ganancias.set(27,V28.getValue());
                         C28.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C28ActionPerformed

    private void C29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C29ActionPerformed
        // TODO add your handling code here:
        //  AlternarAudio(alternar28,audio28,29,Conf,C29,V29);
        
       alternar28++;   
    if(alternar28==1){
         Conf=X.Read("config.xml");                
         try{
             audio28=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(28),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),20,V6,C29,socket);
             audio28.start();
              C29.setBackground(Color.GREEN);
              S29.setEnabled(true);
              S29.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C29.setBackground(Color.RED);
               S29.setEnabled(false);
               S29.setSelected(false);
         }     
    }   
    if(alternar28==2){
         audio28.detener();
         audio28.stop();
         alternar28=0;
         C29.setBackground(Color.BLUE);
         S29.setEnabled(false);
         S29.setSelected(false);
    }
        
        /*
                  alternar28++;
               if(alternar28==1){
              canales.set(28,"ON");
            ganancias.set(28,V29.getValue());
                         C29.setBackground(Color.BLUE.darker());
            System.out.println(V29.getValue());
        }
          else if(alternar28==2){
                  alternar28=0;
              canales.set(28,"OFF");
            ganancias.set(28,V29.getValue());
                         C29.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C29ActionPerformed

    private void C30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C30ActionPerformed
        // TODO add your handling code here:
     //   AlternarAudio(alternar29,audio29,30,Conf,C30,V30);
     
       alternar29++;   
    if(alternar29==1){
         Conf=X.Read("config.xml");                
         try{
             audio29=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(29),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),23,V30,C30,socket);
             audio29.start();
              C30.setBackground(Color.GREEN);
              S30.setEnabled(true);
              S30.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C30.setBackground(Color.RED);
               S30.setEnabled(false);
               S30.setSelected(false);
         }     
    }   
    if(alternar29==2){
         audio29.detener();
         audio29.stop();
         alternar29=0;
         C30.setBackground(Color.BLUE);
         S30.setEnabled(false);
         S30.setSelected(false);
    }
     
        /*
                  alternar29++;
               if(alternar29==1){
              canales.set(29,"ON");
            ganancias.set(29,V30.getValue());
                         C30.setBackground(Color.BLUE.darker());
            System.out.println(V30.getValue());
        }
          else if(alternar29==2){
                  alternar29=0;
              canales.set(29,"OFF");
            ganancias.set(29,V30.getValue());
                         C30.setBackground(Color.GRAY.darker());
        
        }*/
    }//GEN-LAST:event_C30ActionPerformed

    private void V1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V1StateChanged
        // TODO add your handling code here:
         ganancias.set(0,V1.getValue());
    }//GEN-LAST:event_V1StateChanged

    private void V2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V2StateChanged
        // TODO add your handling code here:
        ganancias.set(1,V2.getValue());
    }//GEN-LAST:event_V2StateChanged

    private void V3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V3StateChanged
        // TODO add your handling code here:
        ganancias.set(2,V3.getValue());
    }//GEN-LAST:event_V3StateChanged

    private void V4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V4StateChanged
        // TODO add your handling code here:
        ganancias.set(3,V4.getValue());
    }//GEN-LAST:event_V4StateChanged

    private void V5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V5StateChanged
        // TODO add your handling code here:
        ganancias.set(4,V5.getValue());
    }//GEN-LAST:event_V5StateChanged

    private void V6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_V6StateChanged
        // TODO add your handling code here:
        ganancias.set(5,V6.getValue());
    }//GEN-LAST:event_V6StateChanged

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
            alternar6++;   
    if(alternar6==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio6=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(6),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),24,V7,C7,socket);
             audio6.start();
              C7.setBackground(Color.GREEN);
              S7.setEnabled(true);
              S7.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C7.setBackground(Color.RED);
               S7.setEnabled(false);
               S7.setSelected(false);
         }     
    }   
    if(alternar6==2){
         audio6.detener();
         audio6.stop();
         alternar6=0;
         C7.setBackground(Color.BLUE);
         S7.setEnabled(false);
         S7.setSelected(false);
    }
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
            alternar7++;   
    if(alternar7==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio7=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(7),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),25,V8,C8,socket);
             audio7.start();
              C8.setBackground(Color.GREEN);
              S8.setEnabled(true);
              S8.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C8.setBackground(Color.RED);
               S8.setEnabled(false);
               S8.setSelected(false);
         }     
    }   
    if(alternar7==2){
         audio7.detener();
         audio7.stop();
         alternar7=0;
         C8.setBackground(Color.BLUE);
         S8.setEnabled(false);
         S8.setSelected(false);
    }
    }//GEN-LAST:event_C8ActionPerformed

    private void C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C15ActionPerformed
        // TODO add your handling code here:
            alternar14++;   
    if(alternar14==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio14=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(14),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),26,V15,C15,socket);
             audio14.start();
              C15.setBackground(Color.GREEN);
              S15.setEnabled(true);
              S15.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C15.setBackground(Color.RED);
               S15.setEnabled(false);
               S15.setSelected(false);
         }     
    }   
    if(alternar14==2){
         audio14.detener();
         audio14.stop();
         alternar14=0;
         C15.setBackground(Color.BLUE);
         S15.setEnabled(false);
         S15.setSelected(false);
    }
    }//GEN-LAST:event_C15ActionPerformed

    private void C16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C16ActionPerformed
        // TODO add your handling code here:
            alternar15++;   
    if(alternar15==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio15=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(15),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),27,V16,C16,socket);
             audio15.start();
              C16.setBackground(Color.GREEN);
              S16.setEnabled(true);
              S16.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C16.setBackground(Color.RED);
               S16.setEnabled(false);
               S16.setSelected(false);
         }     
    }   
    if(alternar15==2){
         audio15.detener();
         audio15.stop();
         alternar15=0;
         C16.setBackground(Color.BLUE);
         S16.setEnabled(false);
         S16.setSelected(false);
    }
    }//GEN-LAST:event_C16ActionPerformed

    private void C23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C23ActionPerformed
        // TODO add your handling code here:
            alternar22++;   
    if(alternar22==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio22=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(22),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),28,V23,C23,socket);
             audio22.start();
              C23.setBackground(Color.GREEN);
              S23.setEnabled(true);
              S23.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C23.setBackground(Color.RED);
               S23.setEnabled(false);
               S23.setSelected(false);
         }     
    }   
    if(alternar22==2){
         audio22.detener();
         audio22.stop();
         alternar22=0;
         C23.setBackground(Color.BLUE);
         S23.setEnabled(false);
         S23.setSelected(false);
    }
    }//GEN-LAST:event_C23ActionPerformed

    private void C24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C24ActionPerformed
        // TODO add your handling code here:
            alternar23++;   
    if(alternar23==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio23=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(23),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),29,V24,C24,socket);
             audio23.start();
              C24.setBackground(Color.GREEN);
              S24.setEnabled(true);
              S24.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C24.setBackground(Color.RED);
               S24.setEnabled(false);
               S24.setSelected(false);
         }     
    }   
    if(alternar23==2){
         audio23.detener();
         audio23.stop();
         alternar23=0;
         C24.setBackground(Color.BLUE);
         S24.setEnabled(false);
         S24.setSelected(false);
    }
    }//GEN-LAST:event_C24ActionPerformed

    private void C31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C31ActionPerformed
        // TODO add your handling code here:
            alternar30++;   
    if(alternar30==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio30=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(30),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),30,V31,C31,socket);
             audio30.start();
              C31.setBackground(Color.GREEN);
              S31.setEnabled(true);
              S31.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C31.setBackground(Color.RED);
               S31.setEnabled(false);
               S31.setSelected(false);
         }     
    }   
    if(alternar30==2){
         audio30.detener();
         audio30.stop();
         alternar30=0;
         C31.setBackground(Color.BLUE);
         S31.setEnabled(false);
         S31.setSelected(false);
    }
    }//GEN-LAST:event_C31ActionPerformed

    private void C32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C32ActionPerformed
        // TODO add your handling code here:
            alternar31++;   
    if(alternar31==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio31=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(31),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),31,V32,C32,socket);
             audio31.start();
              C32.setBackground(Color.GREEN);
              S32.setEnabled(true);
              S32.setSelected(false);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C32.setBackground(Color.RED);
               S32.setEnabled(false);
               S32.setSelected(false);
         }     
    }   
    if(alternar31==2){
         audio31.detener();
         audio31.stop();
         alternar4=0;
         C32.setBackground(Color.BLUE);
         S32.setEnabled(false);
         S32.setSelected(false);
    }
    }//GEN-LAST:event_C32ActionPerformed

    
    ///////
    
    private boolean desactivateButton(JButton boton,JRadioButton radio,int banderaAlternar,ThreadAudio tempAudio,boolean lastActivate){
       
        try{
            if(!radio.isSelected() && tempAudio.IsRunning()){
            tempAudio.SetForcedDown(true);
            //tempAudio.detener();
            banderaAlternar=0;
            boton.setBackground(Color.blue);
            lastActivate = true;
            radio.setEnabled(false);
            return true;
        }
        }
        catch(Exception ex){
            return false;
            
        }
        
        
        return false;
    }
    
    private void activateLastButton(JButton boton,JRadioButton radio,int banderaAlternar,ThreadAudio tempAudio,boolean lastActivate,JSlider V){
        
        if(lastActivate==true){
            lastActivate=false;
            banderaAlternar=1;
            
            try{
            Conf=X.Read("config.xml"); 
            tempAudio=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(0),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),0,V,boton,socket);
            tempAudio.start();
            boton.setBackground(Color.GREEN);
            
            radio.setEnabled(true);
            radio.setSelected(false);
         }
         catch(Exception e){
            System.out.println("Error de hilo ");
            boton.setBackground(Color.RED);
            radio.setEnabled(false);
            
         }
            
        }
        
    }
    
    
    
    private void DisableVolumeExcept(JSlider j){
        
        Component[] components = this.getComponents();
        
        for (Component component : components)
          {
            if (component instanceof JSlider)
            {
                
                
                if (!component.equals(j)){
                    ((JSlider) component).setValue(0);
                }
            }
          }
    }
    
     private void EnableVolume(){
        
        Component[] components = this.getComponents();
        
        for (Component component : components)
          {
            if (component instanceof JSlider)
            {
                ((JSlider) component).setValue(10);
            }
          }
    }
      ////
    
    void test(){
    }
    
    
    
    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed
        // TODO add your handling code here:
         if(S1.isSelected()){
         
            DisableVolumeExcept(V1);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S1ActionPerformed

    private void S9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S9ActionPerformed
        // TODO add your handling code here:
         if(S9.isSelected()){
         
            DisableVolumeExcept(V9);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S9ActionPerformed

    private void S17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S17ActionPerformed
        // TODO add your handling code here:
         if(S17.isSelected()){
         
            DisableVolumeExcept(V17);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S17ActionPerformed

    private void S25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S25ActionPerformed
        // TODO add your handling code here:
          if(S25.isSelected()){
         
            DisableVolumeExcept(V25);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S25ActionPerformed

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S3ActionPerformed
        // TODO add your handling code here:
         if(S3.isSelected()){
         
            DisableVolumeExcept(V3);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S3ActionPerformed

    private void S11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S11ActionPerformed
        // TODO add your handling code here:
         if(S11.isSelected()){
         
            DisableVolumeExcept(V11);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S11ActionPerformed

    private void S19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S19ActionPerformed
        // TODO add your handling code here:
        if(S19.isSelected()){
         
            DisableVolumeExcept(V19);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S19ActionPerformed

    private void S27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S27ActionPerformed
        // TODO add your handling code here:
        if(S27.isSelected()){
         
            DisableVolumeExcept(V27);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S27ActionPerformed

    private void S2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S2ActionPerformed
        // TODO add your handling code here:
        if(S2.isSelected()){
         
            DisableVolumeExcept(V2);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S2ActionPerformed

    private void S10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S10ActionPerformed
        // TODO add your handling code here:
         if(S10.isSelected()){
         
            DisableVolumeExcept(V10);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S10ActionPerformed

    private void S18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S18ActionPerformed
        // TODO add your handling code here:
        if(S18.isSelected()){
         
            DisableVolumeExcept(V18);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S18ActionPerformed

    private void S26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S26ActionPerformed
        // TODO add your handling code here:
        if(S26.isSelected()){
         
            DisableVolumeExcept(V26);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S26ActionPerformed

    private void S4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S4ActionPerformed
        // TODO add your handling code here:
        if(S4.isSelected()){
         
            DisableVolumeExcept(V4);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S4ActionPerformed

    private void S12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S12ActionPerformed
        // TODO add your handling code here:
        if(S12.isSelected()){
         
            DisableVolumeExcept(V12);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S12ActionPerformed

    private void S20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S20ActionPerformed
        // TODO add your handling code here:
        if(S20.isSelected()){
         
            DisableVolumeExcept(V20);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S20ActionPerformed

    private void S28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S28ActionPerformed
        // TODO add your handling code here:
        if(S28.isSelected()){
         
            DisableVolumeExcept(V28);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S28ActionPerformed

    private void S5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S5ActionPerformed
        // TODO add your handling code here:
        if(S5.isSelected()){
         
            DisableVolumeExcept(V5);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S5ActionPerformed

    private void S13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S13ActionPerformed
        // TODO add your handling code here:
        if(S13.isSelected()){
         
            DisableVolumeExcept(V13);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S13ActionPerformed

    private void S21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S21ActionPerformed
        // TODO add your handling code here:
         if(S21.isSelected()){
         
            DisableVolumeExcept(V21);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S21ActionPerformed

    private void S6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S6ActionPerformed
        // TODO add your handling code here:
        if(S6.isSelected()){
         
            DisableVolumeExcept(V6);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S6ActionPerformed

    private void S29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S29ActionPerformed
        // TODO add your handling code here:
         if(S29.isSelected()){
         
            DisableVolumeExcept(V29);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S29ActionPerformed

    private void S14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S14ActionPerformed
        // TODO add your handling code here:
         if(S14.isSelected()){
         
            DisableVolumeExcept(V14);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S14ActionPerformed

    private void S22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S22ActionPerformed
        // TODO add your handling code here:
        if(S22.isSelected()){
         
            DisableVolumeExcept(V22);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S22ActionPerformed

    private void S30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S30ActionPerformed
        // TODO add your handling code here:
        if(S30.isSelected()){
         
            DisableVolumeExcept(V30);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S30ActionPerformed

    private void S7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S7ActionPerformed
        // TODO add your handling code here:
        if(S7.isSelected()){
         
            DisableVolumeExcept(V7);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S7ActionPerformed

    private void S8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S8ActionPerformed
        // TODO add your handling code here:
        if(S8.isSelected()){
         
            DisableVolumeExcept(V8);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S8ActionPerformed

    private void S15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S15ActionPerformed
        // TODO add your handling code here:
        if(S15.isSelected()){
         
            DisableVolumeExcept(V15);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S15ActionPerformed

    private void S16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S16ActionPerformed
        // TODO add your handling code here:
        if(S16.isSelected()){
         
            DisableVolumeExcept(V16);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S16ActionPerformed

    private void S23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S23ActionPerformed
        // TODO add your handling code here:
        if(S23.isSelected()){
         
            DisableVolumeExcept(V23);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S23ActionPerformed

    private void S24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S24ActionPerformed
        // TODO add your handling code here:
        if(S24.isSelected()){
         
            DisableVolumeExcept(V24);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S24ActionPerformed

    private void S31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S31ActionPerformed
        // TODO add your handling code here:
        if(S31.isSelected()){
         
            DisableVolumeExcept(V31);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S31ActionPerformed

    private void S32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S32ActionPerformed
        // TODO add your handling code here:
        if(S32.isSelected()){
         
            DisableVolumeExcept(V32);
        }
        else{
          EnableVolume();
            
        }
    }//GEN-LAST:event_S32ActionPerformed

    
    
    
    private  void AlternarAudio(int alternar,ThreadAudio audio,int numerocanal,Configuracion C,JButton J,JSlider V){
          
          alternar++;   
    if(alternar==1){
         C=X.Read("config.xml");        
         
         audio=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(0),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),numerocanal,V,C1,socket);
         audio.start();   
         J.setBackground(Color.GREEN);
    }   

    if(alternar==2){
         audio.detener();
         audio.stop();
         alternar=0;
         J.setBackground(Color.white);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C11;
    private javax.swing.JButton C12;
    private javax.swing.JButton C13;
    private javax.swing.JButton C14;
    private javax.swing.JButton C15;
    private javax.swing.JButton C16;
    private javax.swing.JButton C17;
    private javax.swing.JButton C18;
    private javax.swing.JButton C19;
    private javax.swing.JButton C2;
    private javax.swing.JButton C20;
    private javax.swing.JButton C21;
    private javax.swing.JButton C22;
    private javax.swing.JButton C23;
    private javax.swing.JButton C24;
    private javax.swing.JButton C25;
    private javax.swing.JButton C26;
    private javax.swing.JButton C27;
    private javax.swing.JButton C28;
    private javax.swing.JButton C29;
    private javax.swing.JButton C3;
    private javax.swing.JButton C30;
    private javax.swing.JButton C31;
    private javax.swing.JButton C32;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JLabel I1;
    private javax.swing.JLabel I10;
    private javax.swing.JLabel I11;
    private javax.swing.JLabel I12;
    private javax.swing.JLabel I13;
    private javax.swing.JLabel I14;
    private javax.swing.JLabel I15;
    private javax.swing.JLabel I16;
    private javax.swing.JLabel I17;
    private javax.swing.JLabel I18;
    private javax.swing.JLabel I19;
    private javax.swing.JLabel I2;
    private javax.swing.JLabel I20;
    private javax.swing.JLabel I21;
    private javax.swing.JLabel I22;
    private javax.swing.JLabel I23;
    private javax.swing.JLabel I24;
    private javax.swing.JLabel I25;
    private javax.swing.JLabel I26;
    private javax.swing.JLabel I27;
    private javax.swing.JLabel I28;
    private javax.swing.JLabel I29;
    private javax.swing.JLabel I3;
    private javax.swing.JLabel I30;
    private javax.swing.JLabel I31;
    private javax.swing.JLabel I32;
    private javax.swing.JLabel I4;
    private javax.swing.JLabel I5;
    private javax.swing.JLabel I6;
    private javax.swing.JLabel I7;
    private javax.swing.JLabel I8;
    private javax.swing.JLabel I9;
    private javax.swing.JToggleButton S1;
    private javax.swing.JToggleButton S10;
    private javax.swing.JToggleButton S11;
    private javax.swing.JToggleButton S12;
    private javax.swing.JToggleButton S13;
    private javax.swing.JToggleButton S14;
    private javax.swing.JToggleButton S15;
    private javax.swing.JToggleButton S16;
    private javax.swing.JToggleButton S17;
    private javax.swing.JToggleButton S18;
    private javax.swing.JToggleButton S19;
    private javax.swing.JToggleButton S2;
    private javax.swing.JToggleButton S20;
    private javax.swing.JToggleButton S21;
    private javax.swing.JToggleButton S22;
    private javax.swing.JToggleButton S23;
    private javax.swing.JToggleButton S24;
    private javax.swing.JToggleButton S25;
    private javax.swing.JToggleButton S26;
    private javax.swing.JToggleButton S27;
    private javax.swing.JToggleButton S28;
    private javax.swing.JToggleButton S29;
    private javax.swing.JToggleButton S3;
    private javax.swing.JToggleButton S30;
    private javax.swing.JToggleButton S31;
    private javax.swing.JToggleButton S32;
    private javax.swing.JToggleButton S4;
    private javax.swing.JToggleButton S5;
    private javax.swing.JToggleButton S6;
    private javax.swing.JToggleButton S7;
    private javax.swing.JToggleButton S8;
    private javax.swing.JToggleButton S9;
    private javax.swing.JSlider V1;
    private javax.swing.JSlider V10;
    private javax.swing.JSlider V11;
    private javax.swing.JSlider V12;
    private javax.swing.JSlider V13;
    private javax.swing.JSlider V14;
    private javax.swing.JSlider V15;
    private javax.swing.JSlider V16;
    private javax.swing.JSlider V17;
    private javax.swing.JSlider V18;
    private javax.swing.JSlider V19;
    private javax.swing.JSlider V2;
    private javax.swing.JSlider V20;
    private javax.swing.JSlider V21;
    private javax.swing.JSlider V22;
    private javax.swing.JSlider V23;
    private javax.swing.JSlider V24;
    private javax.swing.JSlider V25;
    private javax.swing.JSlider V26;
    private javax.swing.JSlider V27;
    private javax.swing.JSlider V28;
    private javax.swing.JSlider V29;
    private javax.swing.JSlider V3;
    private javax.swing.JSlider V30;
    private javax.swing.JSlider V31;
    private javax.swing.JSlider V32;
    private javax.swing.JSlider V4;
    private javax.swing.JSlider V5;
    private javax.swing.JSlider V6;
    private javax.swing.JSlider V7;
    private javax.swing.JSlider V8;
    private javax.swing.JSlider V9;
    // End of variables declaration//GEN-END:variables

    private void elseif() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
