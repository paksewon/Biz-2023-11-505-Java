package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;

public class ListA {
	public static void main(String[] args) {
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		ScoreDto scoreDto = new ScoreDto();
		
		// 어떤 값을 문자열로 바꿔주는 
		System.out.println(scores.toString());
		System.out.println(scoreDto.toString());
		
		for(int i = 0; i <10; i++) {
			scoreDto = new ScoreDto(); // 주소 값을 다 다르게 출력
			scores.add(scoreDto); // scoreDto에 주소를 10번 추가
		}
		System.out.println(scores.toString());
		
	}
}
