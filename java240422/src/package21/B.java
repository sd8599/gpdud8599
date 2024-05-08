package package21;
//
public class B {
	public B() {
		A a = new A();
		a .filed1 = 2;
		a .filed2 = 2;
//		private 멤버는 자기 클래스 안에서만 접근됨
//		a .filed3 = 2;
		
		a.method1();
		a.method2();
//		private 멤버는 자기 클래스 안에서만 접근됨
//		a.method3();
	}
	
}
