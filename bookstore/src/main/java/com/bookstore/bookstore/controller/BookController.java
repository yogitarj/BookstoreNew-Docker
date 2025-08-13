package com.bookstore.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.entity.MyBookList;
import com.bookstore.bookstore.service.BookService;
import com.bookstore.bookstore.service.MyBookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService booksev;
	
	@Autowired
	private MyBookService mybookserv;
	
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookregister()
	{
		return "book_register";
	}
	
	@GetMapping("/availiable_books")
	public ModelAndView getallbooks()
	{
		List<Book> list=booksev.getallbooks();
//		ModelAndView mv=ModelAndView();
//		mv.setViewName("bookList");
//		mv.addObject("book", mv);
		
		return new ModelAndView("bookList","book",list);
	}
	
	

	@PostMapping("/save")
	public String addbook(@ModelAttribute Book b1)
	{
		booksev.addbooks(b1);
		return "redirect:/availiable_books";
		 
	}
	
	@GetMapping("/myBooks")
	public String getmybooks()
	{
		return "myBooks";
		
	}
	
	@RequestMapping("/mylist/{id}")
	public String getmylist(@PathVariable int id)
	{
	    Book b=	booksev.getBookbyId(id);
	    MyBookList mb=new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
	    mybookserv.saveMyBooks(mb);
	    
		return "redirect:/myBooks";
	}
	
	
	
	
	

}
