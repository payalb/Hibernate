package com.java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class SwitchingScene extends Application {

	public static void main(String[] args) {
		launch(args);
	}
Stage stage;
	@Override
	public void start(Stage window) throws Exception {
		VBox layout1= new VBox(20);
		Button b1=  new Button("Goto Scene2");
		Button b2=  new Button("Goto Scene1");
		StackPane layout2= new StackPane();
		layout2.getChildren().add(b2);
		Scene scene2= new Scene(layout2,200,200);
		Scene scene1= new Scene(layout1,300,400);
		b1.setOnAction(e-> window.setScene(scene2));
		b2.setOnAction(e-> window.setScene(scene1));
		layout1.getChildren().addAll(new Label("Scene1"),b1);
		window.setScene(scene1);
		window.setTitle("My Window");
		window.show();
		
	}

}
