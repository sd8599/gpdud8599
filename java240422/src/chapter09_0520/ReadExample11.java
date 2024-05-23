package chapter09_0520;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {
	public static void main(String[] args) throws Exception {
		//Reader : 문자 단위 입력을 위한 최상위 스트림 클래스
		//FileReader : 문자 단위 입력을 위한 하위 스트림 클래스
		Reader reader = new FileReader("D:\\test.txt"); //upcasting
		int readData;
		
		while (true) {
			readData = reader.read(); //한개의 문자 단위로 읽는다.
			if (readData == -1) {
				break;
			}
//			System.out.print(readData+" ");//아스키코드
//			aaa
//			bb
//			c
			System.out.print((char)readData);
		}
		reader.close();
	}
}
