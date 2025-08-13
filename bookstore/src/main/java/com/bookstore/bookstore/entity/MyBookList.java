package com.bookstore.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyBooks")
public class MyBookList {
	@Id
    private int id;
	
	
	private String author;
	
	
	private String name;
	
	
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public MyBookList(int id, String author, String name, int price) {
		super();
		this.id = id;
		this.author = author;
		this.name = name;
		this.price = price;
	}

	public MyBookList() {
		super();
		
	}
	

}
