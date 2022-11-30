package com.kh.practice.chap02_abstractNinterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	public GalaxyNote9() {

	}

	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	public String takeCall() {
		return "수신 버튼을 누름";
	}

	public String picture() {
		return "1200만 듀얼 카메라";
	}

	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}

	public String touch() {
		return "정전식, 와콤펜 지원";
	}

	public boolean bluetoothPen() {
		return true;
	}

	public String printlnformation() {
		String result = "갤럭시 노트9은 삼성에서 만들어졌고 제원은 다음과 같다.\n";
		result += makeCall() + "\n";
		result += takeCall() + "\n";
		result += picture() + "\n";
		result += charge() + "\n";
		result += touch() + "\n";
		result += "블루투스 펜 탑재 여부 : " + bluetoothPen() + "\n";
		return result;
	}

}
