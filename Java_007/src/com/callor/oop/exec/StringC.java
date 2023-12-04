package com.callor.oop.exec;

/*
 * "src/com/callor/oop/exec/data.txt" 파일을 open
 *  scanner 와 연결하기
 *  data.txt 파일을 한 라인씩 읽어 와서 문자열 변수에 할당하기
 *  읽어온 문자열을 컴마(,)로 분해하여 문자열 배열로 만들기
 *  
 *  문자열 배열에서 7과목 점수를 정수로 변환하여
 *  총점을 계산한후 출력하기
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.oop.util.Line;

public class StringC {

	public static void main(String[] args) {

		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null;

		/*
		 * ...data.txt 파일을 읽어서 무언가 처리를 하려고 한다 Java 에서 파일을 읽어서 무언가 처리를 하려면 먼저 파일을 open 해야
		 * 한다 이때 파일을 open 하는 도구 중에 FileInputStream 이라는 도구를 사용할 것이다
		 * 
		 * 그런데, 파일을 open 하는 과정에서 어떠한 이유로 든지 Open 하고자 하는 파일이 없을 수 있다. 갑자기 사라질수 있다 때문에
		 * Java 에서는 파일을 open 하는 명령(도구)를 사용하는 코드에서는 반드시 try..catch 를 사용하여 exception 예방을
		 * 하도록 강제 하고 있다
		 */
		try {
			is = new FileInputStream(dataFile); // << try 로 반드시 쓰기
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// open 한 data.txt 파일에 대한 정보(연결)을 Scanner 와
		// 연결 해주기
		scan = new Scanner(is);

		while (scan.hasNext()) { // has = 값을 가지고 있냐
			String line = scan.nextLine();
			String[] result = line.split(",");
			for (int i = 0; i < result.length; i++) {
				System.out.printf("%s  ", result[i]);
			}
			int sum = 0;
			for (int i = 0; i < result.length; i++) {
				sum += Integer.valueOf(result[i]);
			}
			System.out.println("총점 : " + sum);
		}
		scan.close(); // 파일은 scan.close를 해주자

	}
}
