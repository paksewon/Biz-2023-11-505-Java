package com.callor.hello.method;

public class MethodJ {

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int)(Math.random() * 100) + 1;
			boolean isEven = isEven(num); 
			if(isEven) {
				System.out.println(num + " 는 짝수이다");
			} else {
				System.out.println(num + " 는 홀수이다");
			}
		}
	}
}
