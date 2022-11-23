package com.kh.example.practice3.model.vo;

public class Cicle {
	
	
	private static final double PI = 3.14;
	private int radius = 1;


	public Cicle() {
	
	
		getAreaOfCircle();
		getSizeOfCircle();
	
	}


	public void setRadius(int radius) {
		
		this.radius = radius;
	}
	

	
	public double getRadius() {
		
		return radius;
	}
	
	
	public void incrementRadius() {		
		radius++;
		getAreaOfCircle();
		getSizeOfCircle();

	}
	
	public void getAreaOfCircle() {
		
		System.out.println(radius*PI*2);
		
	}
	
	public void getSizeOfCircle() {
		
		System.out.println(radius*radius*PI);
	}
	
	

}
