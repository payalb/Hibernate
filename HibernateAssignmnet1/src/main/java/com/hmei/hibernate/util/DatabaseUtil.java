package com.hmei.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseUtil {
	static {
		sf = new Configuration().configure().buildSessionFactory();
	}
	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
}
