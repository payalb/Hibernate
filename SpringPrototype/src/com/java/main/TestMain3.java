package com.java.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.model.Teacher3;

public class TestMain3 {

	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-bean4.xml");
		Teacher3 teacher = context.getBean("teacher", Teacher3.class);
		// Teacher1 teacher = context.getBean("teacher", Teacher1.class);
		System.out.println("Object retrieved");
		teacher.printDetails();
		context.registerShutdownHook();
	}

}