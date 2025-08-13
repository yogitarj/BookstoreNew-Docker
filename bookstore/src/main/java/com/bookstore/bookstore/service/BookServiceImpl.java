package com.bookstore.bookstore.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    

	@Autowired
	private BookRepository brep;

    

	@Override
	public void addbooks(Book b1) {
		
		 brep.save(b1);
	}

	@Override
	public List<Book> getallbooks() {
		
		return brep.findAll();
	}

	@Override
	public Book getBookbyId(int id) {
		
		return brep.findById(id).get();
	}

	

	


}
