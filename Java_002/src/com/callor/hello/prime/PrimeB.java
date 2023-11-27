package com.callor.hello.prime;

public class PrimeB {
	public static void main(String[] args) {
		int num = 15;
		System.out.println("===========================");
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + " MOD " + i + " = " + num % i + ",  " + num + "는 소수가 아니다");
				break;
			}
			
		}
	}
}
