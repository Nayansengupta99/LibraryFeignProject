package com.cognizant.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cognizant.model.BookModel;

@FeignClient(name="book-service")
public interface BookFeignClient  {


	@GetMapping("/api/books")
	public List<BookModel> getAllBookDetails();

}
