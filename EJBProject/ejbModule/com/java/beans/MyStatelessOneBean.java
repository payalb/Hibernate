package com.java.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Session Bean implementation class MyStatelessOneBean
 */
@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
/*
 * Default is CMT only.
 */
public class MyStatelessOneBean {
/*
 * By default, it is a container managed transaction, will be auto committed or rolledback as method starts and ends.
 */
	/*@PersistenceContext(unitName="hibernateMapping")
	private	EntityManager em;*/

  public Animal saveAnimal(){
		Animal animal= new Animal();
		animal.setName("Lucy");
		animal.setType("Cat");
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("hibernateMapping");
		EntityManager em=factory.createEntityManager();
		System.out.println(em);
		System.out.println(animal);
		em.persist(animal);
		System.out.println(animal.getName());
		return animal;
  }

  
public void editAnimal(Animal animal) {
	animal.setName("Bhoori");
	System.out.println(animal.getType());
}

}
