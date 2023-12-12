package com.callor.student.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Line;

/*
 * 키보드를 통해서 학생정보를 입력받고
 * StudentDto에 추가한 다음
 * List<StudentDto> students 리스트에 추가하기
 * 
 * 메서드들 공유해보기
 * 
 * student.txt 파일 읽어서 리스트에 추가하기
 */

public class StudentServiceV3 {

	// 클래스 영역에 선언된 변수(객체)들
	// 인스턴스 변수, 멤버변수
	// 클래스 영역에 선언된 변수나 객체는 private 으로 선언한다
	// 다만 이 클래스를 누간가 상속하여 사용할 것으로 예상되면
	// protected 로 선언한다
	private Scanner scan = null;
	private List<StudentDto> students = null;
	private InputStream is = null;

	// 클래스 영역에 선언된 변수는 생성자 method 에서
	// 값을 초기화 하여 사용할 준비를 한다
	public StudentServiceV3() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();

	}

	private String itemInput(String title) {
		while (true) {
			System.out.println(title + " 입력(QUIT:종료) >> ");
			String inputStr = scan.nextLine();

			// 아무런 값도 입력하지 않고 Enter 누르기 금지
			if (inputStr.isBlank()) {
				System.out.printf("*** %s 값은 반드시 입력!!", title);
				continue;
			}

			// 키보드로 QUIT를 입력하면?? 라는 뜻
			if (inputStr.equals("QUIT")) {
				return null;
			}
			return inputStr;
		}
	}

	// 한 학생의 정보를 입력 받은 method
	public boolean inputStudent() { // void 를 boolean 으로 바꾼고 뒤에 false 적고 마지막에 return true

		String strNum = null;
		String strName = null;
		String strDept = null;
		String strGrade = null;
		String strTel = null;
		String strAddr = null;

		// 입력한 학번이 이미 students 요소중에 있으면
		// 다시 학번을 입력 받기 위하여
		// 학번 입력 부분을 무한 반복처리
		while (true) {
			strNum = this.itemInput("학번"); // null 값 리턴하고 끝내라
			if (strNum == null)
				return false; // if 한줄만 쓸땐 중괄호 생략가능

			// 학번에서 아무 값도 입력하지 않고 Enter 를 눌렀을때


//			for(StudentDto dto : students) { // students 배열의 요소를 dto 로 넣어주라
//				// 개별 dto 의 num 속성(맴버변수)이 내가 입력한
//				// strNum 변수에 할당된 값과 같냐?
//				if(dto.num.equals(strNum)) {
//					System.out.println("*** 학번 중복");
//					continue;
//				}
//			}
			// 학번 중복 코드
			int index = 0;
			int size = students.size();
			for (index = 0; index < size; index++) {

				if (students.get(index).num.equals(strNum)) {
					break;
				}
			}
			if (index < size) {
				System.out.println("** 학번 중복");
				continue;
			} else {
				break;
			}
		}
		strName = this.itemInput("이름");
		if (strName == null)
			return false;

		strDept = this.itemInput("학과");
		if (strDept == null)
			return false;

		strGrade = this.itemInput("학년");
		if (strGrade == null)
			return false;

		strTel = this.itemInput("전화번호");
		if (strTel == null)
			return false;

		strAddr = this.itemInput("주소");
		if (strAddr == null)
			return false;

		StudentDto stdDto = new StudentDto();
		stdDto.num = strNum;
		stdDto.name = strName;
		stdDto.dept = strDept;
		stdDto.tel = strTel;
		stdDto.addr = strAddr;

		students.add(stdDto);
		return true;

	} // end inputStudent()

	public void inputStudents() { // 여러명 만들어주기
		while (true) {
			boolean bYes = this.inputStudent();
			// if(bYes == false) {
			// if(bYes != true) {
			if (!bYes) { // !bYes가 true 가 아니면
				break;
			}
		}
		System.out.println("업무 종료@@");
	}
	
	public void loadStudent() {

		String dataFile = "src/com/callor/student/models/student.txt";
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] result = line.split(",");
			StudentDto std = new StudentDto();
			
		try {
			is = new FileInputStream(dataFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		scan = new Scanner(is);
			
		}
		
		
		
		
		
		
		
		
	}
}
