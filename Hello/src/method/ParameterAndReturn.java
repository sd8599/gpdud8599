package method;

public class ParameterAndReturn {
	public static int getPower(int number) {
		int result = number;
		return number*number;
		// return number*number;
	}
	
	public static int  powerBy(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	public static void main(String[] args) {
		//전달값과 반환값이 같이 있는 메소드
		int retVal = getPower(2);
		System.out.println(retVal);

		retVal = getPower(3);
		System.out.println(retVal);
		
		retVal = powerBy(3, 3);
		System.out.println(retVal);

		System.out.println(powerBy(2, 4));
	}
}
