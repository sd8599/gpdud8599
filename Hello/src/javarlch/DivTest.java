package javarlch;

public class DivTest {
	public static void main(String[] args) {
		double a = 5.0/2.0; //2.5로출력
		System.out.println("a = "+a);

		int b = 4/2; //2로출력
		System.out.println("b = "+b);

		int c = 5/2; //2.5출력이 맞지만 int 타입이라 소수점은 생략되어 2로출력
				System.out.println("c = "+c);
		
		double d = 5/2; //double타입이지만 계산을 정수(int)로 해서 소수점이 생략되어 2.0으로출력
		System.out.println("d = "+d);
	}
}
//a = 2.5
//b = 2
//c = 2
//d = 2.0
