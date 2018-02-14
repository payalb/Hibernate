package com.java.patterns.strategy.one;

import com.java.patterns.strategy.Animal;

public abstract class CanFly extends Animal {

	@Override
	public void canfly() {
	System.out.println("Flying");

	}

	@Override
	public abstract void makeSound() ;

}
