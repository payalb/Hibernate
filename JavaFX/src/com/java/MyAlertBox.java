package com.java;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

 class AlertBox {

	public static void display(String title, String message){
		Stage window= new Stage();
		VBox layout= new VBox(20);
		Button b= new Button("OK");
		b.setOnAction(e-> window.close());
		layout.getChildren().add(b);
		Scene scene= new Scene(layout, 50,50);
		window.setScene(scene);
		window.initModality(Modality.APPLICATION_MODAL);
		window.showAndWait();
	}
}

public class MyAlertBox extends Application{
	
	public static void main(String args[]){
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		
		VBox layout= new VBox(20);
		Button b= new Button("Open alert!");
		b.setOnAction(e-> AlertBox.display("AlertBox", "Hello"));
		layout.getChildren().add(b);
		layout.setAlignment(Pos.CENTER);
		Scene scene= new Scene(layout, 300,300);
		window.setScene(scene);
		
		window.show();
	}
	
}