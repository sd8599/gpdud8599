package middle;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10~99사이의 정수를 입력하세요>>");
		int num = sc.nextInt(); 
		int a = num/10;
		int b = num%10;
		int count = 0;
		
		if (a%3==0) {
			count++;
		}
		if(b%3==0&&b!=0) {
			count++;
		}
		
		if(count==1) {
			System.out.println("박수짝");
		}else if (count==2) {
			System.out.println("박수짝짝");
		}else {
			System.out.println("박수없음");
		}sc.close();
	}
}
//		잘기억하기
//		if (num/10%3==0) {
//			count++;
//		}
//		if(num%10%3==0&&b!=0) {
//			count++;
//		}
//		