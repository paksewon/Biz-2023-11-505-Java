package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. main 에서 List<Integer> nums 리스트 생성
 * 51~100 까지 random 수를 10개 생성하여 nums 리스트에 추가
 * 
 * 2. nums 리스트에 저장된 정수 중에서 77을 찾아서 있으면 "있다" 라고 출력
 * 
 * 3.. nums 리스트에 저장된 정수 중에서 77을 찾아서 있으면 몇번째인지 없으면 "없음" 이라고 출력
 */
public class ListA {
	public static void main(String[] args) { // 정보를 만드는 부분
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			nums.add(rndNum);
		}

		System.out.println(nums);

		int size = nums.size(); // 찾는 부분
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == 77) {
				System.out.println("있다");
			}
		}
		int index = 0;
		for (index = 0; index < size; index++) {
//			if(nums[index] ==77) break;
			if (nums.get(index) == 77) {
				break;
			}
		}
		if (index < size) {
			System.out.println(index + " 번째에서 찾음");
		} else {
			System.out.println("없음");
		}
	} // end main
}
