package com.callor.hello.prime;

public class PrimeE {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 2;
		int index = 0;
		for (index = 2; num < index; index++) {
			boolean isPrime = true;
			for (int i = 2; i < index; i++) {
				isPrime = false;
			}
			if (num % index == 0) {
				break;
			}

		}
		System.out.println("=============================================");
		System.out.println("소수판별하기");
		System.out.println("---------------------------------------------");
		if(index < num) {
			System.out.printf("%d MOD %d = %d", num, index, num % index);
			System.out.printf("%d 는 소수가 아님\n", num);
		} else {
			System.out.printf("%d 는 소수임\n", num);
			
		}
	}

}
