package com.callor.hello.array;

/*
 * 10명의 학생의 국어,영어,수학 점수를 저장할 배열 scoreKors, scoreEng, scoreMath 를 선언
 * 51부터 100까지 범위의 임의의 점수를 생성하여 배열 각 요소에 할당
 * 예제와 같은 성적표 출력
 */

public class ArrayD {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];
		int[] sum = new int[STUDENT_LENGTH];
		float [] avg = new float[STUDENT_LENGTH];
		
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
		}
	}
}
		/*int sum = 0;
		float avg = 0;
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sum += scoreKors[i];
			sum += scoreEngs[i];
			sum += scoreMath[i];
		}
		avg += (float)sum/ STUDENT_LENGTH;
		System.out.println("=".repeat(50));
		System.out.println("  샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("국어   영어   수학   총점   평균");
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf(" %d %d\n", i, scoreKors[i]);

		}
		
		

	}
}*/
