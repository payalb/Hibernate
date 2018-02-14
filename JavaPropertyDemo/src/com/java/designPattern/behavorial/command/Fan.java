package com.java.designPattern.behavorial.command;

public class Fan implements Appliance{
	
	public void rotate(){
		
	}
	
	public void stop(){
		
	}

	@Override
	public void turnOn() {
		rotate();
		
	}

	@Override
	public void turnOff() {
		stop();
	}

}
