package com.java.business;

import com.java.dao.StudentDao;
import com.java.model.Student;


public class StudentBOImpl implements StudentBO{

	private StudentDao dao;
	
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

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

}
