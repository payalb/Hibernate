package com.java.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class DatabaseUtil {

	private static SessionFactory sf = null;

	static {

		Configuration cfg = new Configuration().addPackage("com.java.model");
		cfg.addAnnotatedClass(Book.class).addAnnotatedClass(Order.class);
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

	public static Session getSession() {
		return sf.openSession();
	}

}
