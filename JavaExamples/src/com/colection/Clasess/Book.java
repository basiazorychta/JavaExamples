package com.colection.Clasess;

public class Book {
	private String name;
	private String author;
	private int numbersPages;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumbersPages() {
		return numbersPages;
	}
	public void setNumbersPages(int numbersPages) {
		this.numbersPages = numbersPages;
	}
	
	public String info () {
		String intro = "My favourite book : " + "\""+ name + "\""+ " of my favourite writer : " 
				+ author + ", has : " + numbersPages + " of pages.";
		return intro;
	}

}
