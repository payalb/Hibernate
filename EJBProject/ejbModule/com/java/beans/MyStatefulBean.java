package com.java.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class MyStatefulBean
 */
@Stateful
public class MyStatefulBean implements MyStatefulBeanLocal{
	@PersistenceContext(unitName="hibernateMapping")
	private EntityManager em;
	
	@Override
	public void saveAnimal() {		
			Animal animal= new Animal();
			animal.setName("Moti");
			animal.setType("Dog");
			/*EntityManagerFactory factory= Persistence.createEntityManagerFactory("hibernateMapping");
			EntityManager em=factory.createEntityManager();
			System.out.println(em);
			*/EntityTransaction tx= em.getTransaction();
			tx.begin();
			System.out.println(animal);
			em.persist(animal);
			tx.commit();
			em.close();
			
	}
    public MyStatefulBean() {
    	System.out.println("Stateful Bean constructor invoked!!");
    }

    @PostConstruct
    public void init(){
    	System.out.println("In postconstruct for stateful bean!!");
    }
    
    @PreDestroy
    public void destroy(){
    	System.out.println("In destroy for stateful bean!!");
    }
    
    @PostActivate
    public void activate(){
    	System.out.println("In post activate for stateful bean!!");
    }
    
    @PrePassivate
    public void passivate(){
    	System.out.println("In pre passivate for stateful bean!!");
    }
    @Remove
    /*
     * Remove tells that after invocation of this method, bean can be destroyed.
     */
    @Override
    public String sayHello(String name){
    	return "Hi "+ name;
    }

	
			
				
	
	
	
}
