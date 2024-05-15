package method;
//전달값, parameter
public class Parameter {
		public static void parameter(int number) { //parameter, 매개변수, 전달값
			int result = number*number;
			System.out.println(number+ "의 2승은 "+ result);
		}
		
		public static void powerby(int number, int exponent) {
			int result = 1;
			for (int i = 0; i < exponent; i++) {
				result *= number;
			}
			System.out.println(number+"의 "+exponent+"승은 "+result);
		}
		
		
	public static void main(String[] args) {
	// number의 2승 수 구하기
		parameter(2);
		parameter(3);
		powerby(2, 3);
		powerby(3, 3);
		powerby(10, 0);
	}
}
