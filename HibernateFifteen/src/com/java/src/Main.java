package com.java.src;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String args[]) {

		// Transient (id, name, location, marks, rank)
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t=s.beginTransaction();
		Query q= s.createQuery("insert into Student1 (id, name, location, marks, rank) "
				+ " select s.id, s.name, s.location, s.marks, s.rank from Student s");
		int i= q.executeUpdate();
		/*Student st = new Student();
		
		st.setId(0);
		st.setLocation("Amritsar");
		st.setMarks(54.3f);
		st.setName("Rahul");
		st.setRank(2);
		
		s.save(st);*/
		
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
