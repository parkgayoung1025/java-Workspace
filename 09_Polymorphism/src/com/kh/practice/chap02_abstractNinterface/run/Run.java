package com.kh.practice.chap02_abstractNinterface.run;

import com.kh.practice.chap02_abstractNinterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		String[] arr = new PhoneController().method();
		for(String result : arr) {
			System.out.println(result);
		}

	}

}
