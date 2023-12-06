package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

/*
 * 키보드를 통해 3개정수 입력
 * 3개 점수 평균 계산 평균이 60 이상이면 합격 아니면 낙제
 */
public class NumbersH {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int sum = 0;
		float avg = 0;
		for (int i = 0; i < 3; i++) {
			int score = numService.inputNum("점수를");
			sum += score;
		}
		avg = sum / 3;
		if (avg >= 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("낙제입니다");
		}
	}
}
