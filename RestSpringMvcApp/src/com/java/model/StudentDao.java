package com.java.model;

import java.util.List;

import com.java.dao.Student;

public interface StudentDao {

	public abstract List<Student> getStudents();

	public abstract Student getStudent(int id);

	public abstract int insertStudent(Student obj);
	
	public abstract boolean updateStudent(Student s);
	
	public abstract boolean deleteStudent(int id);
	
	public abstract Student getStudentByName(String name);

}