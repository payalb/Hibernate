package com.java.src;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.model.Student;
import com.java.model.Student1;

public class Main {

	public static void main(String args[]) {

		// Transient (id, name, location, marks, rank)
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t=s.beginTransaction();
		Student1 st = new Student1();		
		st.setId(0);
		st.setLocation("Amritsar");
		st.setMarks(54.3f);
		st.setName("Rahul");
		st.setRank(2);
		
		s.save(st);
		
		Query q2= s.createQuery("From S1");
		
	//	Student st1= (Student) q2.uniqueResult();
		for(Object obj: q2.list()){
			Student1 st1= (Student1)obj;
		System.out.println(st1.getName());
		}
		Query q= s.createQuery("insert into S1 (id, name, location, marks, rank) "
				+ " select s.id, s.name, s.location, s.marks, s.rank from Student s");
		int i= q.executeUpdate();
		
		System.out.println(i);
	/*	
		Query q3= s.createQuery("insert into Student1 (id, name, location, marks, rank) "
				+ " values (10, 'Shreya', 'dgfhd', 32,2)");
		 i= q3.executeUpdate();*/
		
		Query q3= s.createQuery("update S1 set name= 'payal' where id=2");
				
		 i= q3.executeUpdate();
		Query q1=s.createQuery("delete from S1 where id=1");
		i= q1.executeUpdate();
		
		System.out.println(i);
		
		/*Criteria*/
	/*	Account a= new Account();
		a.setAmount(24343);
		a.setType("checking");
		a.setId(0);
		s.save(a);
		// Persistent
		*/
		// Permanent storage
		t.commit();
		s.close();
		// Detached
		sf.close();
	}

}
