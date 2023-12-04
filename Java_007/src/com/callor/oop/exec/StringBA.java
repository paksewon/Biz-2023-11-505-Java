package com.callor.oop.exec;

public class StringBA {
	public static void main(String[] args) {
		String nums = "50,88,70,100,98";
		String[] result = nums.split(",");

		for(int i = 0; i <result.length; i++) { // 순서 나열하기
			System.out.println(result[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < result.length; i++) {
			sum += Integer.valueOf(result[i]);
		}
		System.out.println("합계 : " + sum);
	}
}
