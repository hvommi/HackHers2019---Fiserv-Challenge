package Account;

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 

public class drawLine extends Applet {
    
    public int [] xVals;
    public double [] yVals;
    
     public drawLine(){
          
         //graph();
      }
   
      public drawLine(int [] x, double [] y){
             xVals = x; //weeks in a month (week1, week2... on graph) - xAxis on graph
		 yVals = y; //total transaction amounts - yAxis on graph
         }
      
     
      //public static void graph()   
      public static void lineGraph() 
    { 
        Frame drawLineApplet = new Frame("Draw Line in Applet Window Example"); 
        drawLineApplet.setSize(350, 250); 
        Applet drawLine = new drawLine(); 
        drawLineApplet.add(drawLine); 
        drawLineApplet.setVisible(true); 
        drawLineApplet.addWindowListener(new WindowAdapter() { 
        public void windowClosing(WindowEvent e) {System.exit(0); } 
                                                                                   }); 
    } 
      
      public void paint(Graphics g) 
  { 
          // Now we tell g to change the font 
         g.setFont(new Font("Arial",Font.BOLD,14)); 
        //Syntax: drawString(String str, int xBaselineLeft, int yBaselineLeft);   
         g.drawString("This is your Weekly Spendings Per Month", 300, 500);   
        // draws a Line 
         g.setColor(Color.blue);  // Now we tell g to change the color 
        //Syntax For:- drawLine(int x1, int y1, int x2, int y2); 
        
//        for (int i = 0; i < 2; i++){
//          g.drawLine(x[i], y[i], x[i+1], y[i+1]);   
//        }
         g.drawLine(90, 100, 270, 200); 
         g.drawString("$550", 95, 100);  
        
        g.setColor(Color.green);  // Now we tell g to change the color 
         g.drawString("$250", 275, 210);  
        g.drawLine(270, 200, 450, 150); 
        
         
        g.setColor(Color.red);
        g.drawLine(450, 150, 630, 300); 
         g.drawString("$370", 455, 150);  
         g.setColor(Color.orange);
        g.drawLine(630, 300, 700, 400); 
         g.drawString("$50", 680, 350);  
       // g.drawLine(0, 0, 100, 100); 
   } 
    
}
