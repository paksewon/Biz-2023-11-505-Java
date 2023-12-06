package com.callor.algorithm.exec;

import java.util.Scanner;

/*
 * Scanner 클래스를 사용하여 키보드에서 2개의 정수를 입력받기
 * 입력 받은 2개의 정수의 4칙연산과 나머지 연산 수행
 */

public class ScannerA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("=".repeat(50));
		System.out.println("첫번째 정수를 입력하세요 >> ");
		System.out.println("두번째 정수를 입력하세요 >> ");
		System.out.println("-".repeat(50));
		String str = scan.nextLine();

		int num1 = 0;
		int num2 = 0;
		try {
			num1 = Integer.valueOf(str);
			num2 = Integer.valueOf(str);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.printf("%d + %d" , num1, num2, (num1 + num2));
		

	}
}
