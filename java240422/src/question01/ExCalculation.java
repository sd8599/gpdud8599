package question01;
//class Aaa
//class Baa
//class는 여러개 이상 존재 가능
import java.util.Scanner;
//public class : 자바파일안에 두개이상 존재시 오류
//1. JVM이 수많은 class에서 public class를 찾아감
public class ExCalculation {
	//method 여러개 사용해도 무관
	public static void aaa() {}
	public static void bbb() {}
	//JVM이 수많은 method에서 main 메소드를 찾아감
	public static void main(String[] args) {
		
		System.out.print("2개의 실수 입력 >>");
		
		Scanner sc = new Scanner(System.in);
		//float도 가능
		//nextFloat():실수를 받는 메소드
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		//문자열로 더하니깐 괄호를 사용해서 미리 덧셈을 연산
		System.out.println("두 수의 덧셈은 "+(a+b));
		System.out.println("두 수의 뺄셈은 "+(a-b));
		System.out.println("두 수의 곱셈은 "+(a*b));
		System.out.println("두 수의 나눗셈은 "+(a/b));
		
		sc.close();
	}
}
