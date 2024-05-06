package casting;
/*형변환
 * 작은 범위에서 큰 범위에 값을 대입하는 다음 코드를
 * 실행하면 특별한 문제없이 잘 수행된다.
 */
public class Casting1 {
		public static void main(String[] args) {
		
			int intValue = 10;
			long longValue;
			double doubleValue;
			
			longValue = intValue; //int->long
			System.out.println("longValue = "+longValue); //longValue = 10
			
			doubleValue = intValue; //int->double
			System.out.println("doubleValue1 = "+doubleValue); //doubleValue = 10.0
			
			doubleValue = 20L; //long->double
			System.out.println("doubleValue2 = "+doubleValue); //doubleValue = 20.0
	}
}
