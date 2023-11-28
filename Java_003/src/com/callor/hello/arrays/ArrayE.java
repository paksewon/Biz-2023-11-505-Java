package com.callor.hello.arrays;

public class ArrayE {
	/*
	 * 10개의 요소를 갖는 정수형 배열 nums를 선언
	 * 51부터 100까지 범위의 임의의 정수 10개를 생성하여 배열 각 요소에 할당
	 * nums 배열 요소에 보관된 수 중 80 보다 큰 값을 찾아서 console 에 출력
	 * 배열 요소에 값 할당, 값 찾기 부분은 코드를 분리하여 작성
	 */
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++ ) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0; i < 10; i++) {
			if(nums[i] > 80) {
				System.out.printf("index %d 번 요소의 값 : %d\n",i, nums[i]);
			}
		}
	}

}
