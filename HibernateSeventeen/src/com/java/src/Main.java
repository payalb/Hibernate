package com.java.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.model.ArtStudent;
import com.java.model.ScienceStudent;

public class Main {

	public static void main(String args[]) {

		// Transient
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t=s.beginTransaction();
		ScienceStudent st= new ScienceStudent();
		st.setId(1);
		st.setLocation("Delhi");
		st.setMarks(44);
		st.setName("Parul");
		st.setPracticalMarks(35.3);
		st.setRank(10);
		s.save(st);
		
		ArtStudent at= new ArtStudent();
		at.setId(2);
		at.setLocation("Pune");
		at.setMarks(84);
		at.setName("Ronak");
		at.setHomeScienceMarks(49.3);
		at.setRank(4);
		s.save(at);
		t.commit();
		s.close();
		// Detached
		sf.close();
	}

}
