package com.java.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Account;
import com.java.model.Student;

public class Main {
	
	public static void main(String args[]){
		Account ac= new Account();
		ac.setId(5);
		ac.setType("savings");
		ac.setAmount(5545.43);
		Student st= new Student();
		st.setId(2);
		st.setName("Shweta");
		st.setLocation("Pune");
		st.setMarks(77.6f);
		//Transient
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(ac);
		s.save(st);
		//Persistent
		s.beginTransaction().commit();
		//Permanent storage
		s.evict(ac);
		s.evict(st);
		//Detached
		s.close();
		sf.close();
	}

}
