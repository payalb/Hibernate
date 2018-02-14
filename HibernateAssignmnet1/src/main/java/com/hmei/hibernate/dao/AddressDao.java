package com.hmei.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hmei.hibernate.pojo.Address;
import com.hmei.hibernate.util.DatabaseUtil;

public class AddressDao {
	public static int saveAddress(Address addr) {
		SessionFactory sf = DatabaseUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(addr);
		tx.commit();
		session.close();
		return id.intValue();
	}
}
