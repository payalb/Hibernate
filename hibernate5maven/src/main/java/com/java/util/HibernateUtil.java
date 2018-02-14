package com.java.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory factory;

	static {
		try {
		if (factory == null) {
			registry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources sources= new MetadataSources(registry);
			Metadata metadata= sources.getMetadataBuilder().build();
			factory= metadata.getSessionFactoryBuilder().applyInterceptor(new AccountInterceptor()).build();
		}
		}catch(Exception e) {
			if(registry != null) {
				StandardServiceRegistryBuilder.destroy(registry);
			}
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	
	
}
