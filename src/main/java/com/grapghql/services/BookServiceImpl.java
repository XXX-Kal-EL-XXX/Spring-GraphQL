package com.grapghql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grapghql.entity.Book;
import com.grapghql.repository.BookRepo;

@Service
public class BookServiceImpl implements BookServices {
	
	@Autowired
	private BookRepo bookRepo;

	@Override
	public Book create(Book book) {
		
	 return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
	 return bookRepo.findAll();
	}

	@Override
	public Book get(int bookId) {
		 return bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found on server"));
	}

}
