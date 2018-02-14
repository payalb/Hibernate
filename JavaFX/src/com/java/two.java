package com.java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class two extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	Button b;
	@Override
	public void start(Stage stage) throws Exception {
		StackPane pane= new StackPane();
		 b=new Button("Click Me");
	/*	b.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Button clicked!");
				
			}
		
		});*/
		b.setOnAction(event -> System.out.println("Button clicked!"));
		pane.getChildren().add(b);
		Scene scene= new Scene(pane,200,200);
		stage.setScene(scene);
		stage.show();
	}

	

}
