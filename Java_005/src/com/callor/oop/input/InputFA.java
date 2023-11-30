package com.callor.oop.input;

import java.util.Scanner;

public class InputFA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("정수(QUIT: 종료) >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				break;
			}
			int num = 0;
			try {
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.println("입력한 값 : " + str);
				continue;
			}
			num = Integer.valueOf(str);
			// 유효성 검사
			if (num < 2 || num > 10) {
				System.out.println("값은 2 ~ 10 중에 입력해야 합니다");
				System.out.println("입력한 값 : " + num);
				continue;
			}
			if (num % 2 == 0) {
				System.out.println(num + " 는 짝수");
			} else {
				System.out.println(num + " 는 짝수가 아님");
			}

		}

	}

}
