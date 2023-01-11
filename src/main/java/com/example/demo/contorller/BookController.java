package com.example.demo.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
	private BookService bookService;
    
    @PostMapping("/insert")
    
    public void createBook(@RequestBody Book book)
    {
    	bookService.Save(book);
    }
    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/details")
    
    public List<Book> getBookDetails()
    {
    	return bookService.findAllBook();
    }
}
