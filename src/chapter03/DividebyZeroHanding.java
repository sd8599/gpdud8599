package chapter03;

import java.util.Scanner;

public class DividebyZeroHanding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		
		while (true) {	
			System.out.print("분자를 입력하시오 : ");
			dividend = sc.nextInt();
			System.out.print("분모를 입력하시오 : ");
			divisor = sc.nextInt();
			
//			불능일때 정상적인 메세지로 처리
			try {
//			불능이 발생할 수 있는 실행문(오류가 발생가능성이 있는 실행문)				
				System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
				break;
				//오류 발생시 처리(try에서 발생시)
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		  }
		
		sc.close();
	}

}
