package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputGA {
	
	public static boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

		int lineLength = 50;
		Scanner scan = new Scanner(System.in);
		int num = 0; // 정수 선언

		// 멈추고 싶을때 까지 계속 반복하기
		while (true) {
			Line.dLine(lineLength);
			System.out.println("소수 찾기 프로젝트");
			Line.dLine(lineLength);
			System.out.println("2 보다 큰 정수 값을 입력 해주세요");
			System.out.println("종료 하려면 QUIT 입력 하세요");
			System.out.println("정수 >> ");

			// 키보드에서 입력만들기
			// 입력이 완료되면 (...Enter) 입력된 문자열을 str 변수에 할당
			String str = scan.nextLine();

			if (str.equals("QUIT")) {
				break;
			}
			
			// 입력된 문자열을 먼저 정수로 변환하기
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수로 정확히 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);
				// 다시 while 처음으로 점프
				continue;
			}
			
			// 정수로 정호가히 입력했구나
			// 값의 유효성 검사(2 이상의 정수가 입력 되었나?)
			if(num < 2 ) {
				System.out.println("2이상의 정수를 입력해야 합니다");
				System.out.printf("입력한 값 : %d\n", num);
				continue;
			}
			
			//소수검사
			if(isPrime(num)) {
				System.out.println(num + " 는 소수야@@");
			} else {
				System.out.println(num + " 는 소수가 아님@@");
			}
			
		} // end while
		System.out.println(" 소수 찾기 프로젝트를 종료합니다");

	}
}
