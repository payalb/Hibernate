package com.java.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.java.core.config.MyConfiguration;
import com.java.core.dao.Person;

public class DependencyInjection {

	public static void main(String[] args) {
		AbstractApplicationContext factory= new AnnotationConfigApplicationContext(MyConfiguration.class);
		Person person1= factory.getBean("person", Person.class);
		Person person2= factory.getBean("person", Person.class);
		System.out.println("Are instances singleton by default:"+ (person1== person2));
		factory.close();
	}
}
