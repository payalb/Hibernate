package com.java.view;

public class LoginActionEvent {

	public LoginActionEvent(String name, String password) {
		this.name = name;
		this.password = password;
	}

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString(){
		return this.getName() + " " + this.getPassword();
	}
}
