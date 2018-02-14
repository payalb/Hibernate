package com.java.patterns.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Pizza pizza= new TomatoChilliPizza();
		pizza.addTopping(new CheeseTopping());
		pizza.addTopping(new OliveTopping());
		System.out.println(pizza.getPrice());
	}

}
