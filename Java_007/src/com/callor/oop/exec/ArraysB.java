package com.callor.oop.exec;

// 정수형 배열 45개를 선언하고
// 정수 1~45까지 순서대로 배열요소에 할당

public class ArraysB {
	public static void main(String[] args) {
		int nums[] = new int[45];
		for(int i = 0; i < nums.length; i++) {
			nums[i] += i +1;
			System.out.println(nums[i]);
		}
	}
}
