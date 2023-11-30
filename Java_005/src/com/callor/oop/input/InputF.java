package com.callor.oop.input;

/*
 * Scanner 를 사용하여 정수를 입력받고 입력 받은 정수가 짝수인지 아닌지 판별하여 Console 에 출력
 * 정수를 입력 받는 중 QUIT 를 입력하면 종료, 그렇지 않으면 계속 반복
 * 입력받은 값이 정수가 아니면 메시지를 보여주고 다시 입력받기
 * 입력박은 정수는 2 부터 10까지 범위의 정수 이어야함
 * 그렇지 않으면 메세지를 보여주고 다시 입력 받기
 */

import java.util.Scanner;

public class InputF {
	public static void main(String[] args) {
		int num1 = 0;

		while (true) {
			System.out.println("정수(QUIT: 종료)");
			System.out.print("입력받은 정수는 2~10 범위의 정수입력하시오 : ");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();

			if(str.equals("QUIT")) {
				break;
			}
			try {
				num1 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력하세요");
				continue;
			}
			if( num1 > 2 || num1 <10) {
				
			}
		}
	}
}
