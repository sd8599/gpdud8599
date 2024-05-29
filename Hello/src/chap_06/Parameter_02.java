package chap_06;

public class Parameter_02 {
	//전달값이 있는 메소드
	public static void power(int number) { //number : 전달값, 매개변수, Parameter
		int result = number*number;
		System.out.println(result);
	}
	
	public static void powerByExp(int number, int exponent) {
		int sum = 1;
		for (int i = 0; i < exponent; i++) {
			sum *=number;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		//전달값, Parameter
		
		int n = 4;
		power(n);
		 n = 6;
		power(n);
		//n : 인수, Argument
		
		int nu = 3;
		int ex = 2;
		powerByExp(nu,ex);
	}
}
