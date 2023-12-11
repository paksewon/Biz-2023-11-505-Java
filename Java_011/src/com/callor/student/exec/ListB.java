package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListB {

	public static boolean check(int check) { // 정보를 만드는 부분
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			nums.add(rndNum);
		}
		System.out.println(nums);

		int size = nums.size(); // 찾는 부분
		for (int i = 0; i < size; i++) {
			if (nums.get(i) == check) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		boolean bYes = check(77);
		if(bYes) System.out.println("있다");
		else System.out.println("없다");
	}
}
