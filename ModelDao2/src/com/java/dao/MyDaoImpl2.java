package com.java.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.java.model.Student;

@Repository
public class MyDaoImpl2 implements MyDao {
	@Autowired
	private HibernateTemplate ht;

	public int save(Student st) {
		System.out.println("Is write mode disbaled"+ht.isCheckWriteOperations());
		int i = (Integer) ht.save(st);
		return i;
	}

	@Override
	public boolean update(Student st) {
		ht.update(st);
		return true;
	}

	@Override
	public boolean delete(Student st) {
		ht.delete(st);
		return true;
	}

	@Override
	public Student findByPK(int id) {
		Student st = (Student) ht.get(Student.class, id);
		return st;
	}

	@Override
	public List<Student> findByName(String name) {

		return null;
	}

	@Override
	public int findByAddress(String location) {

		return 0;
	}

	@Override
	public List<Student> findAll() {

		List<Student> st = (List<Student>) ht.find("from Student");
		/*
		 * DetachedCriteria dc= DetachedCriteria.forClass(Student.class);
		 * dc.setProjection(); dc.addRestriction(); List<Student> st=
		 * (List<Student>) ht.findByCriteria(dc);
		 */
		return st;

		/* return null; */
	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
