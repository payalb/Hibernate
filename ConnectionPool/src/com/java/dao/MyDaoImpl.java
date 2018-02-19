package com.java.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.model.Student;

@Repository
public class MyDaoImpl implements MyDao{
	@Autowired
	private DataSource ds;
	
	public int save(Student s) throws Exception {
		Connection con= ds.getConnection();
		System.out.println(con);
		Statement stmt= con.createStatement();
		con.close();
		return 0;
	}

	@Override
	public boolean update(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findByPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findByAddress(String location) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
