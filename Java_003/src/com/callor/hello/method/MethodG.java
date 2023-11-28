package com.callor.hello.method;

public class MethodG {

	public static boolean isPrime(int num) {
		int index = 0;
		boolean isPrime = false;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrime = true;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		int index = (int) (Math.random() * 100) + 1;
		boolean num = isPrime(index);
		System.out.println(num + "소수임");
		if (num) {
			//System.out.printf("%d MOD %d = %d,", num, index, num % index);
			System.out.println(num + " 는 소수가 아님");
		} else {
			System.out.println(num + " 는 소수임");
		}

	}
}
