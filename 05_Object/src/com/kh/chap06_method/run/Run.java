package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTest1 mt1 = new MethodTest1();
		mt1.method1();
		
		int random = mt1.method2();
		System.out.println("랜덤값 : "+random);
		
		mt1.method3(60, 15);
		
		System.out.println(mt1.method4(42, 5));
		
		System.out.println("=======================");
		
		// static 메서드의 경우에 new문으로 객체를 생성할 필요가 없다
		// static이 붙은 클래스 변수와 마찬가지로 메서드 또한 프로그램 실행시 정적 메모리 영역에 저장되기 때문
		MethodTest2.method1();
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("박가영", 28);
		
		System.out.println(MethodTest2.method4(100));
		

	}

}
