package com.java.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class College {

	private String name;
	@Autowired
	private Teacher teacher;
	@Autowired
	private ApplicationContext context;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return context.getBean("teacher", Teacher.class);
	
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	private College() {
		System.out.println("In a constructor");
	}

	public void printDetails() {
		System.out.println(this.getName());
	}

/*	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext= applicationContext;
		
	}*/

}
