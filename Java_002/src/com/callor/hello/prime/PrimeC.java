package com.callor.hello.prime;

public class PrimeC {
	public static void main(String[] args) {
		int num = 7;
		System.out.println("======================");
		System.out.println("7는 Prime Number 인가?");
		System.out.println("----------------------");
        for(int i = 0; i <= num; i++){
        	if(num % i == 0) {
                System.out.printf("%d는 소수" ,i);

        	}
        }
        
	}
}
