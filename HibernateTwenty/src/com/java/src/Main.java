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
		ac.setType("checking");
		ac.setAmount(12344.43);
		Student st= new Student();
		st.setId(5);
		st.setName("Payal");
		st.setLocation("Delhi");
		//Transient
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		/*s.save(ac);
		s.save(st);*/
		Student st1= (Student) s.get(Student.class, 5);
		System.out.println(st1);
		s.close();
		s= sf.openSession();
		Student st2= (Student) s.get(Student.class, 5);
		System.out.println(st2);
		//Persistent
		s.beginTransaction().commit();
		/*//Permanent storage
		s.evict(ac);
		s.evict(st);*/
		//Detached
		s.close();
	}

}
