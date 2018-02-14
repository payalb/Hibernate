package com.java.dao;

import java.util.List;

import com.java.model.Student;

public interface MyDao {
	public int save(Student s) throws Exception;
	public boolean update(Student st) throws Exception;
	public boolean delete(Student st) throws Exception;
	public Student findByPK(int id) throws Exception;
	public List<Student> findByName(String name) throws Exception;
	public int findByAddress(String location) throws Exception;
	public List<Student> findAll() throws Exception;

}
