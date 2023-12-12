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
public class StartServiceA {
	
	private StudentServiceV3A stService = null;
	private String[] menuItems = null;
	private Scanner scan = null;
	
	public StartServiceA() {
		scan = new Scanner(System.in);
		menuItems = new String[] {
				"1. 학생정보 입력",
				"2. 학생정보 가져오기",
				"3. 학생정보 조회",
				"4. 학생정보 출력",
		};
		stService = new StudentServiceV3A();
	}
	
	public void mainMenu() { // 업무 내용 보기
		
		
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
//		System.out.println("1. 학생정보 입력");
//		System.out.println("2. 학생정보 조회");
//		System.out.println("3. 학생정보 출력");
		for(String item : menuItems) {
			System.out.println(item);
		}
		
		System.out.println("QUIT. 종료");
		Line.sLine(50);
	} //end mainMenu()
	
	public int selectMenu() {
		while(true) {
			this.mainMenu(); // 메뉴 보여주기
			System.out.print("업무 선택 >> ");
			String strMenuId = scan.nextLine();
			if(strMenuId.equals("QUIT")) return -1; // 전혀 사용하지 않은 값으로 리턴 마이너스
			
			int intMenuId = 0;
			try {
				intMenuId = Integer.valueOf(strMenuId);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			if(intMenuId < 1 || intMenuId > menuItems.length) {
				System.out.printf("업무 선택은 1 ~ %d까지 입니다\n", menuItems.length);
				continue;
			}
			// 여기에 코드가 다다르면
			// 정상적으로 업무를 선택 했다는 것
			return intMenuId;
		}
//			return 0;
	} //end selectMenu()
	
	public void startApp() {
		while(true) {
			int menuId = this.selectMenu();
			if(menuId == -1) {
				break;
			} else if(menuId == 1) { // 학생정보 입력
				stService.inputStudents();
			} else if (menuId == 2) {
				stService.loadStudent();;
			} else if(menuId == 4) { // 학생정보 출력
				stService.printStudent();
			}
		}
	}
}
