package com.callor.score.exec;

import com.callor.score.Service.StudentService;

public class StudentA {
	public static void main(String[] args) {
		String data1 = "src/com/callor/score/Service/student.txt";
		StudentService sService1 = new StudentService(data1);
		sService1.loadStudents();
//		sService1.countStudents();
		sService1.printStudents();
		
				
	}
}
