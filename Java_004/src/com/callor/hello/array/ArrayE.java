package com.callor.hello.array;

/*
 * 10명의 학생의 국어,영어,수학 점수를 저장할 배열 scoreKors, scoreEng, scoreMath 를 선언
 * 51부터 100까지 범위의 임의의 점수를 생성하여 배열 각 요소에 할당
 * 예제와 같은 성적표 출력
 */
public class ArrayE {
	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;

		int[] student = new int[STUDENT_LENGTH];
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];

		int[] sums = new int[STUDENT_LENGTH];
		float[] avg = new float[STUDENT_LENGTH];

		for (int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < scoreEngs.length; i++) {
			scoreEngs[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < scoreMath.length; i++) {
			scoreMath[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sums[i] = scoreKors[i];
			sums[i] += scoreEngs[i];
			sums[i] += scoreMath[i];
		}
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			avg[i] = (float) sums[i] / 3;
		}

		System.out.println("=".repeat(80));
		System.out.println("\t샛별반 성적표");
		System.out.println("-".repeat(80));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%3d\t", i +1);
			System.out.printf("%3d\t", scoreKors[i]);
			System.out.printf("%3d\t", scoreEngs[i]);
			System.out.printf("%3d\t", scoreMath[i]);
			System.out.printf("%4d\t", sums[i]);
			System.out.printf("%5.2f\n", avg[i]);
		}
			System.out.println("=".repeat(80));
			System.out.println("-".repeat(80));
	}

}
