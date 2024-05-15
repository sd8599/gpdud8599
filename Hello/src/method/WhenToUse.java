package method;
//메소드가 필요한 이유
public class WhenToUse {
	public static int getPower(int number) {
		return getPower(number, 2);
	}
	
	public static int getPower(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getPower(2,2));
		
		System.out.println(getPower(3,3));
		
		System.out.println(getPower(4,2));
	}
}
