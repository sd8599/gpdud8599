package chapter13;

interface MyFuntion2{
	int calc(int x); //추상메소드 함수형 인터페이스
}

public class LambdaEx2 {
	public static void main(String[] args) {
		MyFuntion2 square = x -> x*x;
		System.out.println(square.calc(3));
	}
}
