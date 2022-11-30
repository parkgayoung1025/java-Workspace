package com.kh.practice.chap02_abstractNinterface.controller;

import com.kh.practice.chap02_abstractNinterface.model.vo.*;

public class PhoneController {

	private String[] result = new String[2];

	public String[] method() {
		Phone[] phones = new Phone[2];
		phones[0] = new GalaxyNote9();
		phones[1] = new V40();

		int count = 0;
		for (Phone phone : phones) {
			if (phone instanceof V40) {
				result[count++] = ((V40) phone).printlnformation();
			} else {
				result[count++] = ((GalaxyNote9) phone).printlnformation();
			}
		}
		return result;
	}

}
