package com.java.src;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.model.Account;

public class Main {
	
	public static void main(String args[]){
		//Transient state: Account object has nothing to do with the db
		Account ac= new Account();
	//	ac.setId(1);
		ac.setType("checking");
		ac.setAmount(12344.43);
		List<String> accountHolder = new ArrayList<>();
		accountHolder.add("Gosling, James");
		accountHolder.add("Bajaj & Sons");
		ac.setAccountHolder(accountHolder);
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		//Attached my java object with my session object: Persistent state
		//Hibernate will keep tracking the changes i do to this object
		//And as i do commit , it will take up the latest changes and save it in the db
		s.save(ac);
	
		ac.setAmount(57333);
		
		t.commit();
		
		s.close();
		//Now my object will move from persistent state to detached state
		ac.setAmount(6000);
		sf.close();
	}

}
