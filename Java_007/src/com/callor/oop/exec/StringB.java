package com.callor.oop.exec;
/*
 * 다음과 같은 문자열 변수를 선언
 * String nums = "50,88,70,100,98"
 * 
 * nums 문자열 변수에 저장된 값을 컴마(,)를 기준으로 잘라서 문자열 배열에 저장
 * 문자열 배열에 저장된 숫자를 정수로 변환하여 정수들의 합을 계산하여 출력
 */

public class StringB {

	public static void main(String[] args) {
		String nums = "50,88,70,100,98";
		String[] result = nums.split(",");
		int sum = 0;
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]); // 배열에 숫자까지 정렬 하는 코드
			sum += Integer.valueOf(result[i]); // 문자열을 숫자로 바꾸는 코드
		}
		System.out.println(sum);

	}
}