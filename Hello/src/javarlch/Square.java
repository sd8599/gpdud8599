package javarlch;
//아래 소스코드의 실행과정과 최종결과에 대한 설명을 작성하세요
public class Square {
	
	//메소드,void타입의 메소드,int타입의x파라미터를가지고있음
	public static void printSquare(int x) {
		System.out.println(x*x);
	}
	
	public static void main(String[] args) { //메인메소드,프로그램의 시작점
		int value = 2;
		printSquare(value);  //printSquare(); 호출
		printSquare(3);
		printSquare(value*2);
		
	}
}
////4
//9
//16
