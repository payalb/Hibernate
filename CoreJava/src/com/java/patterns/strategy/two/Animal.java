package com.java.patterns.strategy.two;

 abstract class Animal {

	private String name;
	private String color;
	
	private Flyable canfly;
	public abstract void makeSound();
	public void hibernate(){
		System.out.println("sleeping");
	}
	
	public  void fly(){
		canfly.fly();
	}
	public  void setCanfly(Flyable canfly){
		this.canfly= canfly;
	}
}
