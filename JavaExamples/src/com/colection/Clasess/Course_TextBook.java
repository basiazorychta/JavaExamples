package com.colection.Clasess;

public class Course_TextBook {
	
	private String title;
	private String author;
	private String publisher;
	
	Course_TextBook ( String textTitle, String auth, String publ){
		
		title = textTitle;
		author = auth;
		publisher = publ;
	}
	
	
	public Course_TextBook ( Course_TextBook object2) {
		
		title = object2.title;
		author = object2.author;
		publisher = object2.publisher;
		
	}
	
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String toString () {
		
		String str = "\nTitle : " + title + "\nAuthor : " + author 
					+ "\nPublisher : " + publisher;
		
		return str;
	}

}
