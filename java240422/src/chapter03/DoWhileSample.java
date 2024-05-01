package chapter03;
/*
 * do while문 
 * a~z 알파벳 소문자 출력
 */
public class DoWhileSample {
	public static void main(String[] args) {
		char c='a';
//		char C='A';
		
		do {
			System.out.print(c);
//			유니코드 변환해서 1증가한 유니코드가 문자로 변환해서 변수 c에 저장
//			c=(char)(c+1);
			c += 1; //c=c+1 //자동변환
		} while (c<='z');
//		do {
//			System.out.print(C);
//			C += 1;
//		} while (C<='Z');
	}
}
