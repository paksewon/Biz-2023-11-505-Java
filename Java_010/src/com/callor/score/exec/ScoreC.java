package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

/*
 * 3명의 성적처리 수행
 * 키보드에서 3개의 점수를 입력받기
 * 점수는 50 ~ 100 범위의 점수임
 * ScoreDto 클래스를 사용하여 객체를 생성
 * 입력받은 3개의 점수를 ScoreDto 객체 국어 영어 수학 점수 할당 후
 * scores 리스트에 추가
 */
public class ScoreC {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		ScoreDto score = new ScoreDto();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();

		int start = 50;
		int end = 100;
//		int scoreKor = 0;
//		int scoreEng = 0;
//		int scoreMath = 0;
		for (int i = 0; i < 3; i++) {
			int scoreKor = numService.inputNumber("국어 점수를", start, end);
			int scoreEng = numService.inputNumber("영어 점수를", start, end);
			int scoreMath = numService.inputNumber("수학 점수를", start, end);

			score.kor = scoreKor;
			score.eng = scoreEng;
			score.math = scoreMath;
			
		}

		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("국어\t영어\t수학\t총점");
		Line.sLine(50);
		for(int i = 0; i < 3; i++) {
			
		}
		
	}
	
}
