package chapter13;

interface Myfuntion3{
	void print(); //추상메소드 매개변수X
}

public class LambdaEx3 {
	public static void main(String[] args) {
		Myfuntion3 f = () -> {System.out.println("Hello");}; //출력X, 람다식 작성
		f.print(); // Hello 출력, 람다식 호출 (람다식 객체에서 print 메소드 호출)
		
		f = () -> {System.out.println("안녕");}; //출력X, 람다식 재작성
		f.print();
	}
}
