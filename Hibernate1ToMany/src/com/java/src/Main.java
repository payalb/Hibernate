package com.java.src;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Student;
import com.java.model.Teacher;

public class Main {
	
	public static void main(String args[]){
		Teacher ac= new Teacher();
		ac.setId(1);
		ac.setName("Kapoor");
		ac.setLocation("Pune");
		List<Student> list= new ArrayList<Student>();
		Student st= new Student();
		st.setId(1);
		st.setName("Payal");
		st.setLocation("Delhi");
		list.add(st);
		Student st1= new Student();
		st1.setId(2);
		st1.setName("Parul");
		st1.setLocation("Goa");
		list.add(st1);
		ac.setStudents(list);
		//Transient
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(ac);
		//s.save(st);
		//Persistent
		s.beginTransaction().commit();
		//Permanent storage
		s.evict(ac);
		s.evict(st);
		//Detached
	}

}
