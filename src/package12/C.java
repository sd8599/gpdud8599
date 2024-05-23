package package12;

//다른 패키지에서 접근할 때 import 적용/
import package11.A;

public class C {
	A a1 = new A(true);
//	default 접근지정자는 다른패키지에서 접근불가
//	A a2 = new A(1);
//	private 접근지정자는 접근 안됨(본인 클래스에서만 가능)
//	A a3 = new A("문자열"); 
}
