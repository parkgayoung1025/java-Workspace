package com.kh.practice3.model.vo;

public class Dog extends Animal {

	String PLACE = "애견카페";
	int weight;

	public Dog() {
		super();
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() +  "몸무게는" + weight + "kg입니다.");
	}

}