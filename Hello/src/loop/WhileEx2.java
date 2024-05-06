package loop;
/*짝수 출력
 * 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해보세요.
 * 이떄, num이라는 변수를 사용하여 수를 표현해야 합니다.
 * while문, for문 2가지 버전의 정답을 만드세요.
 */
public class WhileEx2 {
		public static void main(String[] args) {
				
			int num = 2;
			int count = 1;
			
			while (count<=10) {
				System.out.println(num);
					num+=2;
					count++;
			}
		}
}
