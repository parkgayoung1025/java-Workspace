package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
//		사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해 주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//		ex.
//		1이상의 숫자를 입력하세요 : 4       1이상의 숫자를 입력하세요 : 0
//		1 2 3 4                       1이상의 숫자를 입력해주세요.
//		                              1이상의 숫자를 입력하세요 : 8
//		                              1 2 3 4 5 6 7 8
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i =1; i <= num; i++) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력하세요.");
			practice1();
		}
	}
	
	public void practice2() {
//			사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//			단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
//			“1 이상의 숫자를 입력해 주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//			ex.
//			1이상의 숫자를 입력하세요 : 4      1이상의 숫자를 입력하세요 : 0
//			4 3 2 1                      1 이상의 숫자를 입력해주세요.
//			                             1이상의 숫자를 입력하세요 : 8
//			                             8 7 6 5 4 3 2 1
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num ; i > 0; i--) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력하세요.");
			practice1();
		}
	}
	
	public void practice3() {
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
//		ex.
//		정수를 하나 입력하세요 : 8
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i<=num; i++) {
			if(i == num) {
				System.out.print(i);
			}else {
				System.out.print(i+" + ");				
			}
			sum += i;
		}
		System.out.print(" = "+sum);
	}
	
	public void practice4() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
//		력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//		ex.
//		첫 번째 숫자 : 8    첫 번째 숫자 : 4    첫 번째 숫자 : 9
//		두 번째 숫자 : 4    두 번째 숫자 : 8    두 번째 숫자 : 0
//		4 5 6 7 8        4 5 6 7 8        1 이상의 숫자를 입력해주세요.
//		                            첫 번째 숫자 : 6
//		두 번째 숫자 : 2
//		2 3 4 5 6
		System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();
        
        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();
        
        if(num1 < 1 || num2 < 1) {
        	System.out.println("1 이상의 숫자를 입력해주세요.");
        	practice4();
        }else {
        	if(num1 <= num2) {
        		for(int i = num1; i <=num2; i++) { // 4 5 6 7 8
            		System.out.print(i+" ");
        		}
        	}else {
        		for(int i = num1; i <=num2; i++) { // 4 5 6 7 8
        			System.out.print(i+" ");
        		}
        	}
        }
	}

	public void practice5() {
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
//		“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//		숫자 : 4 숫자 : 10
//		===== 4단 ===== 9 이하의 숫자만 입력해주세요.
//		===== 5단 ===== 숫자 : 8
//		===== 6단 ===== ===== 8단 =====
//		===== 7단 ===== ===== 9단 =====
//		===== 8단 =====
//		===== 9단 =====
//		(해당 단의 내용들은 길이 상 생략)
		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		
	}
	
	public void practice6() {
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다.
//		* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//		ex) 2, 7, 12, 17, 22 …
//		5 5 5 5 => 여기서 공차는 5
//		ex.
//		시작 숫자 : 4
//		공차 : 3
//		4 7 10 13 16 19 22 25 28 31
		System.out.print("시작 숫자  : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(num+" ");
			num += gong;
		}
	}
	
	public void practice7() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) { // 1 2 3 4
			for(int j=0; j<i; j++) { // * 1 2 3 4
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public  void practice8() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		****
//		***
//		**
//		*
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); // 4
		
		for(int i=num; i >=1; i--) { // 1 2 3 4 -> 4 3 2 1
			//****
			for(int j=1; j<=i; j++) { // 4 3 2 1
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		   *
//		  **
//		 ***
//		****
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) { // 0 1 2 3
            //	 *
			for(int j =1; j < num-i; j++) { // 1 2 3
				System.out.print(" "); //    ;
			}
			for(int j=1; j < 2+i; j++) { // 1
				System.out.print("*"); //*
			}
			System.out.println(); //     *\n
		}
	}
	
	public void practice10() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		****
//		 ***
//		  **
//		   *
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) { // 0 1 2 3
			for(int j=0; j<i; j++) { // 0 1 2 3
				System.out.print(" "); 
			}
			for(int j=0; j<num-i; j++) { // 4 3 2 1
				System.out.print("*");//****
			}
			System.out.println();
		}
	}
	
	public void practice11() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4 (양쪽 공백x, 왼쪽에 공백있다고 생각하기)
//		   *  
//		  ***
//		 *****
//		*******
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) { // 0 1 2 3
			//   *
			for(int j=0; j < num - (1+i); j++) { // 3 2 1 0
				System.out.print(" ");
			}
			for(int j=0; j < 1+2*i; j++) { // 1+2*0 1+2*1 1+2*2 1+2*3
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	 public void practice12() {
//		 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//		 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		 * ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//		 ex) 2, 3, 5, 7, 11 …
//		 ex. 
//		 숫자 : 5 숫자 : 9 숫자 : 0
//		 소수입니다. 소수가 아닙니다. 잘못 입력하셨습니다.
		 

	 }
	 
	 public void practice13() {
//		 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		 ex.
//		 숫자 : 11
//		 2 3 5 7 11 
//		 2부터 11까지 소수의 개수는 5개입니다.
		 System.out.print("숫자 : ");
		 int num = sc.nextInt();
		 
		 if(num<2) {
			 System.out.println("잘못 입력하셨습니다.");
			 return;
		 }
		 int count = 0;
		 for(int i=2; i<=num; i++) {
			 boolean isPrime = true;
			 //i값이 소수인지 아닌지 검사를 함
			 for(int j=2; j<i; j++) {
				 if(i % j == 0) {
					 isPrime = false;
				 }
			 }
			 if(isPrime == true) {
				 System.out.print(i+" ");
				 count++;
			 }
			 //i값이 소수라면 출력을 하고, 값을 1 증가시킴
		 }
		 System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개입니다.", num, count);
	 }
	 
	 public void practice14() {
		 
	 }
	 
	 public void practice15() {
		 
	 }
	 
	 public void practice16() {
		 
	 }
	 
	 public void practice17() {
////	 다음과 같은 실행 예제를 구현하세요.
//		 ex.
//		 정수 입력 : 4
//		    *
//		   ***
//		  *****
//		 *******
//		  *****
//		   ***
//		    *
		 System.out.print("정수 입력  : ");
		 int num = sc.nextInt();
		 
		 for(int i=0; i<num; i++) {
			 //  *
			 for(int j=0; j<num-(1+i); j++) { // 0 1 
				 System.out.print(" "); //   ;
			 }
			 for(int j =0; j<1+2*i; j++) { // 0 
				 System.out.print("*"); //   *
			 }
			 System.out.println();
		 }
		 for(int i=0; i<num-1; i++) { //0 1 2 ...
			 // ***
			 for(int j=0; j<1+i; j++) { // 0
				 System.out.print(" "); // ;
			 }
			 for(int j =0; j<(num-i)*2 -3; j++) { 
				 // 1 + 2 * (num -2 - i) -> 1 -> 0
				 // 1 + 2num -4 -2i -> 2(num-i) -3
				 System.out.print("*"); // *****
			 }
			 System.out.println();
		 }
	 }
	 
	 public void practice18() {
		 
	 }
}
