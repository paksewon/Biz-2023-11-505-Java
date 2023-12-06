package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.util.Line;

public class ScannerBB {
	public static int inputNum(String title) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print(title + "을(를) 입력해 주세요 >> ");
			String str = scan.nextLine();
			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				continue;
			}
			return num; // try 안에다가 리턴
		} // end while
	}

	public static void main(String[] args) {

		Line.dLine(50);
		int num1 = inputNum("첫번째 정수를");
		int num2 = inputNum("두번째 정수를");

		Line.sLine(50);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		
	}

}
