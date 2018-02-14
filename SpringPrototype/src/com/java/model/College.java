/*package com.java.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class College implements ApplicationContextAware{

	private String name;
	private Teacher teacher;
	private ApplicationContext applicationContext;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return applicationContext.getBean("teacher", Teacher.class);
	
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

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext= applicationContext;
		
	}

}
*/