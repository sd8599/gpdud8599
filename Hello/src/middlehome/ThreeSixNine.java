package middlehome;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력하시오>>");
		int number = sc.nextInt();
		int count = 0;
		int numten = number/10;
		int numone = number%10;
		
			if (numten%3==0) {
				count++;
			}if (numone%3==0&&numone!=0) {
				count++;
			}
			
			if (count==1) {
				System.out.println("박수짝");
			}else if (count==2) {
				System.out.println("박수짝짝");
			}else {
				System.out.println("박수없음");
			}
		sc.close();
	}
}
