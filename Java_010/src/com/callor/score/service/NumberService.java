package com.callor.score.service;

import java.util.Scanner;

import com.callor.score.utils.Line;

/*
 *  public int inputNumber(String title) {} method 를 선언하고
 *  한개의 정수를 키보드를 통해 입력 받아 return 하는 코드를 작성
 */

public class NumberService {
	
	/*
	 * Service 클래스에서는 
	 * 변수, 객체를 여러 method 가 사용해야 하는 경우가 많다
	 * 그러한 변수, 객체는 클래스 영역에서 선언만 하고 
	 * 생성자에서 초기화(사용준비)를 해야 한다.
	 * 
	 * NumberService 클래스에서는 Scanner 를 여러 method 가 사용할 것이라는 전제하에 클래스 영역에서 선언하고 
	 * 생정자에서 초기화 한다
	 */
	private Scanner scan = null;
	public NumberService() {
		scan = new Scanner(System.in); // 키보드 시작하는 코드
	}

	public int inputNumber(String title) {
		while (true) {
			Line.dLine(50);
			System.out.print(title + "입력 해주세요 >> ");
			String str = scan.nextLine();
			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.err.println("** 정수를 정확히 입력해주세요 **");
				continue;
			}
			Line.sLine(50);
			return num;
		}// end while
	} // end inputNumber(String title)

	public int inputNumber(String title, int start, int end) { // 매개 변수가 다르면 똑같이 선언가능
		while(true) {
			Line.dLine(50);
			System.out.printf("%d ~ %d 범위의 정수를 입력하세요\n",start,end);
			System.out.println(title + "입력하세요 >> ");
			String str = scan.nextLine();
			int num =0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("** 정수를 정확히 입력해 주세요");
				continue;
			}
			if(num < start || num > end) {
				System.err.printf("** %d ~ %d 범위의 정수를 정확히 입력해 주세요\n", start, end);
				continue;
			}
			return num;
		}
	}
}
