package com.java.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.java.dao.MyDao;
import com.java.model.Student;

@Service
public class StudentBOImpl implements StudentBO{

	@Autowired
	private MyDao dao;
	
	/*@Autowired
	TransactionTemplate transactionTemplate;*/
	@Override
	public int createStudent(Student st){
		//transactionTemplate.setPropagationBehavior(0);
		//transactionTemplate.execute( status-> {
					dao.save(st);
			//		return 1;
		//});
		return 1;
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
