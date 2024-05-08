package javarlch;
//변수와 파라미터는 자신만의 활동영역(scope,스코프)을 갖는다.
public class SquareChange {
	
	public static void printSquare(int x) {
		System.out.println("printSquare x = "+x);
		x = x*x;
		System.out.println("printSquare x = "+x);
	}
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println("main x = "+x);
		printSquare(x);
		System.out.println("main x = "+x);
	}
}
//main x = 5
//printSquare x = 5
//printSquare x = 25
//main x = 5
