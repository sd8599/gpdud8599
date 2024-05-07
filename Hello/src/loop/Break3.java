package loop;
/*1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
 * 1+2+3... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.
 * 합이 10보다 크면 종료 : i = 5  sum = 15
 */
public class Break3 {
		
		public static void main(String[] args) {
			int sum = 0;
			
			for (int i = 1; ; i++) {	   //i는 for 문에서만 사용가능 
				sum+=i;
				if (sum>10) {
					System.out.println("합이 10보다 크면 종료 : i = "+i+"  sum = "+sum);
					break;
				}
			}
		}
}
