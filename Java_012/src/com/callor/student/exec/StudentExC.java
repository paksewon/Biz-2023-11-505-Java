package com.callor.student.exec;

import com.callor.student.models.StdIndex;

public class StudentExC {
	public static void main(String[] args) {
		System.out.println(StdIndex.학번.getIndex());
		System.out.println(StdIndex.이름.getIndex());
		
		// StdIdex enum 에 선언된 요소들을 배열로 변환
		// indexArray 배열에 복사하라
		StdIndex[] indexArray = StdIndex.values();
		
		for(int i = 0 ; i < indexArray.length ; i++) {}
		for(StdIndex item : indexArray) { // 뒤에는 배열 앞에는 배열 요소, item 각 요소의 이름을 가지고 있는 객체
			System.out.printf("%d, %s\n", item.getIndex(), item);
		}
	}
}
