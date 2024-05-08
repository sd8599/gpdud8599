package javarlch;
//잘못된 파라미터
public class Square2 {
	
//	public static void printSquare(int x) {//x="hello",5.5 ,타입불일치
	public static void printSquare(String x) {//x="hello",5.5 ,타입불일치
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		printSquare("hello");
//		printSquare(5.5);
	}
}
//hello
