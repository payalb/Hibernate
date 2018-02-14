package com.java.patterns.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	private float price;
	private List<Topping> toppings= new ArrayList<>();
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public List<Topping> getToppings() {
		return toppings;
	}
	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
		for(Topping topping: toppings){
			this.price= price+ topping.getPrice();
		}
	}
	public void addTopping(Topping topping){
		this.toppings.add(topping);
		this.price= price+ topping.getPrice();
	}
}

class CheeseCapsicumPizza extends Pizza{
	CheeseCapsicumPizza(){
		this.setPrice(295);
	}
}

class TomatoChilliPizza extends Pizza{
	TomatoChilliPizza(){
		this.setPrice(185);
	}
}