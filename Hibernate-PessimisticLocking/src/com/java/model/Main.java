package com.java.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class Main {

	static SessionFactory sf = null;

	static {
		
		Configuration cfg = new Configuration().addPackage("com.java.model");
		cfg.addAnnotatedClass(Student2.class).addAnnotatedClass(Address.class);
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
		/*Transaction t = s.beginTransaction();
		Address address1= new Address("Delhi",'A');
		Address address2= new Address("Chicago",'B');
		List<Address> addressList= new ArrayList<>();
		addressList.add(address1);
		addressList.add(address2);
		Student2 student= new Student2(1, "payal",addressList);
		student.setId(1);
		student.setName("Payal");
		
		s.save(address1);
		s.save(address2);
		s.save(student);
		t.commit();*/
		Student2 s2=	s.get(Student2.class,1);
		System.out.println(s2.getId());
		s.close();
		s=sf.openSession();
		s.beginTransaction();
		
		Student2 s1=(Student2) s.load(Student2.class, 1);
		System.out.println("Student loaded!");
		s1.setName("Payal Gupta4");
		s.getTransaction().commit();
		s.close();
		// Detached
	}finally{
		sf.close();
	}
}

}
