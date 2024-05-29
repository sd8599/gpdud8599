package chap_06;

public class Method_01 {
	public static void sayHello() {
		//메소드 정의
		System.out.println("안녕하세요? 메소드입니다.");
	}
	
	public static void main(String[] args) {
		//메소드 : 어떤 기능을 하는 묶음, 함수
		
		//메소드 호출
		System.out.println("메소드 호출 전");
		sayHello();
		System.out.println("메소드 호출 후");
	}
}
