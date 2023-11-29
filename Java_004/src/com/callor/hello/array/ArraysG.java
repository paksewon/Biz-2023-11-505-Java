package com.callor.hello.array;

/*
 * 10명의 학생의 국어 점수를 저장할 배열 scoreKors를 선언
 * 51부터 100까지 범위의 임의의 점수를 생성하여 배열 각 요소에 할당
 * 학생의 국어 점수에 해당하는 평점을 출력
 *
 */

public class ArraysG {
	public static void main(String[] args) {
		int [] scoreKors = new int[10];
		for (int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int)(Math.random()* 50) +51;
		}
		System.out.println("=".repeat(80));
		System.out.println(" 국어\t평점");
		System.out.println("=".repeat(80));
		for (int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%3d\t", scoreKors[i]);
			String gradeScore = "F";
			if(scoreKors[i] >= 95) gradeScore = "A+";
			if(scoreKors[i] >= 90) gradeScore = "A";
			if(scoreKors[i] >= 85) gradeScore = "B+";
			if(scoreKors[i] >= 80) gradeScore = "B";
			if(scoreKors[i] >= 75) gradeScore = "C+";
			if(scoreKors[i] >= 70) gradeScore = "C";
			if(scoreKors[i] >= 65) gradeScore = "D+";
			if(scoreKors[i] >= 60) gradeScore = "D";

			System.out.println(gradeScore);
		}
		System.out.println("=".repeat(30));
		
		
	}
}
