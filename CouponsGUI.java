package Model;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
//  w ww  .  j a  v a  2  s  .co  m
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class CouponsGUI {
  public static void main(String[] args) {

    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    int x = 1;
    int y = 7;
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(x, y));
    
      JButton button1 = new JButton();
      JButton button2 = new JButton();
      JButton button3 = new JButton();
      JButton button4 = new JButton();
      JButton button5 = new JButton();
      JButton button6 = new JButton();
      JButton button7 = new JButton();
     // button.setIcon(new ImageIcon(img));
      button1.setPreferredSize(new Dimension(200, 200));
       button2.setPreferredSize(new Dimension(200, 200));
        button3.setPreferredSize(new Dimension(200, 200));
         button4.setPreferredSize(new Dimension(200, 200));
          button5.setPreferredSize(new Dimension(200, 200));
           button6.setPreferredSize(new Dimension(200, 200));
            button7.setPreferredSize(new Dimension(200, 200));
         
            
            
//            ImageIcon image = new ImageIcon (".gif");
        
        
            button1.setIcon(new ImageIcon("grocery.png"));
            button2.setIcon(new ImageIcon("clothing.PNG"));
             button3.setIcon(new ImageIcon("travel.PNG"));
             button4.setIcon(new ImageIcon("transportation.png"));
            button5.setIcon(new ImageIcon("recreation.png"));
             button6.setIcon(new ImageIcon("housing.PNG"));
             button7.setIcon(new ImageIcon("other.png"));
            
         
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);
      panel.add(button7);
      
      
    
    
    
    JPanel container = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
    container.add(panel);
    JScrollPane scrollPane = new JScrollPane(container);
    f.getContentPane().add(scrollPane);

    f.pack();
    f.setLocationRelativeTo(null);
    f.setVisible(true);
  }
}