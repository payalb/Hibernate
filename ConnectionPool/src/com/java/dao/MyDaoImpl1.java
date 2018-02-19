package com.java.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.java.model.Student;

@Repository
public class MyDaoImpl1 implements MyDao {
	@Autowired
	private JdbcTemplate jt;

	public int save(Student st) {
		Object[] param = new Object[] { st.getId(), st.getName(), st.getLocation() };
		int i = jt.update("Insert into student values(?,?,?)", param);
		return i;
	}

	@Override
	public boolean update(Student st) {
		Object[] param = new Object[] { st.getName(), st.getId() };
		jt.update("update student set name = ? where id= ?", param);
		return true;
	}

	@Override
	public boolean delete(Student st) {
		Object o = st.getId();
		jt.update("delete student where id= ?", o);
		return true;
	}

	@Override
	public Student findByPK(int id) throws Exception {
		Object o[] = { id };
		Student st = jt.queryForObject("select * from Student where id = ? ", o, Student.class);
		return st;
	}

	@Override
	public List<Student> findAll() throws Exception {
		List<Student> list = jt.queryForList("select * from student", Student.class);
		return list;
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
}
