package com.kh.practice3.model.vo;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	public Animal() {
		super();
	}
	
	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", kinds=" + kinds + "]";
	}
	
	public abstract void speak();
	
	
	

}
