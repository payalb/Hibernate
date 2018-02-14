package com.java.patterns.strategy;

public abstract class Animal {

	private String name;
	private String color;
	public abstract void makeSound();
	public abstract void canfly();
	public void hibernate(){
		System.out.println("sleeping");
	}
}
