package com.callor.score.sevice;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.util.Line;

public class ScoreService {
	List<ScoreDto> scores = null;
	ScoreDto scoreDto = null;

	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
		scoreDto = new ScoreDto();
	
	}
	public void inputScore() {
		int size = scores.size();
		String strStdNum = "23000";
		if (scores.size() > 0) {
			strStdNum = scores.get(scores.size() - 1).stdNum;
		}

		for (int i = 0; i < 10; i++) {
			int intstdNum = Integer.valueOf(strStdNum.substring(2));
			intstdNum++;
			strStdNum = String.format("23%03d", strStdNum);

			scoreDto = new ScoreDto();

			scoreDto.stdNum = strStdNum;
			scoreDto.kor = (int) (Math.random() * 50) + 51;
			scoreDto.eng = (int) (Math.random() * 50) + 51;
			scoreDto.math = (int) (Math.random() * 50) + 51;
			scoreDto.music = (int) (Math.random() * 50) + 51;
			scoreDto.art = (int) (Math.random() * 50) + 51;

			scores.add(scoreDto);
		}
	
	}

	public void printScore() {
		
		Line.dLine(100);
		System.out.println(" * 한울 고교 새별 반 성적 리스트 * ");
		Line.sLine(100);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumMusic = 0;
		int sumArt = 0;
		int sumTotal = 0;
		int size = scores.size();
		
		for(ScoreDto scoreDto : scores) {
			System.out.printf("%s\t\t", scoreDto.stdNum);
			System.out.printf("%d\t", scoreDto.kor);
			System.out.printf("%d\t", scoreDto.eng);
			System.out.printf("%d\t", scoreDto.math);
			System.out.printf("%d\t", scoreDto.music);
			System.out.printf("%d\t", scoreDto.art);
			System.out.printf("%d\t", scoreDto.getTotal());
			System.out.printf("%.2f\n", scoreDto.getAvg());
			
			sumKor += scoreDto.kor;
			sumEng += scoreDto.eng;
			sumMath += scoreDto.math;
			sumMusic += scoreDto.music;
			sumArt += scoreDto.art;
			sumTotal = (sumKor + sumEng + sumMath + sumMusic + sumArt);
		}
		
		float sumKorAvg = sumKor / size;
		float sumEngAvg = sumEng / size;
		float sumMathAvg = sumMath / size;
		float sumMusicAvg = sumMusic / size;
		float sumArtAvg = sumArt / size;
		float sumTotalAvg = (sumKorAvg + sumEngAvg + sumMathAvg + sumMusicAvg + sumArtAvg) / 5;
		
		Line.dLine(100);
		System.out.printf("총점\t\t%d\t%d\t%d\t%d\t%d\t%d\n", sumKor + sumEng + sumMath + sumMusic + sumArt);
		System.out.printf("평균\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", sumKorAvg + sumEngAvg + sumMathAvg + sumMusicAvg + sumArtAvg);
		Line.sLine(100);

		
		

	}

}