package com.java.model;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.java.dao.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	HibernateTemplate template;

	@Override
	public List<Student> getStudents() {
		List<Student> list= (List<Student>) template.find("from Student");
		return list;
	}

	@Override
	public Student getStudent(int id) {
		Student st= (Student) template.get(Student.class, id);
		return st;
	}

	@Override
	public int insertStudent(Student student) {
		return  (int) template.save(student);

	}

	@Override
	public boolean updateStudent(Student student) {
		try{
		template.update(student);
		return true;}
		catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean deleteStudent(int id) {
		try{
			Student student= template.load(Student.class, id);
			template.delete(student);
		return true;
		}catch(Exception e){
		return false;
		}
	}

	@Override
	public Student getStudentByName(String name) {
		DetachedCriteria cr=DetachedCriteria.forClass(Student.class);
		cr.add(Restrictions.like("name", name));
		List<Student> list=(List<Student>) template.findByCriteria(cr);
		if(list != null)
		return (Student) template.findByCriteria(cr).get(0);
		return null;
	}

}
