package com.callor.oop.keyboad;

import java.util.Scanner;

public class keyboardDA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 50) + 1;
		System.out.println("=".repeat(50));
		System.out.println("루팡의 황금열쇠 찾기");
		System.out.println("=".repeat(50));
		System.out.println("1 ~ 50 까지의 숫자중 황금열쇠를 입력");

		int count = 0;
		while (true) {
			System.out.print("황금열쇠 >> ");
			count++;
			String str = scan.nextLine();

			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정확한 정수를 입력 하시오");
			}
			if (num < 1 || num > 50) {
				System.out.println("1 ~ 50 범위의 정수 입력하시오");
				continue;
			}
			if (num == rndNum) {
				System.out.println("참잘했어요 : " + num);
				break;
			} else if (num > rndNum) {
				System.out.println("입력한 값이 너무 커요");
			} else if (num < rndNum) {
				System.out.println("입력한 값이 너무 작다");
			}

		}
		if (count < 5) {
			System.out.printf("%d 번째 입력 만에 찾았습니다!", count);
		} else {
			System.out.printf("%d 번째 정답 입력 실패!", count);
		}
		System.out.println("게임오버");
	}
}
