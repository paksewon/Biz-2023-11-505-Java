package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
/*
 * inputStudent() method 를 선언하고
 * 키보드를 사용하여 학번,이름,학과,학년,전화번호,주소를 입력받아
 * StudentDto 객체의 각 요소에 할당하는 코드를 작성
 * 
 * 입력된 학생정보가 저장된 StudentDto 객체를 List<StudentDto> students 리스트에 추가하는 코드 작성
 * 
 * 반복문을 사용하여 계속해서 학생정보를 입력받고 students 리스트에 add 하는 코드 추가
 * 학생정보를 입력하는 도중 QUIT 를 입력하면 입력을 종료 하기
 */
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV2A {

	// 배열의 index 를 위한 변수 선언
	private int 학번 = 0;
	private int 이름 = 1;
	private int 학과 = 2;
	private int 학년 = 3;
	private int 전화번호 = 4;
	private int 주소 = 5;

	private Scanner scan = null;

	// 각 입력항목의 prompt 에 보여줄 제목을 담을 문자열 배열 선언
	private String[] stdTitle = null;

	private List<StudentDto> students = null;

	public StudentServiceV2A() {
		scan = new Scanner(System.in);

		students = new ArrayList<StudentDto>();

		// 각 입력 항목의 제목을 배열로 생성하기
		stdTitle = new String[] { "학번", "이름", "학과", "학년", "전화번호", "주소" };
	}

	public boolean inputStudent() {

		// 키보드로 입력한 문자열(각 요소의 값)을 저장할 배열
		// stdTitle 배열의 개수와 동일한 개수의 inputStr 배열을 생성
		String[] inputStr = new String[stdTitle.length]; // stdTitle.length(배열 갯수) 똑같은 갯수로 inputStr을 만들어냄
		
		// for() 반복문을 이용하여 입력 받기를 코드 줄이기
		for (int index = 0; index < stdTitle.length; index++) {
			System.out.print(stdTitle[index] + " 입력(QUIT: 종료) >> ");
//			inputStr[index] = scan.nextLine();
			String str = scan.nextLine();
			if(str.equals("QUIT")) {
				return false;
			}
			inputStr[index] = str;
		}
		
		System.out.println("학번중복");
		
		
		StudentDto stDto = new StudentDto();
		stDto.num = inputStr[학번];
		stDto.name = inputStr[이름];
		stDto.dept = inputStr[학과];
		stDto.grade = inputStr[학년];
		stDto.tel = inputStr[전화번호];
		stDto.addr = inputStr[주소];
		students.add(stDto); // List<StudentDto> students 리스트에 추가
		
		
		
		return true; // boolean
	}// end inputStudent()
	
	public void inputStudents() {
		boolean result = true;
		while(result) {
			result = inputStudent();
		}
		System.out.println("입력 종료 퇴근하자!!!");
	}
}