package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

/*
 * ScoreService 클래스를 사용하여 Scores 배열을 10개 "선언"
 * score 배열의 각 요소를 생성자를 사용하여 초기화 하기
 * 단, for(반복문)을 사용하여 초기화 하기
 * scoreKor, scoreEng, scoreMath 3개의 임의 정수 쓰기
 */

public class ScoreC {

	public static void main(String[] args) {

		ScoreService[] scores = new ScoreService[10];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();
		}
		// 10개의 배열의 각 과목점수를 Random 으로 생성하고자 한다
		for (int i = 0; i < scores.length; i++) {
			scores[i].scoreKor = (int) (Math.random() * 50) + 51;
			scores[i].scoreEng = (int) (Math.random() * 50) + 51;
			scores[i].scoreMath = (int) (Math.random() * 50) + 51;
		}
		System.out.println(scores[0].scoreKor);
		System.out.println(scores[0].scoreEng);
		System.out.println(scores[0].scoreMath);

	}

}
