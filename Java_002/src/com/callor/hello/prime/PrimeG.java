package com.callor.hello.prime;

public class PrimeG {
	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("2 ~ 100까지 수 중 소수만 출력하기");
		System.out.println("---------------------------");
		int num = 0;
		int index = 0;
		for (num = 2; num < 100; num++) {
			int i = 0;
			for(index = 1; index < num; index++) {
			if (num % index == 0) {
				i = i + 1;
			}
			if (i == 2) {
				System.out.println(i+"는 소수임");
			}
			}
		}
	}
}
