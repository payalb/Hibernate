package com.java.model;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher3 implements InitializingBean, DisposableBean{

	private String id;
	private String name;
	private List<Student3> students;
	
	Teacher3(){
		System.out.println("Teacher constructor called!");
	}
	
	public void init(){
		System.out.println("Teacher object init called!");
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public List<Student3> getStudents() {
		return students;
	}

	public void setStudents(List<Student3> students) {
		this.students = students;
	}

	public void printDetails() {
		System.out.println(this.id + " " + this.name);
		for(Student3 s: this.getStudents()){
			System.out.println(s);
		}
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy called for disposable bean for teacher");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After property set method called for teacher");
	}

}
