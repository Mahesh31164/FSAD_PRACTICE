package com.klu.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Library {
	private int libraryid;
	private String libraryName;
	private  Book book;
	
	public Library() {
		this.libraryid=1;
		this.libraryName="Central Library";
		
	}
	@Autowired
	public void setBook(Book book) {
		this.book=book;
	}
	  public void displayDetails() {
	        System.out.println("Library ID   : " + libraryid);
	        System.out.println("Library Name : " + libraryName);
	        System.out.println("Book Details : " + book);
	    }

}
