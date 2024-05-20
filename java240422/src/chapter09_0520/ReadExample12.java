package chapter09_0520;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
		//Reader : 문자 단위 입력을 위한 최상위 스트림 클래스
		//FileReader : 문자 단위 입력을 위한 하위 스트림 클래스
		Reader reader = new FileReader("D:\\test.txt"); //upcasting
		int readData;
		char[] cbuf = new char[2];
		String data = "";
		
		while (true) {
//			readData = reader.read(); //한개의 문자 단위로 읽는다. ex>호미
			readData = reader.read(cbuf); //2개의 문자 단위로 읽는다. ex>삽
			if (readData == -1) {
				break;
			}
//			System.out.print(readData+" ");//아스키코드
//			aaa
//			bb
//			c
//			System.out.print((char)readData); 
			//2개의 문자로 0번째 인덱스부터 readData만큼 읽어서 data 문자열에 누적
			data+= new String(cbuf, 0, readData);
		}
//		aaa
//		bb
//		c
		System.out.print(data);
		reader.close();
	}
}
