package com.callor.hello.array;

/*
 * 10명의 학생의 국어 점수를 저장할 배열 scoreKors 를선언
 * 51부터 100까지 범위의 임의의 점수 10개 생성하여 배열 각 요소에 할당
 * 배열에 저장된 전체 요소의 총점과 평균 계산 출력
 * 평균은 실수로 표현 하되 소수점 2째자리까지
 */

public class ArrayB {
	public static void main(String[] args) {
		int[] scoreKors = new int[10];
		for (int i = 0; i < scoreKors.length; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndNum;
		}
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		}
		avg = (double)sum / scoreKors.length;
		System.out.printf("국어 점수 총점 : %d, 평균 %.2f\n", sum, avg);

	}

}
