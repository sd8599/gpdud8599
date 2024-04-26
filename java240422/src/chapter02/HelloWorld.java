package chapter02;

/*
 * 작성일 : 2024-04-23
 * 작성자 : 차혜영
 * 내용 : HelloWorld 클래스로 문자열 출력
*/
public class HelloWorld {
public static void main(String[] args) {
	//message : 변수(명)
//	String : 문자열 타입
//	String message;  //변수선언		
//	String message="가나다라";// 변수값 할당(변수 초기화)
//	String message ="헬로 월드!";// 변수값 할당(변수 초기화)
	String message  ="가나다라";// 변수값 할당(변수 초기화)
	String copy =message;
	System.out.println(message);	
 System.out.println(message);	
copy = copy+"마바사";
System.out.println(copy);	
}
}