package question02;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		
		int dollar = sc.nextInt();
		dollar = dollar*520;
		
		System.out.println("100달러짜리 "+dollar/100+"매");
		if (dollar%100/10!=0) {
		System.out.println("10달러짜리 "+dollar%100/10+"매");
		}sc.close();
	}
}
/*	int tesla = 520;
	int num;
	int money;
	int res;
	
	Scanner sc= new Scanner(System.in);
	System.out.print("매수 수량을 입력하시오>>");
	num = sc.nextInt();
	money = tesla*num;
	res = money/100;
	if(res>0) {
		System.out.println("100달러 짜리 "+res+"매");
	}
	money=money%100;
	res= money/10;
	if(res>0) {
		System.out.println("10달러 짜리 "+res+"매");
	*/
	
	
	
//	1달러=1200
//400000/1200 몫3 몫3
	
	
	
