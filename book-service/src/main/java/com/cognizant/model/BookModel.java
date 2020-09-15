package com.cognizant.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Entity
@Data
@Table(name="books")
public class BookModel {

	@Id
	private long bookid;
	private String title;
	private String author;
	private int edition;
	private String publication;
}
