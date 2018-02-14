package com.java.src;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.java.model.Gender;
import com.java.model.Student;

public class Main {

	static SessionFactory sf = null;

	static {
		Configuration cfg = new Configuration().addPackage("com.java.model");
		cfg.addAnnotatedClass(Student.class);
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

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		ArrayList<Float> marks= new ArrayList<>();
		marks.add(43.2f);
		marks.add(94.5f);
		List<String> subjects= new ArrayList<>();
		subjects.add("maths");
		subjects.add("history");
		
		Student.Address address= new Student.Address();
		address.setHno("10R");
		address.setCity("Meerut");
		address.setPincode(3637338);
		address.setStreet("dhsjdh kdshfjksd");
		s.save(address);
		Student student = new Student();
		student.setLocation("Pune");
		student.setMarks(marks);
		student.setName("Ravi");
		student.setGender(Gender.MALE);
		student.setSubjects(subjects);
		student.setAddress(address);
		s.save(student);
		t.commit();
		s.close();
		// Detached
		sf.close();
	}

}
