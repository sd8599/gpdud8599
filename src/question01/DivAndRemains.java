package question01;

import java.util.Scanner;

public class DivAndRemains {
 public static void main(String[] args) {
	System.out.print("2자리수 정수 입력(10~99)>>");
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	/*
	 * int ten = n/10;  10의 자리 나누기10을해서몫
	 * int one = n%10;  1의 자리 나누기 10을해서나머지
	 * if(ten==one)
	 * System.out.println("Yes!10의 자리와 1의 자리가 같습니다.");
	 */
	
	if (a%11==0) {
		System.out.println("Yes!10의 자리와 1의 자리가 같습니다.");
	} else {
		System.out.println("No!10의 자리와 1의 자리가 다릅니다.");
	}
	sc.close();
}
}
