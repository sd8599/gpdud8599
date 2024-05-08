package loop;
/*누적합계산
 * 반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성하세요.
 * 이때, sum이라는 변수를 사용하여 누적합을 표현하고, i라는 변수를 사용하여 
 * 카운트(1부터 max까지 증가하는 변수)를 수행하여야 합니다.
 * while문, for문 2가지 버전의 정답을 만들어야 합니다.
 * max = 100 5050
 */
public class ForEx3 {
		public static void main(String[] args) {
			
			int max = 100;
			int sum = 0;
			
			for (int i = 1; i <=max; i++) {
				sum+=i;
			}
			System.out.println("max = "+max+" "+sum);
		}
}
