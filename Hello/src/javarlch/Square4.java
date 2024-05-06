package javarlch;
//실행흐름을 분석하라
public class Square4 {
	//double 타입의 square 메소드
	//파라미터 : double x
	//x*x를 반환
	public static double Square(double x) { //x=5.0자동변환
		return x*x;
	}
	//main : 메소드, 프로그램의 시작점
	public static void main(String[] args) {
		System.out.println(Square(5)); //메소드 호출
		System.out.println(Square(2));
	}
}
