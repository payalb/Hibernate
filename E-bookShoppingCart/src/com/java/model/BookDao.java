package com.java.model;

import java.util.List;

public interface BookDao {

	public abstract List<Book> getBookByAuthor(String author_name);

	public abstract List<Book> getBookByTitle(String title);

}