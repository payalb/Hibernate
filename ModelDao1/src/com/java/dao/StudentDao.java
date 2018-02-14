package com.java.dao;

import java.util.List;

import com.java.model.Student;

public interface StudentDao {
	public int save(Student s) ;
	public boolean update(Student st);
	public boolean delete(Student st) ;
	public Student findByPK(int id) ;
	public List<Student> findByName(String name);
	public int findByAddress(String location) ;
	public List<Student> findAll();

}
