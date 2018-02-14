package com.java.beans;

import javax.ejb.Remote;


@Remote
public interface MyStatefulBeanLocal {

	public String sayHello(String name);

	public void saveAnimal();

}
