package com.java.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.MyDao;
import com.java.model.Student;

@Service
public class StudentBOImpl implements StudentBO{

	@Autowired
	private MyDao dao;
	
	@Override
	public int createStudent(Student st){
		return dao.save(st);
	}

	@Override
	public int updateStudent(Student st)  {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(Student st) {
		// TODO Auto-generated method stub
		return 0;
	}

	public MyDao getDao() {
		return dao;
	}

	public void setDao(MyDao dao) {
		this.dao = dao;
	}

}
