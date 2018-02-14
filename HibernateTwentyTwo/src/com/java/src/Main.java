package com.java.src;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Account;
import com.java.model.Student;

public class Main {

	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session1 = sf.openSession();
		Query q1= session1.createQuery("select name from Student");
		q1.setCacheable(true);
		String st1 = (String) q1.uniqueResult();
		System.out.println(st1);
	
		Query q2= session1.createQuery("select name from Student");
		q2.setCacheable(true);
		String st2 = (String) q1.uniqueResult();
		System.out.println(st2);

		session1.close();
		sf.close();
		// Detached
	}

}
