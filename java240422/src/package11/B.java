package package11; //0508_2

public class B {
	A a1 = new A(true); //객체생성, 생성자 호출
	A a2 = new A(1);
//	private 접근지정자는 접근 안됨(본인 클래스만 접근됨)
//	default접근지정자는 접근됨(같은패키지)
	A a3 = new A("문자열"); 
}


//패키지 이름 변경
//패키지 누르고 F2 변경/
