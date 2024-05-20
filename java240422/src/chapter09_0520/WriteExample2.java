package chapter09_0520;

import java.io.FileOutputStream;
import java.io.OutputStream;

//ctrl shfit o : import 안쓰는 것 한번에 삭제

public class WriteExample2 {
	
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("d:/output2.txt");//upcasting
		byte[] data = "DEF".getBytes();
		os.write(data);
		
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}
		os.close();
	}
}
