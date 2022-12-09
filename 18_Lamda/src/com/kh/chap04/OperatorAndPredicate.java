package com.kh.chap04;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.kh.model.vo.Product;

public class OperatorAndPredicate {
	/*
	 * Operator 인터페이스 특징
	 * 1. 단순 연산시 사용
	 * 2. 매개 변수로 받아온 타입, 혹은 인자를 통해 계산을 하고 해당 타입 그대로 반환
	 * 
	 * Predicate 특징
	 * 1. 매개 변수로 넘어온 값을 "검증"할 때 사용
	 * 2. 받아온 타입을 확인하고 boolean값을 반환
	 */
	public static void main(String[] args) {

		// Predicate<T> : T형을 인자로 받아서 true or false값을 리턴
		// Product 클래스를 인자로 받아서 재고가 있다면 true, 없으면 false 반환
		
		Predicate<Product> checkStock = product -> product.getStock() > 0;
	
		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시 z 플립 4", 1350000, 55));
		pList.add(new Product("갤럭시 z 플립 5", 2350000, 65));
		pList.add(new Product("갤럭시 z 플립 6", 3350000, 0));
		pList.add(new Product("아이폰 14", 4350000, 0));
		pList.add(new Product("아이폰 13", 5350000, 95));
		
		for (Product p : pList) {
			if (checkStock.test(p)) { // true값 반환 -> 재고가 0개 보다 많다
				System.out.println(p.getpName() + "상품은 현재 재고가 있습니다.");
			} else { // false값 반환 -> 재고가 0개이거나 더 적다.
				System.out.println(p.getpName() + "상품은 현재 재고가 없습니다.");
			}
		}
	}

}
