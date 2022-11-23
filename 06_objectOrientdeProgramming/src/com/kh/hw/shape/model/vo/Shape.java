package com.kh.hw.shape.model.vo;

public class Shape {
	
	
		private int type;
		private double height;
		private double widht;
		private String color = "white";
		
		
		public Shape() {
			
		}

		
		
		public Shape(int type, double height, double widht) {
			
			this.type = type;
			this.height = height;
			this.widht = widht;
			
			
			
		
		}
		
		

		public void setType(int type) {
			
			this.type = type;
		}
		
		public void setHeight(double height) {
			
			this.height = height;
		}
		
		public void setWidth(double width) {
			
			this.widht = widht;
		}
		
		public void setColor(String color) {
			
			this.color = color;
		}
		
		public int getType() {
			
			return type;
		}
		
		public double getHeight() {
			
			return height;
		}
		
		public double getWidth() {
			
			return widht;
		}
		
		public String getColor() {
			
			return color;
		}
		
		public String information() {
			
			return height+" "+widht+" "+color;
		}
	
	

}
