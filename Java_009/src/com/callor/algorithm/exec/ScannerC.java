package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.util.Line;

/*
 *  Scanner 클래스를 사용하여 키보드에서 2개의 정수를 입력받기
 *  입력 받은 2개의 정수의 4칙연산과 나머지 연산 수행
 *  단, 입력된 순서와 관계없이 "큰수가 연산식의 앞에 와야함"
 */
public class ScannerC {
	public static int inputNum(String title) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print(title + "를 입력하세요 >>");
			String str = scan.nextLine();
			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력하세요");
				continue;
			}
			return num;
		}

	}

	public static void main(String[] args) {
		Line.dLine(50);
		int num1 = inputNum("첫번째 정수");
		int num2 = inputNum("두번째 정수");

		Line.sLine(50);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);

		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		

		
		
		
	}
}
