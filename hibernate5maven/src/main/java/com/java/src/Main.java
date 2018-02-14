package com.java.src;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Account;
import com.java.util.HibernateUtil;

public class Main {
	
	static Logger logger= Logger.getLogger(Main.class);
	static SessionFactory sf=HibernateUtil.getSessionFactory();
	
	public static void main(String args[]) throws InterruptedException{
	    Configuration cfg= new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    Session s= sf.openSession(); 
	    s.beginTransaction();
	    Account ac= s.get(Account.class, 1);// 400
	    ac.setAmount(3000);
	    s.flush(); 
	    ac.setAmount(2000);
	    s.clear(); 
	    ac.setAmount(1000);
	    s.getTransaction().commit();
	    s.close();
	    sf.close();	
	    }
}
