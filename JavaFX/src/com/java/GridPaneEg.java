package com.java;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

 
public class GridPaneEg extends Application{
	
	public static void main(String args[]){
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		
		GridPane layout= new GridPane();
	
		layout.setPadding(new Insets(20,20,20,20));
		layout.setVgap(8);
		layout.setHgap(10);
		Label nameLabel = new Label("Enter Name");
		layout.setConstraints(nameLabel, 0, 0);
		TextField nameField = new TextField("Payal");
		layout.setConstraints(nameField, 1, 0);
		Label passwordLabel = new Label("Enter Password");
		layout.setConstraints(passwordLabel, 0, 1);
		PasswordField passwordField = new PasswordField();
		passwordField.setPromptText("Atleast 8 digits");
		layout.setConstraints(passwordField, 1, 1);
		Button loginButton= new Button("Submit Form");
		layout.setConstraints(loginButton, 1, 2);
		layout.getChildren().addAll(nameLabel, nameField, passwordLabel, passwordField, loginButton);
		Scene scene= new Scene(layout, 300,300);
		window.setScene(scene);
		window.show();
	}
	
}