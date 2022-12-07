package com.kh.chap03_sync.sync;

// 음식점
// 상품이 준비되면, 생산자(Producer)가 상품을 소비 가능
public class Buffer {

	private int data;

	private boolean empty = true; // 플래그변수(객체의 상태를 저장하고 흐름을 제어하기 위한 변수)

	public synchronized void getData() {
		/*
		 * synchronized (격리 공간으로 지정)
		 * - 동기화 메서드, 동기화 블록에 사용되는 키워드
		 * - 동기화 메서드는 메서드 선언에 synchronized 키워드를 붙이고 인스턴스, 정적 메서드 어디든 사용 가능
		 * - 동기화 메서드는 스레드가 메서드를 실행하면 메서드 전체에 즉시 락을 걸고 메서드가 종료되면 락이 풀린다.
		 * - 메서드 전체가 아니라 일부 내용만 락을 걸고 싶다면 동기화 블록을 만들면 된다. (synchronized(공유 객체){})
		 */

		while (empty) {
			try {
				wait(); // 스레드를 일시 정지 상태로 만든다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.empty = true;
		System.out.println("소비자가 " + this.data + "번 상품을 소비하였습니다.");
		
		notify(); // notify() : wait()에 의해 정지된 스레드 중 한 개를 실행 대기 상태로 만드는 것
	}

	public synchronized void setData(int data) {

		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		this.empty = false;
		System.out.println("생산자가 " + data + "번 상품을 생산하였습니다.");
	
		notify();
	}
}
