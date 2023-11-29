package com.callor.hello.scores;

import com.callor.hello.service.ScoreService;
public class ScoreA {
	
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = ScoreService.score(STUDENT_LENGTH); // ScoreService는 클래스 사용하기 위해선 import가 있어야된다
		int[] scoreEngs = ScoreService.score(STUDENT_LENGTH);
		int[] scoreMaths = ScoreService.score(STUDENT_LENGTH);
		int[] scoreMusics = ScoreService.score(STUDENT_LENGTH);
		int[] scoreHiss = ScoreService.score(STUDENT_LENGTH);
	
		for(int i =0; i < scoreKors.length; i++) {
			System.out.printf("%3d\t", scoreKors[i]);
			System.out.println(ScoreService.gradeScore(scoreKors[i]));
		}
	
	}
	
}
