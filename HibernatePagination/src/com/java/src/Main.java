package com.java.src;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Student;

public class Main {

	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session1 = sf.openSession();
		/*Transaction t=session1.beginTransaction();*/
		/*for(int i=10; i<100;i++){
		Student st1= new Student();
		st1.setId(i);
		session1.save(st1);
		}*/
		
		Criteria c1= session1.createCriteria(Student.class);
		
		c1.setFirstResult(1);
		c1.setMaxResults(10);
		List<Student> l= c1.list();
		for(Student st:l){
			System.out.println(st.getId());
		}
	/*	t.commit();*/
		session1.close();
		sf.close();
		// Detached
	}

}
