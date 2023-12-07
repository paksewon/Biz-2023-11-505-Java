package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

/*
 * 키보드에서 3개의 점수를 입력받기
 * 점수는 50 ~ 100 범위의 점수임
 * ScoreDto 클래스를 사용하여 객체를 생성하고
 * 입력받은 3개의 점수를 ScoreDto 객체의 국어, 영어, 수학 점수에 할당
 * 3과목의 총점을 계산 출력
 */

public class ScoreB {
	public static void main(String[] args) {
		ScoreDto score = new ScoreDto();
		NumberService numService = new NumberService();
		
		score.kor = numService.inputNumber("국어 점수", 50, 100);
		score.eng = numService.inputNumber("영어 점수", 50, 100);
		score.math = numService.inputNumber("수학 점수", 50, 100);
		
		int total = score.getTotal();
		System.out.println("총점 : " + total);
		
		
		
	}
}
