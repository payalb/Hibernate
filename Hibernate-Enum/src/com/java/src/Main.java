package com.java.src;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.java.model.ArtStudent;
import com.java.model.Gender;
import com.java.model.ScienceStudent;
import com.java.model.Student;

public class Main {

	static SessionFactory sf = null;

	static {
		Configuration cfg = new Configuration().addPackage("com.java.model");
		cfg.addAnnotatedClass(Student.class)
				.addAnnotatedClass(ScienceStudent.class)
				.addAnnotatedClass(ArtStudent.class);
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
		ScienceStudent st = new ScienceStudent();
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
		st.setGender(Gender.FEMALE);
	//	st.setRank(10);
		s.save(st);

		ArtStudent at = new ArtStudent();
		// at.setId(2);
		at.setLocation("Pune");
		at.setSubjects(subjects);
		at.setMarks(marks);
		at.setName("Ronak");
		at.setHomeScienceMarks(49.3);
		at.setGender(Gender.MALE);
		//at.setRank(4);
		s.save(at);
		Student student = new Student();
		// at.setId(2);
		student.setLocation("Pune");
		student.setMarks(marks);
		student.setName("Ravi");
		student.setGender(Gender.MALE);
		// at.setHomeScienceMarks(49.3);
	//	student.setRank(5);
		student.setSubjects(subjects);
		s.save(student);
		t.commit();
		/*Criteria ct = s.createCriteria(Student.class);
		Criterion criterion1 = Restrictions.eq("id", 1);
		Criterion criterion2 = Restrictions.isNotNull("location");
		Criterion c = Restrictions.and(criterion1, criterion2);

		ct.add(c);
		for (Object st1 : ct.list()) {
			Student student1 = (Student) st1;
			System.out.println(student1.getName());
		}
		;*/

		s.close();
		// Detached
		sf.close();
	}

}
