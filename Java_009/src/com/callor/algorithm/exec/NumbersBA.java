package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.util.Line;

public class NumbersBA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자들");
		
		for(int main = 0; main < num; main++) {
			System.out.printf("%3d",main);
			for (int sub = 0; sub < main + 1; sub++) { // +1을 해줘야한다
				//System.out.printf("%3d", sub);
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
