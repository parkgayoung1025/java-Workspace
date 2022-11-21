package com.kh.example.practice6.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountaRate;

	public Book() {

	}

	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	public Book(String title, String publisher, String author, int price, double discontaRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountaRate = discountaRate;
	}

	public void information() {
		System.out.println(title + ", " + publisher + ", " + author + ", " + price + ", " + discountaRate);
	}

}
