package com.java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

 
public class Layouts extends Application{
	
	public static void main(String args[]){
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		
		BorderPane layout= new BorderPane();
		Button b= new Button("Open alert!");
		b.setOnAction(e-> AlertBox1.display("AlertBox", "Hello"));
		HBox hbox= new HBox();
		hbox.getChildren().add(new Label("Enter Name"));
		hbox.getChildren().add(new TextField());
		
		VBox vbox= new VBox();
		vbox.getChildren().add(new Hyperlink("Contact Us"));
		vbox.getChildren().add(new Hyperlink("Home"));
		
		HBox hbox1= new HBox();
		hbox1.getChildren().add(new Button("File"));
		hbox1.getChildren().add(new Button("Open"));
		
		layout.setTop(hbox1);
		layout.setLeft(vbox);
		layout.setCenter(hbox);
		
		Scene scene= new Scene(layout, 300,300);
		window.setScene(scene);
		window.show();
	}
	
}