package com.java.src;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.java.model.PhoneNumber;
import com.java.model.Student;

public class Main {

	static SessionFactory sf = null;

	static {
		
		Configuration cfg = new Configuration().addPackage("com.java.model");
		cfg.addAnnotatedClass(Student.class).addAnnotatedClass(PhoneNumber.class);
		/*cfg.setProperty(Environment.HBM2DDL_AUTO, "create");*/
		cfg.setProperty(Environment.DIALECT,
				"org.hibernate.dialect.PostgreSQLDialect");
		cfg.setProperty("hibernate.connection.url",
				"jdbc:postgresql://localhost/postgres");
		cfg.setProperty("hibernate.connection.username", "postgres");
		cfg.setProperty("hibernate.connection.password", "postgres");
		cfg.setProperty("hibernate.connection.driver_class",
				"org.postgresql.Driver");
		cfg.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
		cfg.setProperty(Environment.SHOW_SQL, "true");
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties());
		sf = cfg.buildSessionFactory(serviceRegistryBuilder.build());
		
	}

	public static void main(String args[]) {
try{
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		//Student student= new Student();
		
			Criteria cr=  s.createCriteria(Student.class);
			cr.add(Restrictions.idEq(1));
			Student st= (Student) cr.uniqueResult();
			System.out.println(st.getName());
			for( PhoneNumber number:st.getPhoneNumbers()){
				System.out.println(number);
			}
		/*PhoneNumber s1= new PhoneNumber(0121, 536446353l);
		PhoneNumber s2= new PhoneNumber(0124, 6767676767l);
		List<PhoneNumber> numbers= new ArrayList<>();
		numbers.add(s1);
		numbers.add(s2);
		student.setPhoneNumbers(numbers);
		s1.setStudent(student);
		s2.setStudent(student);
		student.setLocation("Lucknow");
		student.setName("Raj");
		student.setId(1);
		s.save(s1);
		s.save(s2);
		s.save(student);
		Student student1 = new Student();
		PhoneNumber s3= new PhoneNumber(347, 435746574l);
		s.save(s3);
		List<PhoneNumber> numbers1= new ArrayList<>();
		numbers1.add(s3);
		s3.setStudent(student1);
		student1.setPhoneNumbers(numbers1);
		student1.setLocation("Lucknow");
		student1.setName("Rahul");
		student1.setId(2);
		s.save(student1);
		t.commit();*/
	/*	Criteria c= s.createCriteria(Student.class);
		Criterion cr= Restrictions.eq("id", 1);
		c.add(cr);
		Student student2= (Student) c.uniqueResult();
		System.out.println(student2);
		
		Criteria c1= s.createCriteria(PhoneNumber.class);
		Criterion cr1= Restrictions.eq("code", 81);
		c1.add(cr1);
		PhoneNumber pn= (PhoneNumber) c1.uniqueResult();
		System.out.println(pn);*/
		s.close();
		// Detached
	}finally{
		sf.close();
	}
}

}
