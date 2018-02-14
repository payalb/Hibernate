package com.java.src;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
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
		cfg.setProperty("hibernate.cache.use_query_cache", "true");
		cfg.setProperty("hibernate.generate_statistics", "true");
		cfg.setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory");
		cfg.setProperty(Environment.SHOW_SQL, "true");
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties());
		sf = cfg.buildSessionFactory(serviceRegistryBuilder.build());
	}

	public static void main(String args[]) {

	//	Session s = sf.openSession();
		//Transaction t = s.beginTransaction();
	
		/*Student student = new Student();
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
		Student student1 = new Student();
		ArrayList<Float> marks1= new ArrayList<>();
		marks1.add(46.3f);
		marks1.add(87.5f);
		List<String> subjects1= new ArrayList<>();
		subjects1.add("maths");
		subjects1.add("history");
		student1.setLocation("Goa");
		student1.setId(2);
		student1.setMarks(marks);
		student1.setName("Rajesh");
		student1.setSubjects(subjects);
		s.save(student1);
		
	
		t.commit();
		
		Query q= s.createQuery("From Student where id<10");
		q.setCacheable(true);
		for(Object o: q.list()){
			Student st= (Student)o;
			System.out.println(st.getName());
		}

		Query q1=  s.createQuery("From Student where id<10");
		q1.setCacheable(true);
		for(Object o: q1.list()){
			Student st= (Student)o;
			System.out.println(st.getName());
		}
		s.close();*/
		
		
		Session s1= sf.openSession();
		Query q2=  s1.createSQLQuery("select * from address where address_id in (select distinct address_id"
				+ "from student)");
		//save saveOrUpdate
		//subquery : subquery  || joins (table per class: union || joins)  || indexes 
		//where : 
		//When u would go for jdbc over Hibernate: procedures in db: call these procedures
			
	//	q2.setCacheable(true);
	/*	for(Object o: q2.list()){
			Student st= (Student)o;
			System.out.println(st.getName());
		}
*/		// Detached
		s1.beginTransaction();
		int i= q2.executeUpdate();
		System.out.println(i);
		s1.getTransaction().commit();
		sf.close();
	}

}
