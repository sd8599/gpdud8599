package javarlch;
//문자열을 숫자로 변환하여 코드를 실행하세요
public class String2Int {
	public static void main(String[] args) {
		
//		int seven = "7"; //int=String->대입이안됨
//		double pi = "3.14";
																	//"7" 넣어도됨
		int seven = Integer.parseInt(args[0]);
		System.out.println("seven = "+seven);

		double pi = Double.parseDouble(args[1]);
				System.out.println("pi = "+pi);
	}
}
