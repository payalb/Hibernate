package com.java.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.model.Account;

public class Main {

	public static void main(String args[]) {

		// Transient
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		/*Student st = new Student();
		
		st.setId(0);
		st.setLocation("Amritsar");
		st.setMarks(54.3f);
		st.setName("Rahul");
		st.setRank(2);
		
		s.save(st);*/
		Transaction t=s.beginTransaction();
		Account a= new Account();
		a.setAmount(24343);
		a.setType("checking");
		a.setId(0);
		s.save(a);
		// Persistent
		t.commit();
		// Permanent storage
		s.close();
		// Detached
		sf.close();
	}

}
