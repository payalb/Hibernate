package com.java.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Session Bean implementation class MyTester
 */
@Singleton
@Startup
public class MyTester {

	@EJB
  private MyStatelessOneBean myBean;

    public MyTester() {
    }

    @PostConstruct 
    /*
     * Called when application deployed to the server.
     */
    public void init(){
    
    	
    Animal animal=myBean.saveAnimal();
    	myBean.editAnimal(animal);
    }

	
}
