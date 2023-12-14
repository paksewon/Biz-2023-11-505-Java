package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StartServiceImplV1 implements StartService {

	protected Scanner scan = null;
	protected StudentService stService = null;

	public StartServiceImplV1() {
		scan = new Scanner(System.in);
		stService = new StudentServiceImplV1();
	}

	@Override
	public void mainMenu() {
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
	}

	@Override
	public Integer selectMenu() {
		return null;
		
	}
//		while(true) {
//			this.mainMenu();
//			System.out.println("업무 선택 >> ");
//			String str = scan.nextLine();
//			if(str.equals("QUIT")) return null;
//			
//			int num = 0;
//			try {
//				num = Integer.valueOf(num);
//			} catch (Exception e) {
//				System.out.println("정수를 입력해주세요");
//				continue;
//			}
////			if (num < 1 || num > ) {
//				
//			}
//			
//			
//			
//		
//		
//		}
//		return null;
//	}

	@Override
	public void startApp() {
		// TODO Auto-generated method stub

	}

}
