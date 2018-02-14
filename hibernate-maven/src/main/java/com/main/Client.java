package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Site;

public class Client {

	public static void main(String[] args) {
		Site object= new Site("MH1","Maharashtra");
		Configuration config= new Configuration();
		config.configure("hibernate-config.xml");
		Transaction tx= null;
		try(
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();){
		tx= session.beginTransaction();
		session.save(object);
		tx.commit();}
		
	}

}
