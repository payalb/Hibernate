package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class one extends Application implements EventHandler<ActionEvent>{

	public static void main(String[] args) throws InterruptedException {
		//launch(args);
	String s1="This is a string";
	String s2=" a ";
	String s3= "This is" + " a "+ "string";
	System.out.println(s1== s3);
	}
	Button b;
	@Override
	public void start(Stage stage) throws Exception {
		StackPane pane= new StackPane();
		 b=new Button("Click Me");
		b.setOnAction(this);
		pane.getChildren().add(b);
		Scene scene= new Scene(pane,200,200);
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()==b){
			System.out.println("Button 1 clicked!");
		}
		
	}

}
