package com.kh.chap02_string.controller;

public class D_StringBufferAndBuilder {
	/*
	 * String은 불변클래스
	 * StringBufer 와 StringBuilder는 mutable 클래스
	 * 
	 * 문자열 연산이 빈번하게 일어나는 알고리즘에서 발생하는 메모리 이슈를 해결하기 위해 나온 클래스
	 * 
	 * 기본적으로 두 개의 클래스는 동일한 메서드를 지니며 차이점은 동기화(스레드safe) 여부
	 * 
	 * StringBuffer는 멀티 스레드 환경에서 유용하며
	 * StringBuiler는 단일 스레드 환경에서 유용함
	 */
	
	public void method() {
		
		String str = "hello";
		str += "World";
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("World,");
		
		StringBuilder sb2 = new StringBuilder("hello");
		sb2.append("World");
		
		System.out.println(str);
		System.out.println(sb);
		System.out.println(sb2);
		
		System.out.println("sb의 길이는 ? : " + sb.length());
		
		// String fileName = "TEST.xox"
		System.out.println("o우의 마지막 위치는 ? : " + sb.lastIndexOf("o"));
		
		// 마지막 위치의 문자를 없애는 메서드
		// 마지막 위치 -> 문자열의 길이 -1
		// sb.deleteCharAt(인덱스);
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.println(sb);
		
		// 내가 원하는 위치의 인덱스부터 내가 정한 마지막 인덱스까지 삭제해주는 메서드
		// 시작 인덱스 <= 인덱스 범위 <= 종료 인덱스
		System.out.println(sb.delete(0, sb.length()));
		System.out.println(sb);
		
	}

}
