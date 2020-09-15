package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.BookModel;
import com.cognizant.repository.BookRepository;

@RestController
@RequestMapping("api")
public class BookController {

	@Autowired
	BookRepository bookRepo;

	@GetMapping("/books")
	public List<BookModel> getAllBookDetails() {
		return bookRepo.findAll();
	}

}
