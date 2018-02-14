package com.java.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Student;

public class Main {

	public static void main(String args[]) {

		// Transient
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Object o= s.load(Student.class, 3);
		Student st= (Student) o;
		System.out.println(st.getId());
		System.out.println(st.getLocation());
		System.out.println(st.getMarks());
		System.out.println(st.getRank());
		System.out.println(st.getName());
		// Persistent
		 s.beginTransaction().commit();
		// Permanent storage
	
	
		// Detached
		sf.close();
	}

}
