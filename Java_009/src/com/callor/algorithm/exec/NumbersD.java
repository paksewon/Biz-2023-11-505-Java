package com.callor.algorithm.exec;

/*
 * Scanner 클래스를 사용하여 키보드에서 연속해서 정수를 입력받기
 * 입력받은 정수를 총 합이 1000이 될때까지 누적하기
 * 누적된 합이 1000 이상이 되면 다음과 같이 출력
 */

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersD {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		
		int sum = 0;
		int count = 0;
		while (sum <= 1000) {
			int num = numService.inputNum("숫자를");
			count++;
			sum += num;
		}
		System.out.println(sum);
		

	}
}
