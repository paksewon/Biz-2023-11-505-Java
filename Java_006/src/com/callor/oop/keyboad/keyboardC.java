package com.callor.oop.keyboad;

import java.util.Scanner;

/*
 * Math.reandom() method 를 사용하여 1부터 10까지 임의의 수를 하나 생성
 * Scanner 를 사용하여 키보드로 부터 정수 1부터 10까지 값을 입력받기
 * random() 으로 생성한 수가 키보드로 입력한 값과 맞으면 "참잘했어요 : OOO "
 * 몇번만에 정답을 맞춰는지 검사하기
 * 정답을 맞췄으면 "00번째 정답 맞춤"
 * 
 * 정답을 계속 못맞추면, "5 번째 정답 못 맞춤 실패"
 * 실패하면, 정답을 보여주고 종료
 */

public class keyboardC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 10) + 1;
		int count = 0;
		System.out.println("=".repeat(50));
		System.out.println("숫자 맞추기 게임");
		System.out.println("=".repeat(50));
		while (true) {
			System.out.println("1 ~ 10까지 범위의 정수를 입력하세요");
			System.out.println("정수 >> ");
			count++;
			String str = scan.nextLine();

			int num = 0; // while 문에서 사용할 변수 선언
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);
				continue;
			}
			if (num < 1 || num > 10) {
				System.out.println("1 ~ 10까지 범위의 정수만 입력하세요");
				continue;
			}
			if (num == rndNum) {
				System.out.println("참 잘했어요 : " + num);
				break;
			} else if (num > rndNum) {
				System.out.println("입력한 값이 너무 커요");
				// continue;
			} else if (num < rndNum) {
				System.out.println("입력한 값이 너무 작아요");
				// continue;
			}
			System.out.println("다시한번 잘 생각해 보세요");
			if (count >= 5) {
				break;
			}

		} // end while

		if (count < 5) {
			System.out.printf("%d 번째 정답\n", count);
		} else {
			System.out.printf("%d 번째 정답 못 맞춤 실패\n", count);
		}

		System.out.println("GAME OVER!!");
	} // end main

}
