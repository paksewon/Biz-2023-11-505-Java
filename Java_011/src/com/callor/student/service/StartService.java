package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.utils.Line;
/*
 * 1. mainMenu() 생성하여 다음과 같은 업무 선택 화면 보여주기
 * 2. selectMenu() 생성 후 mainMenu() 사용하여 다음과 같은 업무 선택화면 보여주기
 * Scanner 를 사용하여 키보드로 부터 업무 번호 입력받기
 * 
 * 3. 입력받은 업무 번호를 정수값으로 return 하기
 * 입력받은 업무 번호가 정수가 아니거나, 범위(1~3)을 벗어나면 메세지를 보여주고 다시 업무 선택 화면으로 돌아오기
 * 
 * 4. 업무 선택에서 QUIT를 입력하면 업무 종료
 */
public class StartService {
	
	private Scanner scan = null;
	
	public void mainMenu() {
		
		scan = new Scanner(System.in);
		
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT. 종료");
		Line.sLine(50);
	} //end mainMenu()
	
	public void selectMenu() {
		int num = 0;
		while(true) {
			System.out.print("업무 선택 >> ");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수 아닙니다");
				continue;
			}
			if(num < 1 || num > 3 ) {
				System.out.println("1 ~ 3 범위 정수만 입력하시오");
				continue;
			}
			if(str.equals("QUIT")) {
				
			}
			
		}
	}
}
