package com.java.src;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.java.model.Address;
import com.java.model.Student;

public class Main {

	static SessionFactory sf = null;

	static {
		
		Configuration cfg = new Configuration().addPackage("com.java.model");
		cfg.addAnnotatedClass(Student.class).addAnnotatedClass(Address.class);
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
		cfg.setProperty(Environment.GENERATE_STATISTICS, "true");
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties());
		sf = cfg.buildSessionFactory(serviceRegistryBuilder.build());
		
	}

	public static void main(String args[]) {
try{
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
	/*	Student student = new Student();
		Address s1= new Address("Art", 'A');
		student.setAddress(s1);
		student.setName("Raj");
		student.setId(1);
		//s.save(s1);
		s.save(student);*/
		//Student student1 = new Student();
		/*Address s2= new Address("maths", 'M');
		Address s1= new Address("Art", 'A');
		//student1.setAddress(s2);
		//student1.setName("Rahul");
		//student1.setId(2);
		//s.save(s2);
		s.save(s2);
		s.save(s1);
		t.commit();*/
		/*Criteria c= s.createCriteria(Address.class);
		Criterion cr= Restrictions.eq("code", 'M');
		c.add(cr);
		Address stud=(Address) c.uniqueResult();
		System.out.println(stud);
		
		Criteria c1= s.createCriteria(Student.class);
		Criterion cr1= Restrictions.eq("id", 1);
		c1.add(cr1);
		Student stud1=(Student) c1.uniqueResult();
		System.out.println(stud1);*/
		s.close();
		s=sf.openSession();
		//Address obj=(Address) s.load(Address.class, 'A');
		Student student2 = (Student) s.load(Student.class, 3);
		s.delete(student2);
		s.beginTransaction().commit();
		// Detached
	}finally{
		sf.close();
	}
}

}
