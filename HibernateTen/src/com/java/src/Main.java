package com.java.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Account;
import com.java.model.Student;

public class Main {

	public static void main(String args[]) {
		Account ac = new Account();
		ac.setId(3);
		ac.setType("savings");
		ac.setAmount(3434333.32);
		Student st = new Student();
		st.setId(3);
		st.setName("Anuj");
		st.setLocation("Pune");
		st.setMarks(99.8f);
		st.setRank(1);
		// Transient
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		s.update(ac);
		s.update(st);

		// Persistent
		 s.beginTransaction().commit();
		// Permanent storage
		s.evict(ac);
		s.evict(st);
		// st.setMarks(99);
		// Detached
		sf.close();
	}

}
