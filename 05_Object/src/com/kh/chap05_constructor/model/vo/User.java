package com.kh.chap05_constructor.model.vo;

public class User {
	
	// 필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	// 생성자부
	/*
	 * 생성자
	 * [표현법]
	 * public 클래스명(매개변수(생략가능)) {
	 *      // 해당 생성자를 통해서 객체 생성 시 실행하고자 하는 코드;
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성해 주기 위한 목적
	 * 2. 객체 생성뿐만 아니라 매개변수로 전달되는 값을 곧바로 필드로 대입(초기화) 시킬 목적
	 * 
	 * 생성자 작성시 주의사항
	 * 1. 반드시 클래스명과 동일해야 함(대/소문자 구분)
	 * 2. 반환형이 존재하지 않는다(메서드와 유사하게 생겨서 헷갈릴 수 있음)
	 * 3. 여러 개 생성이 가능하지만 매개변수가 중복되면 안 된다
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면 기본 생성자를 JVM이 자동으로 만들어주지 않는다
	 *    즉, 어찌 됐든간에 기본 생성자는 항상 작성하는 습관을 들이자
	 */
	
	public User() {
		/*
		 * 기본생성자(매개변수가 없는 생성자)
		 * 단지 객체를 생성(메모리 영역에 공간 확보)만을 위한 목적으로 할 때 사용함
		 * 기본 생성자를 생략하는 경우 ? 오류나지 않음
		 * JVM이 클래스를 컴파일 할 때 기본 생성자가 없는 경우 항상 자동으로 만들어 주기 때문
		 * 단, 매개변수가 있는 생성자가 이미 클래스 안에 작성되어 있느 경우 반드시 기본 생성자도 함께 작성해 줘야 한다
		 * 그러니 기본 생성자를 작성하는 습관을 들이자
		 */
		System.out.println("이거 출력 되나 ?");
	}
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		this(userId, userPwd, userName);
		/*
		 * 생성자 내부에서 생성자끼리 중복되는 코드가 있는 경우, this 생성자를 통해 같은 클래스 내에 있는 다른 생성자 호출이 가능
		 * 단, 반드시 생성자 내부 첫 줄에 기술해야 함
		 */
		this.age = age;
		this.gender = gender;
	}
	
	//메서드부
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setuserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return userId+" "+userPwd+" "+userName+" "+age+" "+gender;
	}
	

}
