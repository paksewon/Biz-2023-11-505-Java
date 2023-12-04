package com.callor.oop.keyboad;

import java.util.Scanner;

public class keyboardD {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 50) + 1;
		int count = 0;
		System.out.println("=".repeat(50));
		System.out.println("뤼팡의 황금열쇠를 찾아라");
		System.out.println("=".repeat(50));
		System.out.println("1 ~ 50까지의 숫자중 황금열쇠를 입력하세요\n");

		while (true) {
			System.out.print("황금열쇠 >> ");
			count++;
			String str = scan.nextLine();

			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정확한 정수 값을 입력하세요");
				continue;
			}
			if (num < 1 || num > 50) {
				System.out.println("1~50 범위의 정수를 입력하세요\n");
				continue;
			} 
			if (num == rndNum) {
				System.out.println("참 잘했어요 : " + num);
				break;
			} else if (num > rndNum) {
					System.out.println("입력한 값이 너무 커요");
			} else if (num < rndNum) {
					System.out.println("입력한 값이 너무 작아요");
			}
			if (count >= 5)	{
				//break;
			}
		    } // end while
			if (count < 5 ) {
				System.out.printf("%d 번째 정답입니다\n", count);
			} else {
				System.out.printf("%d 번째 정답 못 맞춤\n", count);
			}
			System.out.println("GAME OVER!!");
	} // end main
}
