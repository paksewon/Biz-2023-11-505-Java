package com.callor.hello.array;

/*
 * 10명의 학생의 국어 점수를 저장할 배열 scoreKors를 선언
 * 51부터 100까지 범위의 임의의 점수를 생성하여 배열 각 요소에 할당
 * 학생의 국어 점수에 해당하는 평점을 출력
 *
 */

public class ArraysG {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		
		for(int i= 0; i < scoreKors.length; i++ ) {
			int rndNum = (int)(Math.random()* 50) + 51;
			scoreKors[i] = rndNum;
		}
		System.out.println("-".repeat(80));
		System.out.println("국어\t평점");
		System.out.println("-".repeat(80));
		
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%3d\n", scoreKors[i]);
		}
		
		
		

				
		
		
	}

}
