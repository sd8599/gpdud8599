package question02;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		
		/*
		 * count : 3,6,9의 갯수
		 * num : 입력받는 정수
		 * a : 10의 자리
		 * b : 1의 자리
		 */
		
		
		int count = 0, num, a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10~99사이의 정수를 입력하시오>>");
		
		num = sc.nextInt();
		a = num/10;
		b = num%10;
		
		//3,6,9일때
		if (a%3==0) {
			//카운트증가
			count++;
		}	
			//3,6,9일때
			if (b%3==0&&b!=0) {
				//카운트증가
				count++;
		}
		if (count==2) {
			System.out.println("박수짝짝");
		}else if (count==1) {
			System.out.println("박수짝");
		}else {
			System.out.println("박수없음");
		}sc.close();
	}
}
//
//369 게임을 간단히 작성해보자.
// 10~99까지의 정수를 입력받고정수에3,6,9 중 하나가
//있는경우는“박수짝” 을출력하고두개있는경우는
//“박수짝짝” 을 출력하는 프로그램을작성하라.
// 예를들면, 키보드로입력된수가13인경우“박수짝” 을, 
//36인 경우“박수짝짝” 을 출력하면된다.
// *.출력
// 10~99 사이의 정수를 입력하시오>>36
// 박수짝짝

		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		String c = sc.next();
//		int ab;
//		
//		if (a<=1&&a>0&&b<=0&&b>=9) {
//			if (a!=3||a!=6||a!=9||b!=3||b!=6||b!=9) {
//				c = "박수없음";
//			} else if (a==3||a==6||a==9||b==3||b==6||b==9){
//				c = "박수짝";
//			}
//		} else {
//			c="박수짝짝";
//		}System.out.println(c);
//		 sc.close();