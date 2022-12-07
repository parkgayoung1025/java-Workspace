package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.Account;
import com.kh.chap03_sync.sync.Atm1;

public class Run2 {

	public static void main(String[] args) {

		// 계좌, ATM
		Account acc = new Account();
		Thread atm1 = new Thread(new Atm1(acc));
		Thread atm2 = new Thread(new Atm1(acc));
		
		/*
		 * 메서드에 동기화 처리(synchronized) 해주지 않은 경우 값이 마구 뒤섞임
		 * 즉, 앞의 스레드가 실행되는 동안은 다른 스레드가 같은 자원에 접근하면 안 됨 
		 */
		atm1.start();
		atm2.start();
		
		/*
		 * 동기화란?
		 * 멀티쓰레딩 프로그램에서 스레드 간 공유자원에 대한 처리를 말함
		 * 공유 자원에 대한 사용 순서를 정해주는 것
		 * LOCK을 획득한 스레드만 사용 가능하다.
		 */
		System.out.println("메인 스레드 종료");
	}

}
