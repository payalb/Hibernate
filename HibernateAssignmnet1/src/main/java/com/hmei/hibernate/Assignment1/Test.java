package com.hmei.hibernate.Assignment1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.hmei.hibernate.pojo.Address;

public class Test {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Criteria cr = session.createCriteria(Address.class);
		List list = cr.addOrder(Order.asc("houseNo")).list();
		
		tx.commit();
		session.close();
		System.out.println(list);
		
//		cr.add(Restrictions.eq("city", "Saint Charles"));
//		List list = cr.list();
//		Address addr = (Address)cr.uniqueResult();
//		tx.commit();
//		session.close();
//		System.out.println(list);
//		System.out.println(addr);
		
		
	}
}
