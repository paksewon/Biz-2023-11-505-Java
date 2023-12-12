package com.callor.score.model;

public class ScoreDto {
	
	public String stdNum;
	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;
	
	private int total;
	private float avg;
	
	public int getTotal() { // 총점
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		return total;
	}

	public float getAvg() { // 평균
		this.getTotal();
		avg = (float) total / 5;
		return avg;
	}
	

}
