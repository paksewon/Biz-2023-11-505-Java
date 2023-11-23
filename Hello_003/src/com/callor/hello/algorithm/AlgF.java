package com.callor.hello.algorithm;

public class AlgF {
		public static void main(String[] args) {
			
			/*
			 * 우리나라 화폐는
			 * 5만, 1만, 5천, 1천, 5백, 1백, 50, 10원 단위이다
			 * 아래 pay 에 저장된 값에서
			 * 각각 화폐단위 만큼 몇개씩이 포함되는지 
			 * 출력하시오
			 */
			
			int pay = 3587960;
				        
			int m1 = pay / 50000;
			int m2 = pay % 50000 / 10000;
			int m3 = pay % 50000 % 10000 / 5000;
			int m4 = pay % 50000 % 10000 % 5000 / 1000;
			int m5 = pay % 50000 % 10000 % 5000 % 1000 / 500;
			int m6 = pay % 50000 % 10000 % 5000 % 1000 % 500 / 100;
			int m7 = pay % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50;
			int m8 = pay % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10;
			System.out.println("======================================");
			System.out.println("5만원권 : " + m1);
			System.out.println("1만원권 : " + m2);
			System.out.println("5천원권 : " + m3);
			System.out.println("1천원권 : " + m4);
			System.out.println("5백원권 : " + m5);
			System.out.println("1백원권 : " + m6);
			System.out.println("5십원권 : " + m7);
			System.out.println("1십원권 : " + m8);
			System.out.println("======================================");





			
		}

}
