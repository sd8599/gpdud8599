package method;
//메소드 오버로딩 : 이름이 같은 메소드를 여러개 만드는 것
/*1. 전달값의 타입이 다르거나
 * 2. 전달값의 갯수가 다르거나
 */
public class Overloading {
	public static int getPower(int number) {
		int result = number*number;
		return result;
		//return = number*number;
	}
	public static int getPower(String strnumber) {
		int number = Integer.parseInt(strnumber);
		return number*number;
	}
	
	public static int getPower(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}return result;
	}
	public static int getPower(String strnumber, String strexponent) {
		int result = 1;
		int number = Integer.parseInt(strnumber);
		int exponent = Integer.parseInt(strnumber);
		for (int i = 0; i < exponent; i++) {
			result = number*exponent;
		}return result;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(getPower(3));
		System.out.println(getPower("4"));
	
		System.out.println(getPower(2, 3));
		System.out.println(getPower("3","2"));
	}
}
