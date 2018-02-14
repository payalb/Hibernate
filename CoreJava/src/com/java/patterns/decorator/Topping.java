package com.java.patterns.decorator;

public abstract class Topping {
	private float price;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}

class CheeseTopping extends Topping{
	
	{
		this.setPrice( 54);
	}
	
}

class OliveTopping extends Topping{
	
	{
		this.setPrice( 68);
	}
	
}