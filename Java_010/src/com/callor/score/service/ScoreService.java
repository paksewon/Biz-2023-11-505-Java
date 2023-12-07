package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
/*
 * 클래스 영역에 List<ScoreDto> scores 리스트 생성, 생성자에서 초기화
 * inputScore() method 를 선언하여 키보드로 부터 학생 한명의 성적을 입력 받아
 * scores list 에 추가하는 코드를 작성
 * 단, 국어,영어,수학 성적만 입력
 */
public class ScoreService {
	
	// 클래스 영역에서는 선언만 하고
	private List<ScoreDto> scores = null;
	private NumberService numService = null;
	
	public ScoreService() {
		// 생성자에서 초기화(사용할 준비하기)
		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
	}
	
	public void inputScore() {
		
		int scoreKor = numService.inputNumber("국어 점수");
		int scoreEng = numService.inputNumber("영어 점수");
		int scoreMath = numService.inputNumber("수학 점수");
		
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		
		scores.add(scoreDto);
	}// end inputScore()
	
	public void inputScore(int start, int end) {
		
		int scoreKor = numService.inputNumber("국어 점수", start, end);
		int scoreEng = numService.inputNumber("영어 점수", start, end);
		int scoreMath = numService.inputNumber("수학 점수", start, end);
		
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		
		scores.add(scoreDto);


	}
	
	
	
}
