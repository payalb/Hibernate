package com.java.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.java.dao.MyDao;
import com.java.model.Student;


@Service
public class StudentBOImpl implements StudentBO {

	@Autowired
	private MyDao dao;

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false, timeout=2000, rollbackFor=Exception.class)
	@Override
	public int createStudent(Student st) {
		dao.save(st);
		return 1;
	}

	@Override
	public int updateStudent(Student st) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(Student st) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Transactional(isolation= Isolation.READ_COMMITTED, readOnly=true, timeout=2000)
	@Override
	public Student getStudent(int id) {
		return dao.findByPK(id);
	}

}
