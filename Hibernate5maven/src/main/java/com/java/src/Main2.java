package com.java.src;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.model.Account;
import com.java.util.HibernateUtil;

public class Main2 {
	
	static Logger logger= Logger.getLogger(Main2.class);
	static SessionFactory sf=HibernateUtil.getSessionFactory();
	
	public static void main(String args[]) throws InterruptedException{
		  Configuration cfg= new Configuration();
		    cfg.configure("hibernate.cfg.xml");
		    Session s= sf.openSession(); 
		    s.beginTransaction();
		    //Pessimistic locking: acquire a lock before only on the row: read/ write: serial
		    //synchronized
		    Account a= s.get(Account.class, 1);
		    a.setAmount(a.getAmount() -500);
		    s.getTransaction().commit();
		    	s.close();
		    	sf.close();
	    }
/*	
	Dirty read: If one user is doing a change which has not been committed,
	other users should not be able to see that change*/
}
