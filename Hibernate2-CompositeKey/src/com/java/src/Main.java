package com.java.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.java.model.Key;
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
try{
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Student student = new Student();
		student.setMarks(82);
		student.setKey(new Key("Raj", "Pune"));
		s.save(student);
		t.commit();
	
		s.close();
		// Detached
	}finally{
		sf.close();
	}
}

}
