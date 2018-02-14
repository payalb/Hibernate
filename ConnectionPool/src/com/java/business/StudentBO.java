package com.java.business;

import com.java.model.Student;

public interface StudentBO {
	
	public int createStudent(Student st) throws Exception;
	public int updateStudent(Student st) throws Exception;
	public int deleteStudent(Student st) throws Exception;
}
