package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.BookModel;

public interface BookRepository extends JpaRepository<BookModel,Integer>{}
