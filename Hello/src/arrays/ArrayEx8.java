package arrays;

import java.util.Scanner;

/*2차원 배열1-2
 * 사용자로부터 학생 4명의 국어, 수학, 영어 점수를 입력받아 각 학생의
 * 총점과 평균을 계산하는 프로그램을 작성하자
 * 2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
 * 이전 문제에서 학생수를 입력 받도록 개선하자.
 */
public class ArrayEx8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요");
		int count = sc.nextInt();

		int[][] score = new int[count][3];
		String[] subject = {"국어","영어","수학"};
		
		for (int i = 0; i <count; i++) {
			System.out.println(i+1+"번 학생의 성적을 입력하세요");
			for (int j = 0; j < 3; j++) {
			System.out.print(subject[j]+" 점수 : ");
			score[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < count; i++) {
			int total = 0;
			for (int j = 0; j < 3; j++) {
				total+=score[i][j];
			}
			double average = total/3.0;
			System.out.println(i+1+"번 학생의 총점 : "+total+ ", 평균 : "+average);
		}
	}
}
