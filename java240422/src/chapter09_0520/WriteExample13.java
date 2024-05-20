package chapter09_0520;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample13 {

	public static void main(String[] args) throws Exception {
//		Writer : 문자 단위 출력을 위한 최상위 스트림 클래스
//		FileWriter : 문자 단위 출력을 위한 하위 스트림 클래스
		Writer writer = new FileWriter("D:/output13.txt"); //upcasting
		//문자열을 문자 하나씩 배열로 가져온다.
		char[] data = "홍길동3".toCharArray();
//		writer.write(data);
		writer.write(data,1,2); //길동 : "홍길동3"에서 인덱스 1번에서 2자를 읽어서 파일로 저장
		
		writer.close();
	}
}

