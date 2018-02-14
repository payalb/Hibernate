package com.java.beans;

import javax.ejb.Local;

@Local
public interface MyStatelessBeanLocal {
	
	public String sayHello(String name);
	
//	public List<Animal> getAnimals();

	public void saveAnimals();

}
