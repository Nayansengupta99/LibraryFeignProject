package com.cognizant.model;



import lombok.Data;

@Data
public class BookModel {

	private long bookid;
	private String title;
	private String author;
	private int edition;
	private String publication;
}
