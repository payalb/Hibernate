/*package com.java.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.java.model.Student;
import com.java.model.Teacher;

@Configuration
public class MyConfiguration {
	
	@Bean(name="teacher")
	public Teacher getTeacher(){
		Teacher teacher= new Teacher();
		teacher.setId("RB");
		teacher.setName("Ravi");
		return teacher;
	}

	@Scope("singleton")
	@Bean(initMethod="init", destroyMethod="destroy", name="student")
	public Student getStudent(){
		Student student= new Student();
		student.setName("Raj");
		student.setRollNo(1);
		return student;
	}
}
*/