package com.callor.student.service;

/*
 * 규칙 1번. StudentService*** 클래스를 만드는데 꼭 필요한
 * 				method 들은 무엇인가?
 * 
 * inputStudent()
 * inputStudents()
 * LoadStudent()
 * printStudent()
 * 
 * interface 는 클래스의 설계도 이다
 * interface 를 implements 한 클래스는 interface 에 정의된
 * method 를 반드시 만들어여한다(구현해야 한다)
 */
public interface StudentService {
	
	// class 를 설계할때 참조할 method 의 prototype 정의
	// 코드블럭({}) 없다. interface 는 코드블록이 없다 
	public boolean inputStudent();
	public void inputStudents();
	public void loadStudent();
	public void printStudent();
	
	
}
