package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setUserId("user01");
		user1.setuserPwd("1234");
		user1.setuserName("가영");
		System.out.println(user1.information());
		
		User user2 = new User("user01","pass01","김철수"); // id, pwd, name
		
		System.out.println(user2.information());
		

	}

}
