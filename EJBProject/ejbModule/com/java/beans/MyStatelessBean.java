package com.java.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class MyStatelessBean implements MyStatelessBeanLocal {

	
    public MyStatelessBean() {
       System.out.println("Constructor of stateless bean invoked!!");
    }

 
    @Override
    public String sayHello(String name){
    	return "Hi "+ name;
    }

/*	@Override
	public List<Animal> getAnimals() {
		List<Animal> list= em.createQuery("FROM ANIMAL").getResultList();
		return list;
	}*/
	
	@Override
	public void saveAnimals() {
		Animal animal= new Animal();
		animal.setName("Moti");
		animal.setType("Dog");
		
	}
	
	@PostConstruct
	public void init(){
		System.out.println("PostConstruct of stateless bean!!");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Deleting stateless bean!!");
	}
}
