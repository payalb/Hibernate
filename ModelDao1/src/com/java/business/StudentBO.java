package com.java.business;

import com.java.model.Student;

public interface StudentBO {
	
	public int createStudent(Student st);
	public int updateStudent(Student st);
	public int deleteStudent(Student st);
}
