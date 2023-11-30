package com.callor.oop.input;

import java.util.Scanner;

public class InputEB {

	public static void main(String[] args) {
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);

		System.out.println("=".repeat(30));
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("정수 %d >> ", i + 1);
			String str = scan.nextLine();
			
			try {
				nums[i] = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해주세요");
				i--; // for 문은 -값을 써야 정수2로 안넘어간다
				continue;
			}
		}
		System.out.println("=".repeat(30));
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("=".repeat(30));
	}
}
