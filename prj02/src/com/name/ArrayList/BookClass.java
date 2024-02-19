package com.name.ArrayList;

import java.util.ArrayList;

public class BookClass {
	private String title;		//책 제목
	private String author;		//저자
	private int price;			//가격
	private String publisher;	//출판사
	private float tax = 1.1f;	//세금
	private ArrayList<BookClass>bookList = new ArrayList<BookClass>();
	
	
	BookClass(){}
	
	BookClass(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		//this.tax = tax;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public void BookClassinfo() {
		
	}
	
}
