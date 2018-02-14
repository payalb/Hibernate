package com.java.model;

import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class BookDaoImpl implements BookDao {
	
	{
		Session session= DatabaseUtil.openSession();
		
		//Sample data to save books in db.
		
		Book book1= new Book("The Shining","Stephen King", 234, 22);
		Book book2= new Book("The Stand","Stephen King", 4434, 33);
		Book book3= new Book("Misery","Stephen King", 2444, 55);
		Book book4= new Book("The Casual Vacancy","J.K.Rowling", 434, 32);
		Book book5= new Book("Harry Potter Series","J.K.Rowling", 544, 45);
		Book book6= new Book("Hamlet","William Shakespeare", 2443, 32);
		Book book7= new Book("Macbeth","William Shakespeare", 544, 43);
		Book book8= new Book("Othello","William Shakespeare", 267, 55);
		Book book9= new Book("Roughing it","Mark Twain", 255, 44);
		session.save(book9);
		session.save(book8);
		session.save(book7);
		session.save(book6);
		session.save(book5);
		session.save(book4);
		session.save(book3);
		session.save(book2);
		session.save(book1);
		session.beginTransaction().commit();
		session.close();
	}


	//@TODO provide body to be able to retrieve record based on author name
	@Override
	public List<Book> getBookByAuthor(String author_name){
		/*Configuration cfg = new Configuration();
		cfg.configure("hibernate2.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s = sf.openSession();*/
		Session session= DatabaseUtil.openSession();
		String hql = "FROM Book E WHERE E.author = author_name";
		Query query = session.createQuery(hql);
		List results = query.list();
	//	s.close();
		return results;
		
	}
	
	//@TODO provide body to be able to retrieve record based on title
	@Override
	public List<Book> getBookByTitle(String title){
		/*Configuration cfg = new Configuration();
		cfg.configure("hibernate2.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s = sf.openSession();*/
		Session session= DatabaseUtil.openSession();
		String hql = "FROM Book E WHERE E.title = title";
		Query query = session.createQuery(hql);
		List result1 = query.list();
		//s.close();
		return result1;
		
	}

}
