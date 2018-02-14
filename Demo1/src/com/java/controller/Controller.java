package com.java.controller;

import com.java.model.Model;
import com.java.view.LoginActionEvent;
import com.java.view.LoginListener;
import com.java.view.View;

public class Controller implements LoginListener{
	
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model= model;
		this.view= view;
	}	

	@Override
	public void actionPerformed(LoginActionEvent e) {
		System.out.println("Setting model object!!"+ e);
		model.setUsername(e.getName());
		model.setPassword(e.getPassword());
		model.commitToDB();
		view.dispose();
	}
}
