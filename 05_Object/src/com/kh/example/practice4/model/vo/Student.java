package com.kh.example.practice4.model.vo;

public class Student {
	
	private int grade;
	private int classRoom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 2;
		classRoom = 8;
		name = "박가영";
		height = 163;
		gender = '여';
	
	}
	
	public Student() {
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassRoom(int classroom) {
		this.classRoom = classRoom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getClassRoom() {
		return classRoom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void information() {
		// xxx학생은 x학년 x반이고, 키는 xx.xcm이며 남(여)학생입니다.
		System.out.printf("%s학생은 %d학년 %d반이고, 키는 %.1fcm이며 %c학생입니다.", name, grade, classRoom, height, gender); 
	}
	
	

}
