package com.java.main;

import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.model.College;

public class TestMain {

	public static void main(String args[]) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-bean.xml");
		College college = context.getBean("college", College.class);
		/*
		 * College.getTeacher should return each time a new teacher object..
		 */
		System.out.println(college.getTeacher());
		System.out.println(college.getTeacher());
	}

}