package com.java.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Account;
import com.java.model.Student;

public class Main {

	public static void main(String args[]) {
		/*
		 * Account ac= new Account(); ac.setId(5); ac.setType("checking");
		 * ac.setAmount(12344.43); Student st= new Student(); st.setId(5);
		 * st.setName("Payal"); st.setLocation("Delhi");
		 */
		// Transient
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session1 = sf.openSession();
		/*
		 * s.save(ac); s.save(st);
		 */
		Student st1 = (Student) session1.get(Student.class, 5);
		System.out.println(st1);
		// Persistent
		session1.beginTransaction().commit();

		session1.evict(st1);
		session1.close();
		Session session2 = sf.openSession();
	
		Student st2 = (Student) session2.get(Student.class, 5);
		System.out.println(st2);

		session2.beginTransaction().commit();

		session2.evict(st2);
		session2.close();
		sf.close();
		// Detached
	}

}
