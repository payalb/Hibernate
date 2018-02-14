package com.java.src;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		Query q= session1.createQuery("From Student");
		q.setFirstResult(1);
		q.setMaxResults(10);
		List<Student> l= q.list();
		for(Student st:l){
			System.out.println(st.getId());
		}
	/*	t.commit();*/
		session1.close();
		sf.close();
		// Detached
	}

}
