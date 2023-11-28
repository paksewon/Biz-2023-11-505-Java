package com.callor.hello.arrays;

public class ArrayA {
	/* 
	 * 51부터 100까지 범위의 임의의 정수 5개를 생성하고
	 * 5개의 정수형 변수를 선언하여 각각저장
	 * 5개의 변수에 저장된 값을 합산하여 출력
	 */
	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i <5; i++) {
			num =(int)(Math.random() * 50) + 51; 
		}
		for(int i =0; i < 5; i++) {
			System.out.printf("%d 번째 %d\n", i+1, num);
		}
	}
}
