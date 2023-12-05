package com.callor.score.Service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentDto;
import com.callor.score.utils.Line;

/*
 * Scanner 클래스를 사용하여 scan 객체선언
 * List<StudentDto> 클래스를 사용하여 students 객체 선언
 * 생성자 method 를 선언하고, Scanner 를 통하여 student.txt 파일을 열어 데이터를 읽을 준비를 하는 코드 작성
 * ArrayList() 를 사용하여 students 객체 초기화
 * loadStudents() method 를 선언하여 student.txt 데이터를 읽어 students 리스트 데이터에 담기
 */

public class StudentService {
	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentService(String dataFile) {
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		scan = new Scanner(is);
		students = new ArrayList<>();
	} // end 생성자 메소드

	public void loadStudents() {
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			StudentDto studentDto = new StudentDto();
			
			try {
				studentDto.num = lines[0];
				studentDto.name = lines[1];
				studentDto.dept = lines[2];
				studentDto.grade = lines[3];
				studentDto.prof = lines[4];
				studentDto.tel = lines[5];
				studentDto.addr = lines[6];
			} catch (Exception e) {
				System.err.println("데이터를 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}
			students.add(studentDto);
		} // end while
	} // end loadScore()
	
//	public void countStudents() {
//		System.out.println(students.size());
//	}
	// 학번,이름,학과,학년,담임교수,전화번호,주소,,
	public void printStudents() {
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t담임교수\t전화번호\t주소");
		Line.sLine(100);
		for (int i = 0; i < students.size(); i++) {
			StudentDto studentDto = students.get(i);
			
			System.out.printf("%s\t", studentDto.num);
			System.out.printf("%s\t", studentDto.name);
			System.out.printf("%s\t", studentDto.dept);
			System.out.printf("%s\t", studentDto.grade);
			System.out.printf("%s\t", studentDto.prof);
			System.out.printf("%s\t", studentDto.tel);
			System.out.printf("%s\n", studentDto.addr);

		}
		
	}
	
	
	
}
