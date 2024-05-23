package chapter02;

import java.util.Scanner;

/*
 * 시간을 입력 받아서 임금 계산
 */
public class Pay {
	public static void main(String[] args) {
		final int RATE=10000;//1시간임금
		int hour;//시간
		int pay;//1시간 임금을 시간에 곱한값(급여)
		
		System.out.print("시간을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		
		//8시간 이하 : 1시간임금*시간
		//8시간 초과 : 1시간임금*시간*1.5
		if (hour>8) {
//			8시간 까지는 시간당 임금이고, 초과한 시간은 1.5를 곱해서 계산
			pay=(int)(RATE*8+(RATE*(hour-8)*1.5));
		} else {
			pay=hour*RATE;
		}
		System.out.println("급여는 "+pay+"원 입니다.");
		sc.close();
	}
}
