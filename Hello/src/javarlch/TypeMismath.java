package javarlch;

public class TypeMismath {
	public static void main(String[] args) {
		
		//값을 대입시 타입이 다르면 프로그램이 동작하지 않는다.
		//주어진 코드가 동작 할 수 있도록 소스코드를 변경하세요.
		
//		String five = 5; String <=int 변환X
//		타입 불일치의 문제는 타입을 같게 하여 해결한다.
		//int or String 으로 통일하기
//		int five = 5; 이나
		String five = ""+5; //문자연결이므로 문자열나열이된다. 
		System.out.println(five);
	}
}
