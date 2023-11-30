package com.callor.oop.input;

/*
 * * Scanner 를 사용하여 정수를 입력받고 입력 받은 정수가 짝수인지 아닌지 판별하여 Console 에 출력
 * 정수를 입력 받는 중 QUIT 를 입력하면 종료, 그렇지 않으면 계속 반복
 * 입력받은 값이 정수가 아니면 메시지를 보여주고 다시 입력받기
 * 입력박은 정수는 2 부터 10까지 범위의 정수 이어야함
 * 그렇지 않으면 메세지를 보여주고 다시 입력 받기
 * 입력받은 정수가 소수인지 아닌지 판별하여 console 에 출력
 */
import java.util.Scanner;

public class InputG {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("정수(QUIT : 종료) >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				break;
			}
			int num = 0;
			num = Integer.valueOf(str);
			try {
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력하시오");
				System.out.println("입력한 값 : " + str);
				continue;
			}
			if (num < 2) {
				System.out.println("값은 2 이상의정수 입력하시오");
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
