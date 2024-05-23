package chapter05_0510;

public class InstanceofExample {
	public static void method1(Parent parent) {
//		Parent parentA = new Child(); => child 객체를 판단
//		instnaceof : 객체가 해당 클래스 타입인지 판단(참/거짓)
		if (parent instanceof Child) {
//			down casting
			Child child = (Child) parent;
//			System.out.println("성공");
			System.out.println("method1 - Child 로 변환 성공");
		}else {
			System.out.println("method1 - Child 로 변환 실패");			
		}
		}
		public static void method2(Parent parent) {
			Child child = (Child)parent;
			System.out.println("method2 - Child 로 변환 성공");
	}
	public static void main(String[] args) {
//		upcasting
		Parent parentA = new Child();
		method1(parentA);//성공
		method2(parentA);//성공
		
		Parent parentB = new Parent();
		method1(parentB);//실패
//		method2(parentB);//예외발생

		Parent parentC = new Parent();
//		위의 메소드 호출과 동일(오류가 없는 것 같은데 실행시 발생)
		Child child = (Child) parentC;//예외 발생(강제변환)
	}
}
