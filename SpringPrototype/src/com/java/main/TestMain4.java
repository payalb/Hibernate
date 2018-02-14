package com.java.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.model.Teacher;

public class TestMain4 {

	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-bean5.xml");
		Teacher teacher = context.getBean("teacher", Teacher.class);
		// Teacher1 teacher = context.getBean("teacher", Teacher1.class);
		System.out.println("Object retrieved");
		teacher.printDetails();
		context.registerShutdownHook();
	}

}