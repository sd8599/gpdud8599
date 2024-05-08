package package2;

//다른패키지에 클래스는 import해서 사용
import package1.A;
import package1.B;

public class C {
//	default 접근 지정자는 다른 패키지에서 접근시 오류
	A a;
	B b;
}
