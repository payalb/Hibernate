/*package com.java.stateless;


import java.rmi.RemoteException;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transaction;

*//**
 * Session Bean implementation class MyTester
 *//*
@Singleton
@Startup
public class MyTester {

	@EJB(lookup="java:global/EJBDemo2EAR/EJBDemo2/CalculatorImpl!com.java.stateless.Calculator")
  private Calculator myBean;

    public MyTester() {
    }

    @PostConstruct 
    
     * Called when application deployed to the server.
     
    public void init() {
    
    	
   try {
	System.out.println(myBean.add(2,3));
} catch (RemoteException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    }

	
}
*/