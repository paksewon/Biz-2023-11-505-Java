package com.callor.hello.array;

/*
 * 10명의 학생의 국어 점수를 저장할 배열 scoreKors 를선언
 * 51부터 100까지 범위의 임의의 점수 10개 생성하여 배열 각 요소에 할당
 * 학생들의 국어점수 출력, 배열에 저장된 전체요소의 총점 평균 계산
 * 평균은 실수로 표현하되 소수점 2째자리 까지 출력
 * 데이터저장, 총점계산, 출력 코드를 분리
 */
public class ArrayC {
	public static void main(String[] args) {
		int[] scoreKors = new int[10];
		for (int i = 0; i < scoreKors.length; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndNum;
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d 번 : %d\n", i + 1, scoreKors[i]);
		}
		int sum = 0;
		float avg = 0;
		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		}
		avg = (float) sum / scoreKors.length;
		System.out.println("-".repeat(50));
		System.out.printf("총점 : %d, 평균 :, %.2f\n", sum, avg);
		System.out.println("=".repeat(50));
	}
}
