package com.kh.practice.numRange.controller;

public class NumberController {
	
	public NumberController() {
		
	}
	
	public boolean throws NumRangeException checkDouble(int num1, int num2) {
		if(num1%num2 == 0) {
			return true;
		}
	}

}
