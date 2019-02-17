package Account.coupons;

import Account.Accounts;

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
    
    public static void showCoupons(){

    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    int x = 1;
    int y = 8;
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(x, y));
    
      JButton button1 = new JButton();
      JButton button2 = new JButton();
      JButton button3 = new JButton();
      JButton button4 = new JButton();
      JButton button5 = new JButton();
      JButton button6 = new JButton();
      JButton button7 = new JButton();
      JButton button8 = new JButton();
     // button.setIcon(new ImageIcon(img));
     
      button1.setPreferredSize(new Dimension(200, 200));
       button2.setPreferredSize(new Dimension(200, 200));
        button3.setPreferredSize(new Dimension(200, 200));
         button4.setPreferredSize(new Dimension(200, 200));
          button5.setPreferredSize(new Dimension(200, 200));
           button6.setPreferredSize(new Dimension(200, 200));
            button7.setPreferredSize(new Dimension(200, 200));
           button8.setPreferredSize(new Dimension(200, 200));
            
            
//            ImageIcon image = new ImageIcon (".gif");
        
        
            button1.setIcon(new ImageIcon("grocery.png"));
            button2.setIcon(new ImageIcon("clothing.PNG"));
             button3.setIcon(new ImageIcon("travel.PNG"));
             button4.setIcon(new ImageIcon("transportation.png"));
            button5.setIcon(new ImageIcon("recreation.png"));
             button6.setIcon(new ImageIcon("housing.PNG"));
             button7.setIcon(new ImageIcon("other.png"));
             
             button8.setText("Back");
            
         
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);
      panel.add(button7);
      panel.add(button8);
      
      
      
    //JOptionPane.showMessageDialog(null, list.populateGrocery());
    
    JPanel container = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
    container.add(panel);
    JScrollPane scrollPane = new JScrollPane(container);
    f.getContentPane().add(scrollPane);

    f.pack();
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    
    button1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
        
        Coupon list = new Coupon();
        JOptionPane.showMessageDialog(null,list.populateGrocery());
        //JOptionPane.showMessageDialog(parentComponent, list, title, 0);
    }

});
    button2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
        
        Coupon list = new Coupon();
        JOptionPane.showMessageDialog(null,list.populateClothing());
        //JOptionPane.showMessageDialog(parentComponent, list, title, 0);
    }

});
    button3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
        
        Coupon list = new Coupon();
        JOptionPane.showMessageDialog(null,list.populateTravel());
        //JOptionPane.showMessageDialog(parentComponent, list, title, 0);
    }

});
    button4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
        
        Coupon list = new Coupon();
        JOptionPane.showMessageDialog(null,list.populateTransport());
        //JOptionPane.showMessageDialog(parentComponent, list, title, 0);
    }

});
    button5.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
        
        Coupon list = new Coupon();
        JOptionPane.showMessageDialog(null,list.populateRec());
        //JOptionPane.showMessageDialog(parentComponent, list, title, 0);
    }

});
    button6.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
        
        Coupon list = new Coupon();
        JOptionPane.showMessageDialog(null,list.populateHouse());
        //JOptionPane.showMessageDialog(parentComponent, list, title, 0);
    }

});
    button7.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
        
        Coupon list = new Coupon();
        JOptionPane.showMessageDialog(null,list.populateOther());
        //JOptionPane.showMessageDialog(parentComponent, list, title, 0);
    }

});
    button8.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent event) {
        
        //this.dispose();
        panel.setVisible(false);
        f.dispose();//this.dispose();
        //applet.getAppletContext().showDocument(appletCloseURL);
        Accounts list = new Accounts();
        list.setVisible(true);
        
        
    }

});
    
  }
    
} 
