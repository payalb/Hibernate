package com.hmei.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hmei.hibernate.pojo.Student;
import com.hmei.hibernate.util.DatabaseUtil;

public class StudentDao {
	public static int insertStudent(Student stu) {
		SessionFactory sf = DatabaseUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(stu);
		tx.commit();
		
		session.close();
		return id.intValue();
	}
	
	public static List<Student> getAllStudents() {
		SessionFactory sf = DatabaseUtil.getSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Student s join fetch s.address a").setCacheable(true);
		List<Student> list = query.list();
		/*session.enableFetchProfile("student-address");
		Criteria cr = session.createCriteria(Student.class);
		cr.setCacheable(true);
		List<Student> list = cr.list();
		System.out.println(list);
		Criteria cr1 = session.createCriteria(Student.class);
		cr1.setCacheable(true);
		List<Student> list1 = cr1.list();
		System.out.println(list1);*/
		session.close();
		return list;
		
	}
	
	public static Student getStudent(int id){
		SessionFactory sf = DatabaseUtil.getSessionFactory();
		Session session = sf.openSession();
		Student stu = session.get(Student.class, id);
		session.close();
		return stu;	
	}
	
	public static List<Student> getStudentsMarkGreaterThan(int mark) {
		 SessionFactory sf = DatabaseUtil.getSessionFactory();
		 Session session  = sf.openSession();
		 //Don't use "select *"
		 String sql = "from Student where mark > :mark";
		 Query query = session.createQuery(sql);
		 query.setParameter("mark", mark);
		 query.setCacheable(true);
		 return query.getResultList();
	}
// Locking technique	
//	public int updateStudentWithMark(int low, int high, int mark) {
//		SessionFactory sf = DatabaseUtil.getSessionFactory();
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		String sql = "update Student set mark = mark + :mark where mark > :low and mark < :high";
//		Query query = session.createQuery(sql);
//		query.setParameter("mark", mark);
//		query.setParameter("low", low);
//		query.setParameter("high", high);
//		int rows = query.executeUpdate();
//		tx.commit();
//		session.close();
//		return rows;
//	}
}
