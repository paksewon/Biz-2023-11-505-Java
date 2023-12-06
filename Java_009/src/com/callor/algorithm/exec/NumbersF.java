package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

/*
 * 키보드를 통해 1개의 정수를 입력
 * 구구단 2단부터 9단까지
 * 단 정수의 배수인경우만 출력
 */

public class NumbersF {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int dan = numService.inputNum ("정수를");
		Line.sLine(50);
		for(int i = 2; i < 10; i++) {
			for(int item = 1; item < 10; item++) {
			if(i == dan || item == dan) {
				
			}
			}
		}
		
	}

}
