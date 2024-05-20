package chapter09_0520;

import java.io.FileOutputStream;
import java.io.OutputStream;

//ctrl shfit o : import 안쓰는 것 한번에 삭제

public class WriteExample1 {
	//FileOutputStream : 바이트 단위 출력을 위한 하위 스트림 클래스
	//FileOutputStream output.txt. 를 가지고 객체 생성한다.
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("d:/output.txt");//upcasting
		//바이트 단위로 문자열을 읽는다.
		byte[] data = "ABC".getBytes();
		
		for (int i = 0; i < data.length; i++) {
			//FileOutputStream 객체에 바이트 배열원소를 넣는다.
			os.write(data[i]);
		}
		os.close();
	}
}
