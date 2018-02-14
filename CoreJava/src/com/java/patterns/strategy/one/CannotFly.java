package com.java.patterns.strategy.one;

import com.java.patterns.strategy.Animal;

public abstract class CannotFly extends Animal {

	@Override
	public void canfly() {
	System.out.println("Cannot Fly");

	}
//should not have other methods not associated to it.
	@Override
	public abstract void makeSound() ;

}
