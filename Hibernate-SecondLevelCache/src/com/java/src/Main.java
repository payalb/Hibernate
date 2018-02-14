package com.java.src;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

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
		cfg.setProperty("hibernate.cache.use_second_level_cache", "true");
		cfg.setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory");
		cfg.setProperty(Environment.SHOW_SQL, "true");
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties());
		sf = cfg.buildSessionFactory(serviceRegistryBuilder.build());
	}

	public static void main(String args[]) {

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		/*ScienceStudent st = new ScienceStudent();
		// st.setId(1);
		st.setLocation("Delhi");
		ArrayList<Float> marks= new ArrayList<>();
		marks.add(43.2f);
		marks.add(94.5f);
		List<String> subjects= new ArrayList<>();
		subjects.add("maths");
		subjects.add("history");
		st.setSubjects(subjects);
		st.setMarks(marks);
		st.setName("Parul");
		st.setPracticalMarks(35.3);
	//	st.setRank(10);
		s.save(st);

		ArtStudent at = new ArtStudent();
		// at.setId(2);
		at.setLocation("Pune");
		at.setSubjects(subjects);
		at.setMarks(marks);
		at.setName("Ronak");
		at.setHomeScienceMarks(49.3);
		//at.setRank(4);
		s.save(at);*/
		Student student = new Student();
		ArrayList<Float> marks= new ArrayList<>();
		marks.add(43.2f);
		marks.add(94.5f);
		List<String> subjects= new ArrayList<>();
		subjects.add("maths");
		subjects.add("history");
		student.setLocation("Pune");
		student.setId(1);
		student.setMarks(marks);
		student.setName("Ravi");
		student.setSubjects(subjects);
		s.save(student);
		t.commit();
		

		s.close();
		Session s1= sf.openSession();
		Object o2=s1.get(Student.class, 1);
		Student st2= (Student) o2;
		System.out.println(st2.getName());
		// Detached
		sf.close();
	}

}
