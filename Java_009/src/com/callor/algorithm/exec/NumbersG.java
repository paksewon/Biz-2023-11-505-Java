package com.callor.algorithm.exec;

/*
 * 1개의 점수를 입력
 * 점수에 대한 평점 출력
 * 80점이상이면 "축하합니다", 70~79 "더분발하세요", 60점 미만이면 "낙제입니다" 출력
 */

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersG {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("점수를");
		Line.sLine(50);

		String gradeScore = "F 입니다\n낙제입니다";
		if (num >= 95)
			gradeScore = "A+ 입니다\n축하합니다";
		else if (num >= 90)
			gradeScore = "A 입니다\n축하합니다";
		else if (num >= 85)
			gradeScore = "B+ 입니다\n축하합니다";
		else if (num >= 80)
			gradeScore = "B 입니다\n축하합니다";
		else if (num >= 75)
			gradeScore = "C+ 입니다\n더 분발하세요";
		else if (num >= 70)
			gradeScore = "C 입니다\n더 분발하세요";
		else if (num >= 65)
			gradeScore = "D+ 입니다\n더 분발하세요";
		else if (num >= 60)
			gradeScore = "D 입니다\n낙제입니다";
		System.out.println(gradeScore);
		Line.dLine(50);
	}

}
