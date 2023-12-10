package com.callor.score.model;

public class ScoreDto {
	// 학번, 국어, 영어, 수학, 음악, 미술 총점 출력

	public String stdNum;
	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;

	private int total;
	private float avg;

	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		return total;
	}

	public float getAvg() {
		getTotal();
		avg = (float) total / 5;
		return avg;
	}

}
