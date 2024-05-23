package chapter09_0520;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {

	public static void main(String[] args) throws Exception {
//		Writer : 문자 단위 출력을 위한 최상위 스트림 클래스
//		FileWriter : 문자 단위 출력을 위한 하위 스트림 클래스
		Writer writer = new FileWriter("D:/output14.txt"); //upcasting
		//문자열을 문자 하나씩 배열로 가져온다.
//		char[] data = "홍길동3".toCharArray();
		String data = "안녕 자바 프로그램";
//		writer.write(data);
//		writer.write(data,1,2); //길동 : "홍길동3"에서 인덱스 1번에서 2자를 읽어서 파일로 저장
		writer.write(data,3,2);//자바 : "안녕 자바 프로그램"에서 인덱스 3번에서 2자를 읽어서 파일로 저장
		
		writer.close();
	}
}

