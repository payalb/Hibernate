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

import com.java.model.Address;
import com.java.model.Student;

public class Main {

	static SessionFactory sf = null;

	static {
		
		Configuration cfg = new Configuration().addPackage("com.java.model");
		cfg.addAnnotatedClass(Student.class).addAnnotatedClass(Address.class).addAnnotatedClass(Student.class);
		cfg.setProperty(Environment.HBM2DDL_AUTO, "create");
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
		
		Student student1 = new Student();
		student1.setName("Raj");
		student1.setId(1);
		s.save(student1);
		Student student2 = new Student();
		student2.setName("Rahul");
		student2.setId(2);
		s.save(student2);
		Student student3 = new Student();
		student3.setName("Shreya");
		student3.setId(3);
		s.save(student3);
		Address address1= new Address();
		address1.setCity("Lucknow");
		address1.setNumber(10);
		address1.setStreet("gdhgd kjshjdkh jkhjkh");
		s.save(address1);
		Address address2= new Address();
		address2.setCity("Pune");
		address2.setNumber(12);
		address2.setStreet("fjd dfhdjk djkhdhs");
		s.save(address2);
		Address address3= new Address();
		address3.setCity("Gujrat");
		address3.setNumber(15);
		address3.setStreet("jkh kjhkjh jhj");
		s.save(address3);
		List<Student> students1= new ArrayList<>();
		students1.add(student1);
		address1.setStudents(students1);
		List<Address> addresses1= new ArrayList<>();
		addresses1.add(address1);
		addresses1.add(address2);
		student1.setAddresses(addresses1);
		
		
		List<Address> addresses2= new ArrayList<>();
		addresses2.add(address2);
		addresses2.add(address3);
		student2.setAddresses(addresses2);
		List<Student> students2= new ArrayList<>();
		students2.add(student2);
		students2.add(student1);
		address2.setStudents(students2);
		
		t.commit();
		Criteria c= s.createCriteria(Student.class);
		Criterion cr= Restrictions.eq("id", 1);
		c.add(cr);
		Student studentObj1= (Student) c.uniqueResult();
		System.out.println(studentObj1);
		Criteria c1= s.createCriteria(Address.class);
		Criterion cr1= Restrictions.eq("number", 12l);
		c1.add(cr1);
		Address addressObj1= (Address) c1.uniqueResult();
		System.out.println(addressObj1);
		
		s.close();
		// Detached
	}finally{
		sf.close();
	}
}

}
