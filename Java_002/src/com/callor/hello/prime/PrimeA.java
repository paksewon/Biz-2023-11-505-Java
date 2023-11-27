package com.callor.hello.prime;

public class PrimeA {
	public static void main(String[] args) {
		int num = 9;
		System.out.println("======================");
		System.out.println("9는 Prime Number");
		System.out.println("----------------------");
		for (int i = 2; i < num; i++) {
				System.out.println(num + " MOD " + i + " = " + num % i);
			}

		}
	
}
