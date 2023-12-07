package com.callor.score.exec;

/*
 *  3명의 성적처리 수행
 * 키보드에서 3개의 점수를 입력받기
 * 점수는 50 ~ 100 범위의 점수임
 * ScoreDto 클래스를 사용하여 객체를 생성
 * 입력받은 3개의 점수를 ScoreDto 객체 국어 영어 수학 점수 할당 후
 * 입력된 순서대로 학번을 "S0001"형식의 문자열로 만들어 학번에 할당
 * scores 리스트에 추가
 */
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreD {
	public static void main(String[] args) {
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		NumberService numService = new NumberService();
		
		int start = 50;
		int end = 100;
		
		for(int index = 0; index < 3; index++) {
			int stNum = index + 1;
			
			int scoreKor = numService.inputNumber(stNum + "번의 국어점수", start, end);
			int scoreEng = numService.inputNumber(stNum + "번의 영어점수", start, end);
			int scoreMath = numService.inputNumber(stNum + "번의 수학점수", start, end);
			
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			
			scores.add(scoreDto);
		}
		Line.dLine(50);
		System.out.println("성적리스트");
		Line.dLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점");
		Line.sLine(50);
		for(int i =0; i < scores.size(); i++) {
			ScoreDto scoreDto = scores.get(i) ;
			String strNum = String.format("S%05d", i);
			
			System.out.println(strNum);
			System.out.printf("%d\t", scoreDto.kor);
			System.out.printf("%d\t", scoreDto.eng);
			System.out.printf("%d\t", scoreDto.math);
			System.out.printf("%d\t\n", scoreDto.getTotal());
		}

		
		
	}
}
