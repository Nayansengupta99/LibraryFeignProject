package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.feignclient.BookFeignClient;
import com.cognizant.model.BookModel;

@RestController
@RequestMapping("library")

public class LibraryController {

@Autowired
BookFeignClient bookFiegn;

@GetMapping("/books")
public List<BookModel> getLibraryBookDetails(){
	return bookFiegn.getAllBookDetails();
}


}
