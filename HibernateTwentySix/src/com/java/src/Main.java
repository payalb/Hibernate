package com.java.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Student;
import com.java.model.Teacher;

public class Main {
	
	public static void main(String args[]){
		Teacher teacher= new Teacher();
		teacher.setId(1);
		teacher.setName("Kapoor");
		teacher.setLocation("Pune");
		
		Student st= new Student();
		st.setId(1);
		st.setName("Payal");
		st.setLocation("Delhi");
		st.setTeacher(teacher);
		Student st1= new Student();
		st1.setId(2);
		st1.setName("Parul");
		st1.setLocation("Goa");
		st1.setTeacher(teacher);
		//Transient
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		s.save(st);
		s.save(st1);
		//s.save(st);
		//Persistent
		s.beginTransaction().commit();
		//Permanent storage
		s.evict(teacher);
		s.evict(st);
		s.close();
		sf.close();
		//Detached
	}

}
