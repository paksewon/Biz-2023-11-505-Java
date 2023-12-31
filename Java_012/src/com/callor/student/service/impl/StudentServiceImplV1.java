package com.callor.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;
/*
 * StudentServiceImplV1 클래스는 StudentService interface 를
 * implements (상속, 설계를 이어 받기) 하였다
 * 이때 interface 에 정의된 method 들은 반드시 만들어여한다
 * 그렇지 않으면 코드가 오류가 발생하여 진행이 되지 않는다
 * 
 * interface 와 class 간에 하나의 규칙이 만들어지는 것이다
 * 
 * 이렇게 interface 를 implements 한 클래스를 "구현체" 클래스 라고한다
 */

public class StudentServiceImplV1 implements StudentService {

	// 현재 Implv1 클래스를 다른 클래스가 상속하였을때
	// protected 로 선언된 변수는 같이 상속이 된다
	// 즉 Implv1 을 상속한 클래스에서는 별도로
	// students 리스트 객체(변수)를 선언하지 않아도 된다
	protected List<StudentDto> students = null;
	protected Scanner keyBD = null;

	public StudentServiceImplV1() {
		students = new ArrayList<StudentDto>();
		keyBD = new Scanner(System.in);
	}

	// 학번을 매개변수로 전달받아 students 리스트를 검색하여
	// 동일한 학번의 요소가 있으면 그 요소를 return
	// 없으면 null 을 return
	protected StudentDto selectStdNum(String num) {
		// TODO: 학생정보 찾기
		for (StudentDto std : students) {
			if (std.num.equals(num)) {
				return std; // 리턴값은 StudentDto
			}
		}
		// 여기에 코드가 도달하면, 같은 학번이 없다!!
		return null;
	}
	
	public String newStdNum() {
		String stdNum = "S0001";
		if(!students.isEmpty()) {
			// students 리스트의 가장 "마지막 요소"의 학번
			stdNum = students.get(students.size() -1).num;
			
			// num 데이터의 맨 첫번째 한개 글자를 추출하
			// S0100 이라면 S만 추출하기
			String frefix = stdNum.substring(0,1);
			
			// S0100 이라면 0100만 추출하기
			stdNum = stdNum.substring(1);
			stdNum = String.format("%s%04d", frefix, Integer.valueOf(stdNum) + 1);
		}
		return stdNum;
	}

	@Override
	public boolean inputStudent() { // 한명의 학생정보 만드 곳
		// TODO:한 학생의 정보 입력받기

		// 키보드로 학생의 개별 정보들(학번, 이름.. 등등)을 입력받고
		// 임시로 저장할 배열
		// StdIndex enum 에 선언된 요소의 개수를 세어
		// 그 개수를 사용하여 inputStr 배열을 생성하기
		String[] inputStr = new String[StdIndex.values().length];
		for (StdIndex item : StdIndex.values()) {
			while (true) {
				String newStdNum = this.newStdNum();
				System.out.printf("%s (%s) 입력(QUIT: 종료) >> ", item, newStdNum);
				String str = keyBD.nextLine(); // item.getIndex가 Stdindex item 갯수를 알려준다
				if (str.equals("QUIT"))
					return false;
				// 학번을 입력하는 경우 학번의 중복검사를 실시한다
				if (item.toString().equals("학번")) {
					if (str.isBlank()) {
						System.out.printf("** 학번은 %s 를 사용함\n", newStdNum);
					}

					if (this.selectStdNum(str) != null) { // 아이템이 학번이면 널(중복이라는듯)이 아니면 알려주기
						System.out.println("학번 중복");
						continue; // continue 는 for 문을 만나면 한단계 건너 뛴다. 그래서 while 를 써준다
					}
				} else if (str.isBlank()) {
					System.out.println("값을 입력해주세요");
					System.out.printf("%s 는 필수 항목입니다.\n", item);
					continue;
				}

				inputStr[item.getIndex()] = str;
				break;
			}
		}
		StudentDto stDto = new StudentDto();
		stDto.num = inputStr[StdIndex.학번.getIndex()];
		stDto.name = inputStr[StdIndex.이름.getIndex()];
		stDto.dept = inputStr[StdIndex.학과.getIndex()];
		stDto.grade = inputStr[StdIndex.학년.getIndex()];
		stDto.tel = inputStr[StdIndex.전화번호.getIndex()];
		stDto.addr = inputStr[StdIndex.주소.getIndex()];
		students.add(stDto);
		return true;
	}

	@Override
	public void inputStudents() {
		// TODO: 여러명학생의 정보 입력받기
//		while(true) {
//			if(!this.inputStudent();{
//				break;
//		}
//		}
		boolean result = true;
		while (result) {
			Line.sLine(100);
			result = this.inputStudent();
			Line.sLine(100);
		}
		System.out.println("입력 끝");
	}

	@Override
	public void loadStudents() {
		// TODO:학생정보 읽어오기

	}

	@Override
	public void printStudent() {
		// TODO:학생정보 출력하기
		Line.dLine(100);
		System.out.println("학생정보 출력 v1");
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		Line.sLine(100);
		for (StudentDto dto : students) {
			System.out.printf("%s\t", dto.num);
			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\n", dto.addr);
		}
		Line.dLine(100);

	}

	@Override
	public void saveStudent() {
		// TODO Auto-generated method stub

	}

}
