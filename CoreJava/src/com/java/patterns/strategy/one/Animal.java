package com.java.patterns.strategy.one;

 abstract class Animal {

	private String name;
	private String color;
	public abstract void makeSound();
	public void hibernate(){
		System.out.println("sleeping");
	}
}
