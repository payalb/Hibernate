package com.java.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.java.dao.MyDao;
import com.java.model.Student;

@Primary
@Service
public class StudentBOImpl implements StudentBO{
	@Autowired
	private MyDao dao;
	
	@Override
	public int createStudent(Student st) throws Exception {
		return dao.save(st);
	}

	@Override
	public int updateStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
