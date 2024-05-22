package chapter13;

import java.util.function.Supplier;

public class InstanceMethod {
	//Supplier 인터페이스는 매개변수는 없고, 반환값만 있음
	//Supplier<Integer> f = () -> s.length();
	static void print(Supplier<Integer>f) { 
		System.out.println(f.get());
	}
	public static void main(String[] args) {
		String s = "Hello World!";
		System.out.println(s.length());
		//람다식
		print(() -> s.length());
		//메소드 참조
		print(s::length);
	}
}
