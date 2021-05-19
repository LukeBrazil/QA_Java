package com.qa.classes;

public class Book {
	//Attributes
	public String title;
	public String author;
	public String genre;
	public int pageCount;
	public boolean isOpen;
	
	// Constructors
	public Book(String title, String author, String genre, int pageCount) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
		
	}
	
	public void open() {
		this.isOpen = true;
	}
	
	public void close() {
		this.isOpen = false;
	}
	
	public void describe() {
		System.out.println("Book: " + "\"" + this.title + "\"");
		System.out.println("Author: " + this.author);
		System.out.println("Page Count: " + this.pageCount);
		System.out.println("Opened?: " + this.isOpen);
	}
	
}
