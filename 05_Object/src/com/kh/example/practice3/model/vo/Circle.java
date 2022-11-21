package com.kh.example.practice3.model.vo;

public class Circle {
	//필드부
	private static final double PI = 3.14;
	private int radius = 1;
	
	{
		radius = 5;
	}
	//생성자부
	public Circle() {
		getAreaOfCircle();
		getSizeOfCircle();
	}
	//메서드부
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadois() {
		return radius;
	}
	
	public void incrementRadius() {
		radius++; //radius+=1;도 가능
		getAreaOfCircle();
		getSizeOfCircle();
	}
	//원의 둘레 2*반지름*원주율
	public void getAreaOfCircle() {
		System.out.println(PI * radius * 2);
	}
	//원의 넓이 반지름*반지름*원주율
	public void getSizeOfCircle() {
		System.out.println(radius*radius*PI);
	}

}
