package com.callor.hello.algorithm;

public class LoopJ {
	public static void main(String[] args) {
		
		/*
		 * sum 변수를 어디에서 선언할 것인가
		 */
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			// sum += i;
			sum += (i+1);	
			System.out.println(sum);
		}
		// 결과 출력은 어디에서 할 것인가
		System.out.println("1부터 10까지의 합은 = " + sum + "입니다");
		System.out.println("=========================================");
		
		
	}
}
