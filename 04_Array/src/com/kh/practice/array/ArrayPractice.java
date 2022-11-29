package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.
//		1 2 3 4 5 6 7 8 9 10

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {

//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.
//		10 9 8 7 6 5 4 3 2 1

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {

//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//		ex.
//		양의 정수 : 5
//		1 2 3 4 5 

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {

//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
//		ex.
//		귤

		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(arr[1]);
	}

	public void practice5() {

//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//		ex.
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8
//		i 개수 : 2

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		int b = 0;
		char[] arr = new char[str.length()];

		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (ch == arr[i]) {
				System.out.print(i + " ");
				b++;
			}
		}
		System.out.println();
		System.out.print(ch + " 개수 : " + b);
	}

	public void practice6() {

//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//		ex.
//		0 ~ 6 사이 숫자 입력 : 4   0 ~ 6 사이 숫자 입력 : 7
//		금요일 잘못 입력하셨습니다.
		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice7() {

//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2

		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총합 : " + sum);
	}

	public void practice8() {

//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
//		ex.
//		정수 : 4
//		다시 입력하세요.

//		정수 : -6
//		다시 입력하세요.

//		정수 : 5
//		1, 2, 3, 2, 1

		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		int s = 1;

		if (num < 3 || num % 2 == 0) {// 잘못 입력시
			System.out.println("다시 입력하세요");
			practice8();
		} else {
			for (int i = 0; i < num; i++) {
				arr[i] = s;
				if (i * 2 < num - 1) {
					s++;
				} else {
					s--;
				}
			}

			for (int i = 0; i < num; i++) {
				if (i == num - 1) {
					System.out.println(arr[i]);
				} else {
					System.out.print(arr[i] + ", ");
				}
			}
		}
	}

	public void practice9() {

//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//		ex.
//		치킨 이름을 입력하세요 : 양념 치킨 
//		양념치킨 배달 가능
//		이름을 입력하세요 : 불닭
//		불닭치킨은 없는 메뉴입니다.
		String[] f = { "비비큐", "푸라닭", "후참잘", "순살만공격", "처갓집" };

		System.out.print("치킨 이름을 입력하세요 : ");

		String name = sc.nextLine();

		for (int i = 0; i < f.length; i++) {
			if (name.equals(f[i])) {
				System.out.println(f[i] + " 배달 가능");
				return;
			}
		}
		System.out.println(name + " 치킨은 없는 메뉴입니다.");
	}
}
