package com.callor.oop.keyboad;

import java.util.Scanner;

/*
 * Math.reandom() method 를 사용하여 1부터 10까지 임의의 수를 하나 생성
 * Scanner 를 사용하여 키보드로 부터 정수 1부터 10까지 값을 입력받기
 * random() 으로 생성한 수가 키보드로 입력한 값과 맞으면 "참잘했어요 : OOO "
 * 맞지 않으면 random 값보다 입력한 값이 크면 "값이 너무 커요" 아니면 "값이 너무 작아요"
 * 다시한번 잘 생각해보세요 라고 메시지를 보여주고 다시 입력받기
 */

public class keyboardB {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = (int) (Math.random() * 10) + 1;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=".repeat(50));
			System.out.print("정수 >> ");
			String str = scan.nextLine();

			try {
				num1 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력하시오");
				continue;
			}
			if (num1 > 11) {
				System.out.printf("입력한 값 : %d\n", num1);
				System.out.println("정수 1 ~ 10 까지 값 입력");
				continue;
			}
			if (num1 == num2) {
				System.out.println("참잘했어요 " + num2);
				break;
			} else {
				System.out.println("틀렸어요");
			}
			if (num2 > num1) {
				System.out.println("값이 너무 작아요");
			} else {
				System.out.println("값이 너무 커요");
			}
			
			
		}
	}
}
