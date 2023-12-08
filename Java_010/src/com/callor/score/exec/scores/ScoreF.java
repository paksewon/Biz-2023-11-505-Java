package com.callor.score.exec.scores;

import com.callor.score.service.ScoreService;

public class ScoreF {

	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		
		// 3명의 학생 점수를 입력받아 scoreService.scores 에
		// 추가해 달라
		for (int i = 0; i < 3; i++) {
			scoreService.inputScore(); // scoreService에 점수 저장

		}
		// scoreService.scores 에 저장된 학생이 성적 정보를 
		// 출력해달라
		scoreService.printScore();
		
	}

}
