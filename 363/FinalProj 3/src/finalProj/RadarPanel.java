/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProj;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.Random;

/**
 *
 * @author Dakota Krout
 */

public class RadarPanel extends javax.swing.JPanel {
    boolean doSomething;
    finalProjMain main;
   ScenarioPanel woof;
    public RadarPanel(finalProjMain main) {
        initComponents();
        this.main = main;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    int i = 0;
    boolean nearMiss=false;
     int m1x=0;
     int m1y=0;
      int m2x=0;
     int m2y=0;
    boolean hit=false;
    boolean landME=false;
    boolean takeOff =false;
    boolean miss=false;
     int xx=0;
             int xy=0;
     int xz=0;
     int yy=0;
      int tx=0;
     int ty=0;
    int curr=0;
    
    public void paintComponent(Graphics g) {
		super.paintComponent(g);
               Graphics a=g;
               Graphics boom=g;
               Graphics b=g;
               Graphics c=g;
               Graphics alanding=g;
               Graphics aTakeoff=g;
               Graphics miss1=g;
               Graphics miss2=g;
                g.drawOval(200,50,600,600);
                g.drawOval(300,150,400,400);
                
                g.drawOval(250,100,500,500);
                g.drawOval(350,200,300,300);
                g.drawOval(400,250,200,200);
                g.drawOval(450,300,100,100);
                //port
                             
                g.setColor(Color.BLACK);
                //Left Entrance
                g.drawLine(100, 250, 230, 250);
                g.drawLine(100, 350, 230, 350);
               
                //land here
                g.drawLine(400, 350, 600, 350);
                g.drawLine(400, 325, 600, 325);

                //Right entrance
                g.drawLine(770, 250, 900, 250);
                g.drawLine(770, 350, 900, 350);
                           
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                i++;
                if (i%2==0){curr++;} 
                if (i%2==0){repaint();}}
        };
        Timer time = new Timer(2000, listener);
        
        time.start();
         //nearMiss=true;
         
         if (i > 600 && nearMiss == false)
         {
             m1x=500;//starts on left
             m2x=300;        
         miss1.setColor(Color.green);
         miss2.setColor(Color.green);
         miss1.fillOval(m1x,500,20,20);
         miss2.fillOval(m2x,510,20,20);
         
         nearMiss=true;
    
         }
         
         if(nearMiss){
             
            if (i%2==0){
                   
                  if (m1x<=m2x+40&&m1x>=m2x){
                        miss1.setColor(Color.orange);
                        miss2.setColor(Color.orange);
                        m1x-=1;
                        m2x+=1; 
                        miss1.fillOval(m1x,500,20,20);
                miss2.fillOval(m2x,510,20,20);
                  } 
            else{   
            miss1.setColor(Color.green);
            miss2.setColor(Color.green);
            m1x-=1;
             m2x+=1;
             miss1.fillOval(m1x,500,20,20);
                miss2.fillOval(m2x,510,20,20);
                  }
            }
                
              
         }
         //end
         
         //collision
         
         if (curr==15){
             //collision
              xx=375;
              xy=560;
                 a.setColor(Color.GREEN);
                 a.fillOval(xx,200,20,20);
                 b.setColor(Color.GREEN);
                 b.fillOval(xy,200,20,20);
                  hit=true;
         }
         if (hit){
         if (hit&&i%10==0){
              if (xx<xy&&xx+20<xy)
                {xx+=1;xy-=1;
                a.setColor(Color.GREEN);
                b.setColor(Color.GREEN);
                a.fillOval(xx,200,20,20);
                b.fillOval(xy,200,20,20);}
                
             
             else if (xx<xy&&xx+50<=xy){ 
                    xx+=1;xy-=1;
                    a.setColor(Color.ORANGE);
                    a.setColor(Color.ORANGE);
                    a.fillOval(xx,200,20,20);
                    b.fillOval(xy,200,20,20);}
                    }
         else if (xx>=xy){hit=false;}
         else{     if(xx+50<xy&&hit){
             xx+=1;xy-=1;
             a.setColor(Color.GREEN);
                b.setColor(Color.GREEN);
                a.fillOval(xx,200,20,20);
                b.fillOval(xy,200,20,20);}
                    else{ 
             xx+=1;xy-=1;
            
                    if (xx+50<xy){a.setColor(Color.red);}
                    else{ a.setColor(Color.ORANGE);
                    a.setColor(Color.ORANGE);}
                    a.fillOval(xx,200,20,20);
                    b.fillOval(xy,200,20,20);}
                }
         }
         if (i>40&&hit==false){
         boom.setColor(Color.red);
         boom.fillRect(xx,200,20,20);}
        //end of collision
         
         //landing
         if (i==0){alanding.setColor(Color.green);
         yy=300;xz=100;
         alanding.fillOval(xz, yy, 20, 20);
         landME=true;
         
         }
         if (landME){
         if (landME&&i%2==0){
                if (xz!=500||yy!=325){
                   if (xz!=500){xz+=2;}
                   if (yy!=325){yy+=1;}
                    alanding.setColor(Color.green);
                    alanding.fillOval(xz, yy, 20, 20);
                        }
         }
         
         else{
             if (xz!=500&&yy!=325){alanding.setColor(Color.green);
                    alanding.fillOval(xz, yy, 20, 20);}
         if(xz==500&&yy==325) { alanding.setColor(Color.white); landME=false;}
         }
         }  
    //takeoff
         
         if (i==10){
             aTakeoff.setColor(Color.green);
         tx=500;ty=325;
         alanding.fillOval(tx, ty, 20, 20);
         takeOff=true;
         }
         if (takeOff){
         if (takeOff&&i%2==0){
                if (tx!=800||ty!=325){
                   if (tx!=800){tx+=2;}
                   if (ty!=325){ty+=1;}
                    aTakeoff.setColor(Color.green);
                    aTakeoff.fillOval(tx, ty, 20, 20);
                        }
         }
         
         else{
             if (tx!=800&&ty!=325){alanding.setColor(Color.green);
                    aTakeoff.fillOval(tx, ty, 20, 20);}
         if(xz==800&&yy==325) { aTakeoff.setColor(Color.white); takeOff=false;}
         }
         }
       
    //near miss
         
         
         /*
          int m1x=0;
     int m1y=0;
      int m2x=0;
     int m2y=0;
         */
         
         }

    
 
     
        

    /*public static void HitMe(Graphics g){
        super.paintComponent(g);
                 g.setColor(Color.GREEN);
                 g.drawOval(350,200,5,5);
                 g.drawOval(400,200,5,5);
		//timer = new Timer(n, this);
	}
	*/
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

