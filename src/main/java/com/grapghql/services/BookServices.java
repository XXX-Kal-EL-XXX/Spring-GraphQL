package com.grapghql.services;

import java.util.List;

import com.grapghql.entity.Book;

public interface BookServices {
	
	Book create(Book book);
	
	List<Book> getAllBook();
	
	Book get(int bookId);

}
