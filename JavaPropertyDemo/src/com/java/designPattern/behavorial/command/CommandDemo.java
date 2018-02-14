package com.java.designPattern.behavorial.command;

public class CommandDemo {

	public static void main(String[] args) {
			Appliance appliance= new Fan();
			Switch switch1= new Switch(appliance);
			switch1.on();

	}

}
