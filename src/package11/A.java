package package11; //0508_2

public class A {
	//래퍼런스 변수 선언 = 객체 생성
	A a1 = new A(true); 
	A a2 = new A(1); 
	A a3 = new A("문자열"); 
	
	//생성자/
	public A(boolean b) {
	}
	//오버로딩 발생
	A(int b) { //default 접근지정자
	}
//	private A(String s) { //private 접근지정자
//	}
//	A(String s) { //default 접근지정자
//	}
	public A(String s) { //default 접근지정자
	}
}
