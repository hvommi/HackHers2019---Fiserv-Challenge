/*
 * @author heliaaghababazadeh
 * Date: 9/27/2018
 * Class Description:This Class has 4 private variables. has only one 
 * constructor and three public methods: setAngle(), getChart() and creatChart()
 * 
 */

package piechartapp;

import javafx.scene.Group;

import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;


public class PieChart {
    
    //variable to keep track of the ending position of the previous arc portion
    //of the pie chart (ie. circle)
    private double previous = 0;
    //array to store the percentages
    private final double percentage[];
    //array to store the titles
    private final String titles[];
    //using group to display the arcs
    private final Group group = new Group();
    
    //constructor
    PieChart(String[] titles, double[] percentage){
        this.percentage = percentage;
        setAngle();
        this.titles = titles;
    }
    
    //setter method to convert percentages to degrees
    private void setAngle(){
    
        for (int i = 0; i < percentage.length; i++){
            //multiplies each element by 360 degrees (full circle)
            percentage[i] *= 360;
        }
    }
    
    //method to create the chart
    public void createChart(){
        
        for (int i = 0; i < percentage.length; i++){
            //creates the arc 
            Arc arc = new Arc(300, 300, 200, 200, previous, percentage[i]);
            
            //x and y variables for the titles 
            double xValue =300, yValue =300;
            
            //if statements to determine where to add the titles on each arc
            if (previous + percentage[i] < 90){
                xValue += 70;
                yValue -= 70;
            }
            else if (previous + percentage[i] < 180){
                xValue -= 30;
                yValue -= 100;
               
            }
            else if (previous + percentage[i] < 270){
            
                xValue -= 150;
            }
            else {
                xValue += 70;
                yValue += 70;
            }
            
            
            //adding the arc and text to the group
            group.getChildren().addAll(arc, new Text(xValue, yValue ,titles[i]));
            //setting properties of the arc
            arc.setStroke(Color.BLACK);
            arc.setType(ArcType.ROUND); 
            arc.setFill(Color.color(Math.random(),Math.random(),Math.random()));
            //adding the angle of the arc to previous 
            previous += percentage[i];
        }   
    }
    
    //getter method, returns the croup containing the chart
    public Group getChart(){
      return group;  
    }
}






