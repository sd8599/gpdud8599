package chapter13;

@FunctionalInterface//추상메소드 1개만 쓰도록 체크
interface MyFuntion5<T>{ //제네릭 타입 T를 가진 함수형 인터페이스
	void print(T x); //추상메소드, T를 매개변수로 받음
//	void print2(); 추상메소드 2개 사용시 컴파일러 오류
}

public class LambdaEx5 {
	public static void main(String[] args) {
		MyFuntion5<String> f1 = (x)->System.out.println(x);
		f1.print("ABC");
		MyFuntion5<Integer> f2 = (x)->System.out.println(x);
		f2.print(Integer.valueOf(100)); //Integer 객체를 람다식에 넘겨준다.
		f2.print(200); //auto boxing
	}
}
