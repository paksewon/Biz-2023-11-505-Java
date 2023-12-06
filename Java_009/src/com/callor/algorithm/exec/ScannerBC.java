package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class ScannerBC {
	
	public static void main(String[] args) {
		NumberService keyinputService = new NumberService();
		
		int num1 = keyinputService.inputNum("첫번째 정수를");
		int num2 = keyinputService.inputNum("두번째 정수를");
		
		System.out.printf("%d + %d = %d\n", num1, num2 ,num1 + num2);
		
	}

}
