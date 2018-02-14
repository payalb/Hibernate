/*package com.java.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.java.model.Student;

@Repository
public class MyDaoImpl1 implements MyDao{
	@Autowired
	private JdbcTemplate jt;

	
	public int save(Student st) throws Exception {
		
		
		Object[] param= new Object[]{st.getId(), st.getName(),
				st.getLocation()};
		int i= jt.update("Insert into student values(?,?,?)", param);
	
	
		return i;
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
*/