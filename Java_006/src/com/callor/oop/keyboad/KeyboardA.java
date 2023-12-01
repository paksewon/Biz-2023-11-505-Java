package com.callor.oop.keyboad;

import java.util.Scanner;


/*
 * Scanner 를 사용하여 10 이상의 정수를 입력받기
 * 1 부터 입력 받은 정수까지의 범위의 수중 짝수만 찾아서 console 에 출력
 */

public class KeyboardA {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println("정수 >> ");
			System.out.println("-".repeat(50));
			System.out.println("1 ~ 20까지 범위에서 짝수는?");
			String str = scan.nextLine();
		}
	}
}
