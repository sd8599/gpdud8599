package chapter05_0510;

public class ChildExample {
	public static void main(String[] args) { //JVM실행
		/*Parent클래스에 기본생성자 만들어서 호출하고,
		 * Child클래스에 기본생성자 만들어서 호출
		 */
		//업캐스팅, super class타입으로 sub class 객체 생성
		Parent parent = new Child(); 
		parent.field1 = "data1";
//		upcasting된 객체는 서브클래스 멤버 접근 불가
//		parent.field2 = "data2"; =>오류
		parent.method1();
		parent.method2();
//		upcasting된 객체는 서브클래스 멤버 접근 불가
//		parent.method3(); =>오류
		
		Child child = (Child)parent; //down casting
//		down casting 객체는 서브클래스 멤버 접근가능
		child.filed2 = "yyy";
//		down casting 객체는 서브클래스 멤버 접근가능
		child.method3();
	}
}
