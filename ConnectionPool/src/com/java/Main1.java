package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.dao.MyDao;
import com.java.model.Student;

public class Main1 {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-bean.xml");
		MyDao dao= context.getBean(MyDao.class);
		Student s= new Student();
		s.setId(1);
		s.setName("Payal");
		s.setLocation("10r");
		dao.save(s);
		}
		

	}


