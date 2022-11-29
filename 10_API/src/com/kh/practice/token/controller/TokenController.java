package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {

	}

	public String afterToken(String str) {
		str = "J a v a P r o g r a m";
		StringTokenizer stn = new StringTokenizer(str, " ");
		while (stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		return str;
	}

	public String firstCap(String input) {
		str.substring(0, 1);
		String str = str.replace('l', 'a');
	}

	public int findChar(String input, char one) {

	}
}
