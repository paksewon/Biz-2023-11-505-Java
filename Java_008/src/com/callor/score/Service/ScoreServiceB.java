package com.callor.score.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * 생성자 method 를 선언하고, Scanner 를 통하여 
 * data.txt 파일을 열어 데이터를 읽을 준비를 하는 코드를 작성
 */
import java.util.Scanner;
import java.util.Vector;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreServiceB {

	private Scanner scan = null;
	private List<ScoreDto> scores = null; // 리스트라는 도구를 이용해서 배열 대신 쓴다
//	private List<Integer> nums = null; // 처음에는 배열에 갯수 0이다

	/*
	 * ScoreServiceB 클래스의 생성자 method 어떤 도구들을 (미리) 준비하는 일을 수행한다
	 */
	public ScoreServiceB(String dataFile) {
//		String dataFile = "src/com/callor/score/Service/data.txt";
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);

		/*
		 * item(요소) 개수 0인 상태의 List 가 준비된다
		 */

		// 자바 리스트 도구들
		scores = new ArrayList<>();
//		scores = new LinkedList<>();
//		scores = new Vector<>();

	} // end 생성자 메소드

	public void loadScores() {
		while (scan.hasNext()) {
			String line = scan.nextLine();
//			System.out.println(line);

			String[] lines = line.split(",");
			ScoreDto scoreDto = new ScoreDto();
			try { //오류 캐치하기
				scoreDto.stdNum = lines[0];
				scoreDto.kor = Integer.valueOf(lines[1]);
				scoreDto.eng = Integer.valueOf(lines[2]);
				scoreDto.math = Integer.valueOf(lines[3]);
				scoreDto.music = Integer.valueOf(lines[4]);
				scoreDto.art = Integer.valueOf(lines[5]);
				scoreDto.sw = Integer.valueOf(lines[6]);
				scoreDto.db = Integer.valueOf(lines[7]);
			} catch (Exception e) {
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}

			// List type 의 데이터 목록에
			// ScoreDto 요소를 추가하기
			// List type 의 데이터 맨 끝에 추가된다
			scores.add(scoreDto); // 추가하기

		} // end while

	}// end loadScore()

	public void countScore() {
		System.out.println(scores.size());
	}

	public void printScore() {
		Line.dLine(100);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.sLine(100);

		for (int i = 0; i < scores.size(); i++) {
			ScoreDto scoreDto = scores.get(i); // size[i]가 아니라 add 는 get 을 쓴다

			System.out.printf("%s\t", scoreDto.stdNum);
			System.out.printf("%3d\t", scoreDto.kor);
			System.out.printf("%3d\t", scoreDto.eng);
			System.out.printf("%3d\t", scoreDto.math);

			System.out.printf("%3d\t", scoreDto.getTotal());
			System.out.printf("%5.2f\n", scoreDto.getAvg());

		}

	}// end printScore()
}
