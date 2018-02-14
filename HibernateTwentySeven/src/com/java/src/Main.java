package com.java.src;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Student;
import com.java.model.Teacher;

public class Main {
	static SessionFactory sf;
	static Session s;
	
	public static void main(String args[]){
		
		Teacher teacher= new Teacher();
		teacher.setTid(1);
		teacher.setName("Kapoor");
		teacher.setLocation("Pune");
		Teacher teacher1= new Teacher();
		teacher1.setTid(2);
		teacher1.setName("Tehan");
		teacher1.setLocation("Nagpur");
		Set<Teacher> teacherSet= new HashSet<Teacher>();
		Set<Teacher> teacherSet1= new HashSet<Teacher>();
		teacherSet.add(teacher);
		teacherSet.add(teacher1);
		teacherSet1.add(teacher);
		Student st= new Student();
		st.setSid(1);
		st.setName("Payal");
		st.setLocation("Delhi");
		st.setTeachers(teacherSet);
		Student st1= new Student();
		st1.setSid(2);
		st1.setName("Parul");
		st1.setLocation("Goa");
		st1.setTeachers(teacherSet1);
	
		try{
		
		//Transient
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		 sf= cfg.buildSessionFactory();
		 s=sf.openSession();
		
		s.save(st);
		s.save(st1);
	
		s.beginTransaction().commit();
		
		}catch(Exception e){
			e.printStackTrace();
		s.close();
		sf.close();
		
		}
	}

}
