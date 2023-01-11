package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

/**
 * @author sudha
 *
 */
public interface BookService {

	public void Save(Book book);
	
	public List<Book> findAllBook();
	
}
