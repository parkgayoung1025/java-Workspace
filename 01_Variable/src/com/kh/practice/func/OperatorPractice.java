package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	
	public void practice1( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+(candy / person));
		System.out.println("남는 사탕 개수 : "+ (candy - (candy/ person)* person));

		
		
		
		
	}
	
	
	public void practice2( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String str = sc.nextLine();
		
		System.out.println("학년 : ");
		int gra = sc.nextInt();
		
		System.out.println("반 : ");
		int ban = sc.nextInt();
		
		System.out.println("번호 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별(M/F) : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'M') ? "남학생" : "여학생";
		
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double ad = sc.nextDouble();
		
		System.out.printf(gra+"학년"+ban+"반"+num+"번"+str+result+"의 성적은"+ad+"이다.");
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <=13 ? "어린이 입니다" : (age > 13 && age <= 19 ? "청소년 입니다" :"성인 입니다"));
		
		System.out.printf(result);
		
		
		
	}
	
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 : ");
		int mat = sc.nextInt();
		
		
		
		System.out.println("합계 : "+(kor+eng+mat));
		
		System.out.println("평균 : "+(double)(kor+eng+mat)/3);
		
		//String result = (kor > 40) : ((kor+eng+mat)/3)>=60 ? "합격" : "불합격";
		
	}
	
	
	
	
	public void practice5() {
		
		
		Scanner sc = new Scanner(System.in);
		
	   System.out.println("주민번호를 입력 하세요(-포함) : ");
	   String str = 
	   
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
