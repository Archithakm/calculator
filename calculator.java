package calc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.layout.*;
import javafx.stage.Stage;


public class calc extends Application {
    @Override
    public void start(Stage primaryStage) {
           TextField t1=new TextField();
           TextField t2=new TextField();
           Button b1 = new Button("1");
           Button b2 = new Button("2");
           Button b3 = new Button("3");
           Button b4 = new Button("4");
           Button b5 = new Button("5");
           Button b6 = new Button("6");
           Button b7 = new Button("7");
           Button b8 = new Button("8");
           Button b9 = new Button("9");
           Button b10= new Button("0");
           Button b11= new Button(".");
           Button b12= new Button("+");
           Button b13= new Button("-");
           Button b14= new Button("*");
           Button b15= new Button("/");
           Button b16= new Button("=");
     
           b1.setOnAction((ActionEvent event) -> {
               t1.setText("1");
           });
           b2.setOnAction((ActionEvent event) -> {
               t1.setText("2");
           });
           b3.setOnAction((ActionEvent event) -> {
               t1.setText("3");
           });
           b4.setOnAction((ActionEvent event) -> {
               t1.setText("4");
           });
           b5.setOnAction((ActionEvent event) -> {
               t1.setText("5");
           });
           b6.setOnAction(new EventHandler<ActionEvent>() {
               @Override
               public void handle(ActionEvent event) {
                   t1.setText("6");
               }
           });
           b7.setOnAction((ActionEvent event) -> {
               t1.setText("7");
           });
           b8.setOnAction((ActionEvent event) -> {
               t1.setText("8");
           });
           b9.setOnAction((ActionEvent event) -> {
               t1.setText("9");
           });
           b10.setOnAction((ActionEvent event) -> {
               t1.setText("0");
           });
           b11.setOnAction((ActionEvent event) -> {
               t1.setText(".");
           });
           b12.setOnAction((ActionEvent event) -> {
               t1.setText("+");
           });
           b13.setOnAction((ActionEvent event) -> {
               t1.setText("-");
           });
           b14.setOnAction((ActionEvent event) -> {
               t1.setText("*");
           });
           b15.setOnAction((ActionEvent event) -> {
               t1.setText("/");
           });
           b16.setOnAction((ActionEvent event) -> {
               t1.setText("=");
           });
         GridPane grid=new GridPane();
        Scene scene = new Scene(grid, 300, 250);
        grid.add(b1,0,0);
        grid.add(b2,1,0);
        grid.add(b3,2,0);
        grid.add(b4,3,0);
        grid.add(b5,0,1);
        grid.add(b6,1,1);
        grid.add(b7,2,1);
        grid.add(b8,3,1);
        grid.add(b9,0,2);
        grid.add(b10,1,2);
        grid.add(b11,2,2);
        grid.add(b12,3,2);
        grid.add(b13,0,3);
        grid.add(b14,1,3);
        grid.add(b15,2,3);
        grid.add(b16,3,3);
        grid.add(t1,4,0);
        grid.add(t2,5,5);
       
        primaryStage.setTitle("calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
public static void main(String[] args) {
        launch(args);
    }
}