/*
 * @author heliaaghababazadeh
 * Date: 9/27/2018
 * Program Description:This program will open a new window and display the 
 * information in the form of a pie chart 
 */
package piechartapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PieChartApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //variable declaration and initialization
        //array to store the titles
        String[] titles = {"Project--10%", "Quiz--10%", "Midterm--30%", "Final--40%", "Homework--10%"};
        //array to store the precentages
        double[] percentage = {0.10, 0.10, 0.30, 0.40, 0.10};
        
        //creating the pieChart object calling the constructor if PieChart
        PieChart pieChart = new PieChart(titles, percentage);
        //calling methof createChart() to create the chart
        pieChart.createChart();
       
        StackPane root = new StackPane();
        //adding the chart to the pane
        root.getChildren().add(pieChart.getChart());
       
        
        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("Pie Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
