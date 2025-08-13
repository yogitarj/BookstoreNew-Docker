package com.bookstore.bookstore.service;

import java.util.List;


import com.bookstore.bookstore.entity.Book;

public interface BookService {
	
	public void addbooks(Book b1);
	
	
	public List<Book> getallbooks();
	
	
	public Book getBookbyId(int id);

}
