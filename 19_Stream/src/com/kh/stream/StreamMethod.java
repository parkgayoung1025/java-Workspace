package com.kh.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethod {

	public static void main(String[] args) {
		// stream에서 원하는 값을 얻어내기 위한 메서드들

		// 1) filter : 조건에 맞는 값만 추려주는 메서드
		String[] foods = { "마라탕", "마라탕", "김치찜", "김치찜", "삼겹살", "하와이안피자", "김밥", "짬뽕" };

		// 음식 이름이 "마"로 시작하는 음식만 추리기
		Arrays.stream(foods)
			.filter(food -> food.charAt(0) == '마')
			.forEach(System.out::println);

		System.out.println("===== 중복값 제거 =====");

		// 2) distinct() : 중복값을 제거해주는 메서드
		List<String> arr = Arrays.asList(foods);

		arr.stream()
			.distinct()
			.filter(food -> food.charAt(0) == '마')
			.forEach(System.out::println);

		System.out.println("===== 맵 =====");

		// 3) map 관련 메서드들
		// 3-1) mapXXX : 현재 요소를 XXX로 대체하여 스트림 반환
		arr.stream()
			.map(food -> {
				if (food.equals("하와이안피자")) {
					return food + "맛없다.";
				} else {
					return food + "맛있다.";
				}
			})
			.forEach(System.out::println);

		System.out.println("=============");
		
		// 3-2) flatMapXXX : 특정 요소가 여러 개의 요소로 대체되는 스트림 반환
		List<String> arr2 = Arrays.asList("마라탕 훠궈 양꼬치 김밥"); // ["마라탕 훠궈 양꼬치 김밥"]
		
		// 스페이스바 기준으로 각각의 요리를 String 요소로 만들기
		arr2.stream()
			.flatMap(food -> Arrays.stream(food.split(" ")))
			.forEach(System.out :: println);
		
//		String [] strArr  = {"마라탕 훠궈 양꼬치 김밥", "박가영"}; 
//		List<String> arr2 = Arrays.asList(strArr);
//		// 스페이스바 기준으로 각각의 요리를 String 요소로 만들기
//		arr2.stream()
//			.flatMap(food -> Arrays.stream(food.split(" ")))
//			.forEach(System.out :: println);
		
		System.out.println("=============");
		
		// 3-3) asXXXStream(), boxed() : 형 변환 관련 메서드
		int [] iArr = {1, 3, 5, 7, 9};
		
		// double로 형 변환하여 출력
		Arrays.stream(iArr)
				.asDoubleStream()
				.forEach(System.out :: println);
		
		Arrays.stream(iArr)
				.boxed()
				.forEach(i -> System.out.println(i.hashCode() + " "));
		
		System.out.println("===== peak =====");
		
		// 4) sorted() : 정렬
		
		// 5) 루프메서드
		// 5-1) forEach : 최종 처리 스트림 -> 마지막에 호출해야 정상적으로 작동
		// 5-2) peek : 중간처리 메서드 -> 중간에 호출해야 정상적으로 작동
		arr.stream()
			.distinct()
			.filter(food -> food.length() == 3) // 세글자 음식
			.peek(food -> System.out.println("남아있는 음식은 ? " + food))
			.forEach(System.out :: println);
		
		/*
		 * 6) 집계 함수들
		 *    스트림의 마지막에 사용
		 *    count() : 갯수 반환
		 *    sum() : 합계 반환
		 *    max() : 최대값 반환
		 *    min() : 최소값 반환
		 *    
		 * 7) 그 외
		 *    findFirst() : 스트림의 첫번째 요소 반환
		 *    findAny() : 스트림에 값이 있다면 아무 값이나 반환
		 *    orElse(대체값) : 값이 저장되어 있지 않다면 대체값 설정 가능
		 */
		
		String str = arr.stream()
				.distinct()
				.filter(food -> food.length() == 3) 
				.peek(food -> System.out.println("남아있는 음식은 ? " + food))
				.findAny()
				.orElse(null);
		System.out.println(str);
	}

}
