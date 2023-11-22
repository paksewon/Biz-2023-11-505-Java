package com.callor.hello.var;

public class VarF {
	public static void main(String[] args) {
		float scoreKor = 80.2f;
		float scoreEng = 70.3f;
		float scoreMath = 80.3f;

		float total = scoreKor + scoreEng + scoreMath;
		float avg = total / 3;

		System.out.println("===========================");
		System.out.println("국어 : " + scoreKor);
		System.out.println("영어 : " + scoreEng);
		System.out.println("수학 : " + scoreMath);
		System.out.println("---------------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("===========================");

	}
}