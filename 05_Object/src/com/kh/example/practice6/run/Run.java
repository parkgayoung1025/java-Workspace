package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book b1 = new Book();
		b1.information();

		Book b2 = new Book("자바의 정석", "나무", "박가영"); // title, publisher, author
		b2.information();

		Book b3 = new Book("자바의 정석", "나무", "박가영", 15000, 0.0);
		b3.information();
	}
}
