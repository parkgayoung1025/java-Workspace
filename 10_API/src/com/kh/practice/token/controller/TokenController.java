package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {

	}

	public String afterToken(String str) {

		StringTokenizer stn = new StringTokenizer(str, " ");
		// 방법1. String 클래스 이용
//		String result = "";
//		while (stn.hasMoreTokens()) {
//			result += stn.nextToken();
//		}

		// 방법2. StringBuffer or StringBuilder 이용
		StringBuilder sb = new StringBuilder();

		while (stn.hasMoreTokens()) {
			sb.append(stn.nextToken());
		}
		return sb.toString();
	}

	public String firstCap(String input) {
		// a,pple -> a(A)+pple
		// substring(0, 1);
		String upper = input.substring(0, 1).toUpperCase();

		return upper + input.substring(1); // 대문자로 변환한 문자 + 0번 인덱스를 제외한 문자열을 합쳐서 변환
	}

	public int findChar(String input, char one) {
		int count = 0;
		// 방법1. charAt 활용
//		for (int i = 0; i < input.length(); i++) {
//			if (input.charAt(i) == one) {
//				count++;
//			}
//		}

		// 방법2. toCharArray 활용     효율은 방법2가 더 좋음
		char[] arr = input.toCharArray();
		for(char c : arr) {
			if(c == one) {
				count++;
			}
		}
		return count;
	}
}
