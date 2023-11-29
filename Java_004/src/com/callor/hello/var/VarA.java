package com.callor.hello.var;

import com.callor.hello.service.NumberService;

public class VarA {
	
	public static void main(String[] args) {
		// NumberService 의 add() method 에게 두개의 정수를 전달하고
		// 결과를 return 받아서 console 에 출력하고 싶다
		
		// NumberService 클래스에 있는 add() method 를 사용하려고 하는데
		// add() method 는 static 이 없다
		// 그래서 이 method 는NumberService.add() 처럼 사용 할 수 없다
		// int result = NumberService.add(30, 40);
		
		// NumberService 의 add() method 를 사용하려면
		// 먼저 준비를 해야한다.
		/*
		 * NumberService 클래스(설계도)를 가지고
		 * numberService 객체(Object, 집)를
		 * 새로(new) 만들어죠(NumberService())
		 */
		NumberService numberService1 = new NumberService(); // NumberService는 설계도다 왜? static 이 없으니깐, numberService 집이다. 객체라고 한다
		NumberService numberService2 = new NumberService();
		
		int result = numberService1.add(30, 40);
		
		String nation1 = "대한민국";
		String nation2 = new String("대한민국");  // String = 대문자는 클래스다
		String nation3 = new String();
		
		System.out.println(result);	
		
		System.out.println(nation1);
		System.out.println(nation2);
		System.out.println(nation3);
		
	}

}
