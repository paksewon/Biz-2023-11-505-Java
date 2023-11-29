package com.callor.hello.array;

public class ArrayA {
	/*
	 * 10개의 요소를 갖는 정수형 배열 nums 선언
	 * 51부터 100까지 범위의 임의의정수 10개 생성하여 배열 각 요소에 할당
	 * nums 배열 요소에 보관된 수 중 80보다 큰 값이 최초로 나타나는 index 와, 
	 * 배열의 요소 값 console 에 출력
	 */
	
	public static void main(String[] args) {
		int[] nums = new int [10];
		for (int i = 0; i < 10; i ++) {
			nums[i] = (int)(Math.random() *50) + 51;
		}
		for (int i = 0; i <10; i++) {
			if(nums[i] > 80) {
				System.out.printf("index %d 번 요소값 : %d\n", i, nums[i]);
				break;
			}
		}
	}

}
