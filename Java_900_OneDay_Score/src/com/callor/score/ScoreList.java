package com.callor.score;

public class ScoreList {

	public static void main(String[] args) {

		ScoreService scoreService = new ScoreService();
		scoreService.inputScore();
		scoreService.printScore();

	}
}