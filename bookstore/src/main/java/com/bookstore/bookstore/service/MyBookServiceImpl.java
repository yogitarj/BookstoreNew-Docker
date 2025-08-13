package com.bookstore.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.entity.MyBookList;
import com.bookstore.bookstore.repository.MyBookRepository;

@Service
public class MyBookServiceImpl implements MyBookService {
	
	@Autowired
	private MyBookRepository myrep;
	
	public void saveMyBooks(MyBookList mybooks)
	{
		myrep.save(mybooks);
	}

	
	

}
