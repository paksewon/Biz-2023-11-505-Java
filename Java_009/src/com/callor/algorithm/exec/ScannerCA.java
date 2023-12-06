package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class ScannerCA {
	public static void main(String[] args) {
		NumberService keyService = new NumberService();
		int num1 = keyService.inputNum("첫번째 정수를");
		int num2 = keyService.inputNum("두번째 정수를");
		
		if(num2 > num1) {
			int _temp = num1;
			num1 = num2;
			num2 = _temp;
			
		}
//		if(num1 < num2) {
//			num1 = num1 + num2;
//			num2 = num1 - num2;
//			num1 = num1 - num2;
//			
//		}
//		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		keyService.printAlgebra(num1, num2);
	}
}
