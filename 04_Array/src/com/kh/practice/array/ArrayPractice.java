package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	 public void practice1() {
//		 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		 ex.
//		 1 2 3 4 5 6 7 8 9 10 
		 
		 int [] arr = new int[10]; //1. 길이가 10인 정수형 배열 선언
		 
		 for(int i=0; i<arr.length; i++) { //2. 반복문을 활용하여 1부터 10의 값을 각 인덱스에 순차적으로 대입
			 arr[i] = i + 1;
			 System.out.print(arr[i]+" "); //3. 값을 출력하기
		 }
	 }
	 
	 public void practice2() {
//		 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		 ex.
//		 10 9 8 7 6 5 4 3 2 1
		 
		 int [] arr = new int[10];
		 
		 for(int i=0; i<arr.length; i++) { // arr [0] =10; arr [1] =9; ...
			 arr[i] = 10-i;
			 System.out.print(arr[i]+" ");
		 }
		 
//		 for(int i=10-1; i>=0; i--) {
//			 arr[i] = i+1;
//			 System.out.print(arr[i]+" ");
//		 }
	 }
	 
	 public void practice3() {
//		 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//		 ex.
//		 양의 정수 : 5
//		 1 2 3 4 5 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("양의 정수  : "); //1. 사용자에게 양의 정수 입력 받기
		 int num = sc.nextInt();
		 
		 int [] arr = new int[num]; //2. 사용자에게 입력받은 정수만큼의 길이를 가진 배열을 생성
		 
		 for(int i=0; i<arr.length; i++) { //3. 1부터 num까지의 값을 배열에 초기화(대입)하기
			 arr[i] = i+1;
			 System.out.print(arr[i]+" ");
		 }
	 }
	 
	 public void practice4() {
//		 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		 배열 인덱스를 활용해서 귤을 출력하세요.
//		 ex.
//		 귤
		 String [] arr = new String[5];
		 
		 arr[0] = "사과";
		 arr[1] = "귤";
		 arr[2] = "포도";
		 arr[3] = "복숭아";
		 arr[4] = "참외";
		
		 System.out.println(arr[1]);
	 }
	 
	 public void practice5() {
//		 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//		 ex.
//		 문자열 : application
//		 문자 : i
//		 application에 i가 존재하는 위치(인덱스) : 4 8 
//		 i 개수 : 2
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("문자열 : "); //1. 문자열, 문자 입력받기
		 String str = sc.nextLine();
		 
		 System.out.print("문자 : ");
		 char ch = sc.nextLine().charAt(0);
		 
		 char [] arr = new char[str.length()]; //2. 문자열의 문자를 하나하나 배열에다가 담기
		 
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = str.charAt(i);
		 }
		 
		 String index = " ";
		 int count = 0;
		 
		 for(int i=0; i<arr.length; i++) { //3. 검색할 문자가 문자열에 몇 개 있는지, 어느 인덱스에 있는지
			 if(arr[i] == ch) {
				 index += i+" ";
				 count++; // 갯수증가
			 }
		 }
		 System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s\n", str, ch, index);
		 System.out.printf("%c 개수 : %d \n", ch, count);
	 }
	 
	 public void practice6() {
//		 “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//		 ex.
//		 0 ~ 6 사이 숫자 입력 : 4     0 ~ 6 사이 숫자 입력 : 7
//		 금요일                     잘못 입력하셨습니다.
		 Scanner sc = new Scanner(System.in);
		 
		 String [] days = {"월","화","수","목","금","토","일"}; //1. 월, 화, 수, 목, 금, 토, 일 초기화 된 문자열 배열 만들기
		 
		 System.out.print("0 ~ 6 사이 숫자 입력 : ");//2. 사용자에게 숫자를 입력받기
		 int num = sc.nextInt();
		 
		 if(num>=0 && num<=6) {
			 System.out.println(days[num]+"요일");
		 }else {
			 System.out.println("잘못 입력하셨습니다.");
		 }
	 }
	 
	 public void practice7() {
//		 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		 ex.
//		 정수 : 5
//		 배열 0번째 인덱스에 넣을 값 : 4
//		 배열 1번째 인덱스에 넣을 값 : -4
//		 배열 2번째 인덱스에 넣을 값 : 3
//		 배열 3번째 인덱스에 넣을 값 : -3
//		 배열 4번째 인덱스에 넣을 값 : 2
//		 4 -4 3 -3 2 
//		 총 합 : 2
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수 : ");
		 int num = sc.nextInt();
		 
		 int [] arr = new int[num];
		 
		 for(int i=0; i<arr.length; i++) {
			 System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			 arr[i] = sc.nextInt();
		 }
		 
		 int sum = 0;
		 
		 for(int i=0; i<arr.length; i++) {
			 sum += arr[i];
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println("\n총 합 : "+sum);
	 }
	 
	 public void practice8() {
//		 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		 다시 정수를 받도록 하세요.
//		 ex.
//		 정수 : 4
//		 다시 입력하세요.
//		 정수 : -6
//		 다시 입력하세요.
//		 정수 : 5
//		 1, 2, 3, 2, 1
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수 : ");
		 int num = sc.nextInt();
		 
		 if(num<3 || num % 2 == 0) {
			 System.out.println("다시 입력하세요.");
			 practice8();
		 }else {
			 int [] arr = new int[num]; //5
			 // 7 -> 3 -> 0, 1, 2, 3, 4, 5, 6, 7 -> 7/2 ->3
			 // 9 -> 4 -> 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> 9/2 -> 4.5 -> 4
			 for(int index=0; index<=num/2; index++) {
				 arr[index] = 1+index;
			 }
			// 0, 1, 2 -> 1, 2, 3
			 // 3, 4 -> 2, 1
			 int value = 1;
			 
			 for(int index=num/2+1; index<arr.length; index++) {
				 arr[index] = num/2+1 - value;
				 value++;
			 }
			 
			 for(int i=0; i<arr.length; i++) {
				 System.out.print(arr[i] + (i == arr.length-1 ? " " : ", "));
			 }
		 }
	 }
	 
	 public void practice9() {
//		 사용자가 입력한 값이 배열에 있는지 검색하여
//		 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//		 ex.
//		 치킨 이름을 입력하세요 : 양념        치킨 이름을 입력하세요 : 불닭
//		 양념치킨 배달 가능                 불닭치킨은 없는 메뉴입니다.
		 Scanner sc = new Scanner(System.in);
		 
		 String [] menu = {"양념","후라이드","고추바사삭","레드콤보"};
		 
		 System.out.print("치킨 이름을 입력하세요 : ");
		 String chiken = sc.nextLine();
		 
		 for(int i=0; i<menu.length; i++) {
			 if(menu[i].equals(chiken)) {
				 System.out.println(chiken+"치킨 배달 가능");
				 return;
			 }
		 }
		 System.out.println(chiken+"치킨은 없는 메뉴입니다.");
	 }

}
