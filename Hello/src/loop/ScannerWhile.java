package loop;

import java.util.Scanner;

public class ScannerWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>> ");
		String tmp = sc.next();
		int num = Integer.parseInt(tmp);
		int sum = 0;
		
		while (num != 0) {//num>0도가능
			//num을 10으로 나눈 나머지를 sum에 더함
			sum+=num%10; //sum = sum+num%10
			System.out.println("sum = "+sum+" num = "+num);
			num /= 10; //num = num/10
		}
		System.out.println("각 자리 수의 합 : "+sum);
	}
}
