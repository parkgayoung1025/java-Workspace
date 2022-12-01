package com.kh.practice3.model.vo;

public class Cat extends Animal {
	
	String location;
	String color;

	public Cat() {
		super();
	}

	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void speak() {
		
	}

}
