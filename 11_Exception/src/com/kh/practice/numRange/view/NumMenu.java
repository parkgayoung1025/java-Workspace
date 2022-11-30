package com.kh.practice.numRange.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumMenu {
	
	public void Menu() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수1 : ");
		System.out.print("정수2 : ");
		try {
			String num1 = br.readLine();
			String num2 = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("%d은(는) %d의 배수인가 ? \n", num1, num2, );
		
	}

}
