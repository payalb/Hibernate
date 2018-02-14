package com.java.designPattern.behavorial.command;

public class Switch {
	
	Switch(Appliance appliance){
		this.appliance= appliance;
	}
		
	Appliance appliance;
	public void on(){
		appliance.turnOn();
	}
	
	public void off(){
		appliance.turnOff();
	}
}
