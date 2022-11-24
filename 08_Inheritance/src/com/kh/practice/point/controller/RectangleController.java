package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);

//		r.setX(x);
//		r.setY(y);
//		r.setHeight(height);
//		r.setWidth(width);

		return r.toString() + "/" + width * height;
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);

		return r.toString() + "/" + 2 * (width + height);
	}

}
