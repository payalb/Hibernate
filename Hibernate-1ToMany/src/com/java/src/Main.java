package com.java.src;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.java.model.PhoneNumber;
import com.java.model.Student;

public class Main {

	static SessionFactory sf = null;

	static {
		
		Configuration cfg = new Configuration().addPackage("com.java.model");
		cfg.addAnnotatedClass(Student.class).addAnnotatedClass(PhoneNumber.class);
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
		
		Student student= new Student();
		student.setLocation("Lucknow");
		student.setName("Raj");
		student.setId(1);
		
		Student student1= new Student();
		student1.setLocation("Lucknow");
		student1.setName("Raju");
		student1.setId(2);
		
		PhoneNumber number1= new PhoneNumber(0121, 536446353l);
		PhoneNumber number2= new PhoneNumber(0124, 6767676767l);
		PhoneNumber number3= new PhoneNumber(3433, 343432432);
		List<PhoneNumber> numbers= new ArrayList<>();
		numbers.add(number1);
		numbers.add(number2);
		student.setPhoneNumbers(numbers);
		List<PhoneNumber> numbers1= new ArrayList<>();
		numbers1.add(number3);
		student1.setPhoneNumbers(numbers1);
		s.persist(student);
		s.persist(student1);
		s.getTransaction().commit();
		s.clear();
		Query query= s.createSQLQuery("select * from student").setResultTransformer();
		List<Student> studentList= query.list(); //1 select :
		for(Student stud: studentList) {
			System.out.println(stud); // n times select * from phno where stud.id =1
		}
		s.close();
		}finally{
		sf.close();
	}
}

}
