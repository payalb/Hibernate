package com.java.patterns.strategy.two;


interface Flyable{
	public  void fly();
}
public  class CanFly implements Flyable{

	@Override
	public  void fly() {
	System.out.println("Flying");

	}


}
