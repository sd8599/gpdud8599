package scope;

public class VariableScope {
	
	public static void methodA(int number) {
		//System.out.println(number);
		//System.out.println(result);
	}
	
	public static void methodB() {
		int result = 1; //지역변수 : 중괄호 안에서만 사용가능
	}
	
	public static void main(String[] args) {
		int number = 3;
		
		//System.out.println(result);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
		{
			int j = 0;
			System.out.println(j);
			System.out.println(number);
		}
//			System.out.println(j);
	}
}
