package middleheight;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		
		int principal = 0; //원금
		double rate = 0; //연이율
		double balance = 0; //원리금
		int years = 0; //연도수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원금을 입력하세요.");
		principal = sc.nextInt();
		System.out.print("연이율을 입력하세요.");
		rate = sc.nextDouble();
		System.out.println("연도수=======원리금");
		
		balance = principal;
		
		while (balance<=principal*2) {//balance <=principal*2 : 계속 출력
				years = years +1;
				balance = balance*(1.0+rate/100.0);
				System.out.println(years+"          "+balance);
		}
		System.out.println("필요한 연도수 = "+years);
			sc.close();
		}
	}

