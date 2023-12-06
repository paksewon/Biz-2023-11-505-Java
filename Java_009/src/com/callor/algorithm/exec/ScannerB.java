package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.util.Line;

/*
 * Scanner 클래스를 사용하여 키보드에서 2개의 정수를 입력받기
 * 입력 받은 2개의 정수의 4칙연산과 나머지 연산 수행
 * 입력받은 값이 정수가 아닐 경우 메시지에 표시하고, 다시 입력
 */

public class ScannerB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Line.dLine(50);
		System.out.println("첫번째 정수를 입력하세요 >> ");
		String str = scan.nextLine();
		System.out.println("두번째 정수를 입력하세요 >> ");
		str = scan.nextLine();
		Line.sLine(50);
		
		int num1 = 0;
		int num2 = 0;
		try {
			num1 = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("** 정수를 정확히 입력하여 주세요 **");
		}
		
		
	}
}
