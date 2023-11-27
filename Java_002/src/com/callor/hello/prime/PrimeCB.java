package com.callor.hello.prime;

public class PrimeCB {
	public static void main(String[] args) {
		int num = 9;
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}
		/*
		 * 코드가 여기에 다다랐을때 
		 * index 와 num의 관계 
		 * 1. 만약 num 값이 소수가 아닌 경우는 
		 * 		for() 반복문이 break 를 만나서 중단된 경우이다
		 * 		이떄는 index 값이 항상 num보다 작다
		 * 		(index < num)
		 * 2. 만약 num값이 소수인경우 
		 * 		for() 반복문은 모두 완료된다.
		 * 		이떄는 index 값이 num와 같거나 크다
		 * 		(index >= num)
		 */
		if (index < num) {
			System.out.printf("%d MOD %d = %d, ", 
						num, index, num % index);
			System.out.println(num + " 는 소수가 아님");
		} else {
			System.out.println(num + " 는 소수");
		}
	}
}
