package chapter09_0520;

import java.io.FileOutputStream;
import java.io.OutputStream;

//ctrl shfit o : import 안쓰는 것 한번에 삭제

public class WriteExample3 {
	
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("d:/output3.txt");//upcasting
		byte[] data = "DEF".getBytes();
//		os.write(data);
		os.write(data,1,2); //EF : 인덱스 1에서 2글자
		os.flush(); //인터넷이 불안정한 상태에서 네트워크 끊겼을 때 전송되지 못한 데이터를 보낸다.
		
		os.close();
	}
}
