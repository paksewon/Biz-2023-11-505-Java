package com.callor.hello.method;

public class MethodC {
	
	public static String nation() {
		String str  = "대한민국";
		return str;
	} 
	public static void main(String[] args) {
		String nation = nation();
		System.out.println(nation);
	}

}
