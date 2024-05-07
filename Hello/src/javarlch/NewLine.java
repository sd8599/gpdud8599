package javarlch;
//메소드 분석 및 실행
public class NewLine {
	public static void threeLines() {
		System.out.println(" 1");//2.
		System.out.println("  2");//3.
		System.out.println("   3");//4.
	}
	
	public static void main(String[] args) {
		System.out.println("Line 1"); //1.
		threeLines();//1.호출,4.에서 다시돌아와서
		System.out.println("Line 2");//5.호출,끝
	}
}
//Line 1
//1
// 2
//  3
//Line 2
