package com.kh.practice2.fnc;

import java.util.Scanner;

public class CastingPractice {
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어 :");
		double kor = sc.nextDouble();
		
		System.out.printf("영어 :");
		double eng = sc.nextDouble();
		
		System.out.printf("수학 :");
		double mat = sc.nextDouble();
		
		System.out.println("총점 :"+(int)+(kor+eng+mat));
		System.out.println("평균 :"+(int)+(kor+eng+mat)/3);
		
		

}
}
