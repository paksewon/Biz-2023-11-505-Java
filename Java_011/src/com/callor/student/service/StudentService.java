package com.callor.student.service;

/*
 * 1. inputStudent() method 를 선언하고
 * 키보드를 사용하여 학번,이름,학과,학년,전화번호,주소를 입력받아
 * StudentDto 객체의 각 요소에 할당하는 코드를 작성
 * 
 * 4. 학생정보를 입력받는 중 입력한 학번이 이미 있으면 "학번중복"을 출력하고 다시 입력 받기
 */
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentService {

	// 서비스에서 스캐너를 사용할땐 private
	private Scanner scan = null;
	private StudentDto studentDto = null;

	public StudentService() {
		Scanner scan = new Scanner(System.in);
		studentDto = new StudentDto();

	}

	public void inputStudent() {

		System.out.print("학번을 입력하세요");
		String stdNum = scan.nextLine();

		System.out.print("이름을 입력하세요");
		String stdName = scan.nextLine();

		System.out.print("학과를 입력하세요");
		String stdDept = scan.nextLine();

		System.out.print("학년을 입력하세요");
		String stdGrade = scan.nextLine();

		System.out.print("전화번호를 입력하세요");
		String stdTel = scan.nextLine();

		System.out.print("주소를 입력하세요");
		String stdAddr = scan.nextLine();

		StudentDto studentDto = new StudentDto();
		
		studentDto.num = stdNum;
		studentDto.name = stdName;
		studentDto.dept = stdDept;
		studentDto.grade = stdGrade;
		studentDto.tel = stdTel;
		studentDto.addr = stdAddr;
		
	}
}
