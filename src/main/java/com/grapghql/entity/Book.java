package com.grapghql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Book_Id")
	private int id;
	
	@Column(name = "Book_Title")
	private String title;
	
	@Column(name = "Book_Desc")
	private String description;
	
	@Column(name = "Book_Author")
	private String author;
	
	@Column(name = "Book_Price")
	private double price;
	
	@Column(name = "Book_Pages")
	private int pages;
	

}
