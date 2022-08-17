package com.grapghql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.grapghql.entity.Book;
import com.grapghql.services.BookServices;
import lombok.Getter;
import lombok.Setter;

@Controller
public class BookController {
	
	@Autowired
	private BookServices bookServices;
	
	@MutationMapping("createBook")
	public Book create(@Argument BookInput book) {
		Book b = new Book();
		b.setTitle(book.getTitle());
		b.setDescription(book.getDescription());
		b.setPrice(book.getPrice());
		b.setAuthor(book.getAuthor());
		b.setPages(book.getPages());
		return this.bookServices.create(b);
	}
	
	@QueryMapping("allBooks")
	public List<Book> getAll() {
		return this.bookServices.getAllBook();
	}

	@QueryMapping("getBook")
	public Book getByBookId(@Argument int bookId) {
		return this.bookServices.get(bookId);
	}
	
}

@Getter
@Setter
class BookInput {
private String title;
	
	private String description;
	
	private String author;
	
	private double price;
	
	private int pages;
	
	
}
