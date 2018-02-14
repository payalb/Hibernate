package com.java.src;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.model.ArtStudent;
import com.java.model.ScienceStudent;
import com.java.model.Student;

public class Main {

	public static void main(String args[]) {

		// Transient
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t=s.beginTransaction();
		ScienceStudent st= new ScienceStudent();
		//st.setId(1);
		st.setLocation("Delhi");
		st.setMarks(44);
		st.setName("Parul");
		st.setPracticalMarks(35.3);
		st.setRank(10);
		s.save(st);
		
		ArtStudent at= new ArtStudent();
		//at.setId(2);
		at.setLocation("Pune");
		at.setMarks(84);
		at.setName("Ronak");
		at.setHomeScienceMarks(49.3);
		at.setRank(4);
		s.save(at);
		Student student= new Student();
		//at.setId(2);
		student.setLocation("Pune");
		student.setMarks(84);
		student.setName("Ronak");
	//	at.setHomeScienceMarks(49.3);
		student.setRank(4);
		
		s.save(student);
		t.commit();
		Criteria ct= s.createCriteria(Student.class);
		for(Object st1: ct.list()){
			Student student1= (Student)st1;
			System.out.println(student1.getName());
		};
		
		s.close();
		// Detached
		sf.close();
	}

}
