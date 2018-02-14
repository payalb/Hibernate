package com.java.patterns.strategy.two;

public class Dog extends Animal {

	Dog(){
		this.setCanfly(new CannotFly());
	}
	@Override
	public void makeSound() {
		System.out.println("barking");

	}
	

	
}
