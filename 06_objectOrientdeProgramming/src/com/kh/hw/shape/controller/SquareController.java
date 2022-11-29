package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	Shape s = new Shape();

	public double calcPerimeter(double height, double width) {

		s = new Shape(4, height, width);
		return width * 2 + height * 2;

	}

	public double calcArea(double height, double widht) {

		s = new Shape(4, height, widht);
		return widht * height;

	}

	public void paitcolor(String color) {

		s.setColor(color);

	}

	public String print() {

		return "사각형 " + s.information();

	}
}
