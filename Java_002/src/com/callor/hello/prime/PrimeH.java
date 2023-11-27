package com.callor.hello.prime;

public class PrimeH {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 100; i++) {
			int num = i + 1;
			int index = 0;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			}
			if (index < num) {
			} else {
				sum += num;
			}

		}
		System.out.println("===================================");
		System.out.println("2~100까지 수 중 소수들의 합 :" + sum);
		System.out.println("-----------------------------------");
	}
}
