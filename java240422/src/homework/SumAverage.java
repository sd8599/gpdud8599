package homework;
//
import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int input = 0;
		int sum = 0;
		int count = 0;
		int average = 0;
		
		while(true){
			System.out.print("정수를 입력하세요 : ");
			int input = sc.nextInt();
			if (input==0) {
				break;
			}
			sum += input;
			count++;
			average = sum/count;
		}
		System.out.println("합계는 "+sum+"입니다. 평균은 "+average+"입니다.");
	}
}
/*정수값을 연속해서 입력받아 합계와 평균을 구하는 프로그램을 작성하세요.
 * Scaaner클래스를 이용하여 키보드로 값을 입력받아 처리한다.
 * 입력된 숫자가 0일 경우 프로그램이 종료된다.
 * 0을 제외한 입력된 모든 값들의 합계와 평균을 구하여 출력한다.
*/
 