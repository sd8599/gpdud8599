package loop;
/*1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?
 * 1+2+3...계속 더하다가 처음으로 합이 10보다 큰경우를 찾으면 된다.
 */
public class Break1 {
		public static void main(String[] args) {
			int sum = 0;
			int i = 1;
			
			while (true) { //while문의 i는 어디서든 사용가능함
				sum+=i;
				if (sum>10) {
					System.out.println("합이 10보다 크면 종료 : i = "+i+",  sum = "+sum);
					break;
				}
					i++;
			}
		}
}
/*조건식을 보면 true라고 되어있다. 조건이 항상 참이기 때문에 이렇게 두면 while문은 무한 반복된다.
 * 물론 break문이 있기 때문에 중간에 빠져 나올 수 있다.
 * 만약 sum>10조건을 만족하면 결과를 출력하고, break를 사용해서 while문을 빠져나간다.
 */

