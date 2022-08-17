package com.grapghql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grapghql.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
