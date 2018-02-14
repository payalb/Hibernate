package com.java.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class BookDaoImpl implements BookDao {
	
	DatabaseUtil util= new DatabaseUtil();
	
	/*{
		Session session= util.getSession();
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
	}*/
	
	/* (non-Javadoc)
	 * @see com.java.model.BookDao#getBookByAuthor(java.lang.String)
	 */
	@Override
	public List<Book> getBookByAuthor(String author_name){
		Session session= util.getSession();
		Criteria criteria= session.createCriteria(Book.class);
		Criterion criterion= Restrictions.like("author", author_name);
		criteria.add(criterion);
		List<Book> list=criteria.list();
		session.close();
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.java.model.BookDao#getBookByTitle(java.lang.String)
	 */
	@Override
	public List<Book> getBookByTitle(String title){
		Session session= util.getSession();
		Criteria criteria= session.createCriteria(Book.class);
		Criterion criterion= Restrictions.like("title", title);
		criteria.add(criterion);
		List<Book> list=criteria.list();
		session.close();
		return list;
	}

}
