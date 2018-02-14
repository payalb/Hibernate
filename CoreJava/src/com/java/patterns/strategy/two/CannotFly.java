package com.java.patterns.strategy.two;


public  class CannotFly implements Flyable {

	@Override
	public void fly() {
	System.out.println("Cannot Fly");

	}

}
