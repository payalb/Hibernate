package com.java.patterns.strategy.two;

public class Bird extends Animal  {
	
	Bird(){
		setCanfly(new CanFly());
	}

	@Override
	public void makeSound() {
		System.out.println("Chirping");

	}




}
