package com.callor.hello.var;

public class VarC {
	public static void main(String[] args) {
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMeth = 0;
		
		int total = 0;
		int avg = 0;
		
		scoreKor = 80;
		scoreEng = 40;
		scoreMeth = 20;
		
		total = scoreKor + scoreEng+ scoreMeth;
		avg = total / 3;
		
		System.out.println("======================");
		System.out.println("국어 = " + scoreKor);
		System.out.println("영어 = " + scoreEng);
		System.out.println("수학 = " + scoreMeth);
		System.out.println("----------------------");
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + avg);
		System.out.println("======================");
		
			
		
		
		
	}
}
