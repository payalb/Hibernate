package com.java.patterns.strategy;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("barking");

	}
//In all subclasses have to override this method
	@Override
	public void canfly() {
		System.out.println("cannot fly");

	}

}
