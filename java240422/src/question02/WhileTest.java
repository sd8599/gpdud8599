package question02;

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0, i = 0;
	
		while (i<100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		}
	}
////  while 을 이용하여 0부터 시작하여 99까지의 짝수들의
//합을계산하라.
// *.출력
// 2450