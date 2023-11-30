package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

/*
 * Scanner 를 사용하여 정수를 입력받고 입력 받은 정수가 짝수인지 아닌지 판별하여 Console 에 출력
 * 정수를 입력 받는 중 QUIT 를 입력하면 종료, 그렇지 않으면 계속 반복 
 * 입력받은 값이 정수가 아니면 메시지를 보여주고 다시 입력받기
 * 입력박은 정수는 2 부터 10까지 범위의 정수 이어야함
 * 그렇지 않으면 메세지를 보여주고 다시 입력 받기
 */

public class InputF {
	public static void main(String[] args) {
		int num = 0;
		
		while(true) {
			System.out.println("QUIT를 입력하면 종료합니다");
			System.out.println("2~10까지의 정수만 가능합니다");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();

			if(str.equals("QUIT")) {
				System.out.println("종료");
				break;
			}
			try {
				num = Integer.valueOf(str); 
			} catch (Exception e) {
				System.out.println("정수를 입력하세요");
				Line.dLine(30);
				continue;
			}
			if (num < 2 || num > 10) {
				Line.dLine(30);
				System.out.println("2 ~ 10 사이의 정수를 다시 입력하세요");
				Line.dLine(30);
				continue;
			}
			if (num % 2 == 0) {
				Line.dLine(30);
				System.out.printf("%d 는 짝수다\n", num);
				Line.dLine(30);
			} else {
				Line.dLine(30);
				System.out.printf("%d 는 짝수가 아니다\n", num);
				Line.dLine(30);
			}
		}
	}
}
		
