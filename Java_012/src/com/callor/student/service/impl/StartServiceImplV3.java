package com.callor.student.service.impl;

import com.callor.student.models.MenuIndex;

public class StartServiceImplV3 extends StartServiceImplV2 {

	public StartServiceImplV3() {
		// 상속받은 StartServiceImplV2 의 생성자를 호출하기
		// V1에 있는 생성자 호출
		super();
//		stService = new StudentServiceImplV2();
		stService = new StudentServiceImplV3();
	}

	@Override
	public void startApp() {
		
		// App 이 시작되면 student.txt 파일에 저장된 학생정보를 가져오기
		// 가져온 학생정보는 students 에 보관하기
		stService.loadStudents(); // App 이 시작될때 로드해서 사용할 준비해라
		
		while (true) {
			Integer selectMenu = this.selectMenu();
			if (selectMenu == null)
				break;
			else if (selectMenu == MenuIndex.학생정보_입력.getIndex()) {
				// System.out.println("학생정보 입력");
				stService.inputStudents();
				
			} else if (selectMenu == MenuIndex.학생정보_조회.getIndex()) {
				System.out.println("학생정보 조회");
				
			} else if (selectMenu == MenuIndex.학생정보_가져오기.getIndex()) {
//				System.out.println("학생정보 가져오기");
				stService.loadStudents();
				
			} else if (selectMenu == MenuIndex.학생정보_출력.getIndex()) {
				// System.out.println("학생정보 출력");
				stService.printStudent();
				
			} else if(selectMenu == MenuIndex.학생정보_저장.getIndex()) {
//				System.out.println("학생정보 저장");
				stService.saveStudent();
			} // end if
			stService.saveStudent();
		}
		// 업무가 종료되면
		// students 에 보관중인 데이터를 student.txt 파일에 저장해야 한다
		stService.saveStudent();
		
		System.out.println("업무종료~!!");
	} // end startApp()

}
