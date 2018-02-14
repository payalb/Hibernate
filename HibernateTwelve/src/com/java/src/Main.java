package com.java.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Student;

public class Main {

	public static void main(String args[]) {

		// Transient
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Student student1= new Student();
		student1.setId(1);
		student1.setLocation("dfdsf");
		student1.setMarks(23);
		student1.setName("ffd");
		s.save(student1);
		Object o= s.get(Student.class, 1);
		Student st= (Student) o;
		System.out.println(st.getId());
		System.out.println(st.getLocation());
		System.out.println(st.getMarks());
		System.out.println(st.getRank());
		System.out.println(st.getName());
		// Persistent
		// s.beginTransaction().commit();
		// Permanent storage
			/*Object o1= s.get(Student.class, 2);
			Student st1= (Student) o1;*/
		// Detached
		sf.close();
	}

}
