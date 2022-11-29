package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape s = new Shape();

	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);

		s.setType(4);
		s.setHeight(height);
		s.setWidth(width);

		return width * 2 + height * 2;
	}

	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);

		s.setHeight(height);
		s.setWidth(width);
		return width * height;
	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		return "사각형 " + s.information();
	}

}
