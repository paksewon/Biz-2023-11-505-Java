package com.callor.student.service.impl;

/*
 * inputStudent() method 재정의한다
 * 
 * 입력과정에서 현재 students 에 저장된 학생 리스트 학번을 참조하여 새로운 학번을 자동으로 보여준다
 * 
 * 예) 학번(S0101) 입력(QUIT:종료)
 */
import com.callor.student.models.StdIndex;
import com.callor.student.models.StudentDto;

public class StudentServiceImplV3 extends StudentServiceImplV2 {

	public StudentServiceImplV3() {
		super();
	}

	@Override
	public boolean inputStudent() { // 한명의 학생정보 만드 곳
		// TODO:한 학생의 정보 입력받기

		String[] inputStr = new String[StdIndex.values().length];
		for (StdIndex item : StdIndex.values()) {
			while (true) {
				System.out.printf("%s(S0101) 입력(QUIT: 종료) >> ", item);
				String str = keyBD.nextLine(); // item.getIndex가 StdIndex item 갯수를 알려준다
				if (str.equals("QUIT"))
					return false;
				// 학번을 입력하는 경우 학번의 중복검사를 실시한다.
				if (item.toString().equals("학번") && this.selectStdNum(str) != null) { // 아이템이 학번이면 널(중복이라는듯)이 아니면 알려주기
					System.out.println("학번 중복");
					continue; // continue 는 for 문을 만나면 한단계 건너 뛴다. 그래서 while 를 써준다
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

}
