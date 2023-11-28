package com.callor.hello.method;

public class MethodGA {
	
	/*
	 * num 라는 값을 전달받아서
	 * prime 인지 검사하고 prime 이면 true, 아니면 false를
	 * return 하겠다 라는선언
	 */
	public static boolean isPrime(int num) {
		int index = 0;
		for(index = 2; index < num; index++) {
			if(num%index ==0) {
				break;
			}
		}
		if (index < num) {
			return false;
	} else {
		return true;
	}
	}
	
	public static void main(String[] args) {
		
	}

}
