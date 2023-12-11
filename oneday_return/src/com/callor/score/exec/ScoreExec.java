package com.callor.score.exec;

import com.callor.score.service.ScoreService;

public class ScoreExec {
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		scoreService.makeScore(10);
		scoreService.printScore();
		
		
		
	}

}
