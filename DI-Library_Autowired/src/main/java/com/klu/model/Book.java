package com.klu.model;
import org.springframework.stereotype.Component;
@Component
public class Book {
	private String isbn;
	private String title;
	private String author;
	private double price;
	
	public Book() {
		this.isbn="ISBN-101";
		this.title="fsad";
		this.author="Rod johnson";
		this.price=550.0;
	}
 public String getlsbn() {
	 return isbn;
 }
 public String getTitle() {
	 return title;
 }
 public String getAuthour() {
	 return author;
	 
 }
 @Override
 public String toString() {
	 return "Book[isbn="+isbn+",title="+title+",author="+author+",price="+price+"]";
 }
}
