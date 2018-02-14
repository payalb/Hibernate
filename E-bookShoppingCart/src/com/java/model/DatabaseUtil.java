package com.java.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseUtil {

	private static final SessionFactory sessionFactory;

	// @TODO create session factory and getSession should successfully return
	// the session.
	static {
		try {
			sessionFactory = new Configuration().configure("hibernate2.cfg.xml").buildSessionFactory();
			
		} catch(Throwable ex) {
			System.err.println("Initial SessionFactoryCreation failed" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static Session openSession() {
		return sessionFactory.openSession();
	}

	

}
