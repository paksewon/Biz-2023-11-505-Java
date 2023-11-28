package com.callor.hello.method;

public class MethodCA {
	
	/*
	 * String nation() : 문자열 데이터를 필수로 return 해야한다
	 */
	public static String nation() {
		String nation = "대한민국";
		//return nation;
		return "대한민국";
	}
	
	public static void main(String[] args) {
		String nation = nation();
		System.out.println(nation);
		
		// ..println() method는 화면에 값을 출력만 할뿐
		// return type이 void 이다
//		nation = System.out.println(nation() );
	}
}
