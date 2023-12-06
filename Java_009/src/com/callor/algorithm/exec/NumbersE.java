package com.callor.algorithm.exec;

import com.callor.algorithm.util.Line;

/*
 * 구구단 2단부터 9단까지 출력
 * 단 구구단의 결과값이 짝수만 출력
 */

public class NumbersE {
	public static void main(String[] args) {
		
		for(int i = 2; i <10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
	}

}
