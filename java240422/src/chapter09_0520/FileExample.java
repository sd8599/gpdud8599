package chapter09_0520;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
//		File dir = new File("d:/aaa");
		File dir = new File("d:/aaa/bbb");//하위 디렉토리 포함
		File file1 = new File("d:/aaa/file1.txt");//파일
		File file2 = new File("d:/aaa/file2.txt");//파일
		File file3 = new File("d:/aaa/file3.txt");//파일
//		File file4 = new File("d:/aaa/bbb/file3.txt");//파일
		
//		dir.createNewFile(); //파일만들기
//		dir.mkdir();//디렉토리(폴더) 만들기
		dir.mkdirs();//하위 디렉토리(폴더)까지 같이 만들기
		file1.createNewFile();//파일만들기
		file2.createNewFile();//파일만들기
		file3.createNewFile();//파일만들기
		
		File test = new File("d:/aaa"); //디렉토리 정보를 가지고 test 객체 생성(import를 만들어서 객체생성 가능)
		File[] contents = test.listFiles(); //디렉토리 정보를 가지고 온다.(하위 디렉토리들+파일들)
		System.out.println("날짜           시간        형태            크기      이름");
		System.out.println("===================================================================");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh : mm"); //년월일 오전/오후 시분
		
//		contents[i].getName();//디렉토리나 파일 이름
		for (int i = 0; i < contents.length; i++) {
//			1716170855361 : 1970년1월1일 기준으로 오늘까지의 milisesc(1/1000초)로 계산된 값(long type)
//			System.out.print(contents[i].lastModified());//마지막생성일자
//			System.out.print(new Date(contents[i].lastModified()));//마지막생성일자
			System.out.print(sdf.format(new Date(contents[i].lastModified())));//마지막생성일자

			if (contents[i].isDirectory()) { //디렉토리이면 참
			System.out.println("\t<DIR>\t\t"+contents[i].getName());
			} else {
				System.out.println("\t\t\t"+contents[i].length()+"\t"+contents[i].getName());				
			}
		}
	}
}






