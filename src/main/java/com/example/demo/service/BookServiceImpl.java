package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
/**
 * @author sudha
 *
 */
@Service
public class BookServiceImpl implements BookService {
    
	@Autowired
	BookRepository bookRepository;
	@Override
	public void Save(Book book) {
		bookRepository.save(book);

	}
	@Override
	public List<Book> findAllBook() {
		 return bookRepository.findAll();
		
	}

}
