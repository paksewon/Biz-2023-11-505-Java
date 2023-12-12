package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {
	private List<ScoreDto> scores = null;
	
	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
	}
	
	public void makeScore() {
		int kor = (int)(Math.random() * 51) + 50;
		int eng = (int)(Math.random() * 51) + 50;
		int math = (int)(Math.random() * 51) + 50;
		int music = (int)(Math.random() * 51) + 50;
		int art = (int)(Math.random() * 51) + 50;

		String strStdNum = "23001";
		int scoresSize = scores.size();
		if(scoresSize > 0) {
			ScoreDto dto = scores.get(scoresSize - 1);
			strStdNum = dto.stdNum;
			strStdNum = strStdNum.substring(2);
			int intStdNum = Integer.valueOf(strStdNum);
			intStdNum++;
			strStdNum = String.format("23%03d", intStdNum);
		}
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.stdNum = strStdNum;
		scoreDto.kor = kor;
		scoreDto.eng = eng;
		scoreDto.math = math;
		scoreDto.music = music;
		scoreDto.art = art;
		scores.add(scoreDto);
	}
	public void makeScore(int count) {
		for(int i = 0; i < count; i++) {
			this.makeScore();
		}
	}
	
	public void printScore() {
		Line.dline(100);
		System.out.println("한울 고교 새별반 성적표");
		Line.dline(100);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sline(100);

		for(ScoreDto dto : scores) {
			System.out.printf("%s\t", dto.stdNum);

			System.out.printf("%4d\t", dto.kor);
			System.out.printf("%4d\t", dto.eng);
			System.out.printf("%4d\t", dto.math);
			System.out.printf("%4d\t", dto.music);
			System.out.printf("%4d\t", dto.art);

			System.out.printf("%4d\t", dto.getTotal());
			System.out.printf("%.2f\n", dto.getAvg());
		}
		Line.sline(100);
	
	}
	
	
	
	
}
