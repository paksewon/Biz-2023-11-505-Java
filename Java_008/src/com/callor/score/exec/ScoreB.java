package com.callor.score.exec;

import com.callor.score.Service.ScoreServiceA;

public class ScoreB {
	public static void main(String[] args) {
		ScoreServiceA scoreService = new ScoreServiceA(); // new ScoreService 생성자 메서드 클래스를 객체로 초기화 시켜주는 함수
		scoreService.loadScores();
		scoreService.printScores();
	}
}
