package com.java;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.business.StudentBO;
import com.java.model.Student;

public class Main2 {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-bean1.xml");
		StudentBO studentBO= context.getBean(StudentBO.class);
		Student s= new Student();
		s.setId(1);
		s.setName("Payal");
		s.setLocation("10r");
		int i=studentBO.createStudent(s);
		System.out.println(i);
		context.close();
		}
		

	}


