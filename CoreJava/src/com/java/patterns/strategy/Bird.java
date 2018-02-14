package com.java.patterns.strategy;

public class Bird extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Chirping");

	}

	@Override
	public void canfly() {
		System.out.println("flying");
	}

}
