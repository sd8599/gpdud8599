package question0502;
//바꾸기
import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		final int 오만원 = 50000;
		final int 만원 = 10000;
		final int 천원 = 1000;
		final int 오백원 = 500;
		final int 백원 = 100;
		final int 오십원 = 50;
		final int 십원 = 10;
		final int 일원 = 1;
		int res, money;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		money = sc.nextInt();
		
		res = money/오만원;
		if (res>0) {
			System.out.println("오만원권 "+res+"매");
		}money = money%오만원;
		res = money/만원;
		if (res>0) {
			System.out.println("만원권 "+res+"매");
		}
		money = money%만원;
		res = money/천원;
		if (res>0) {
			System.out.println("천원권 "+res+"매");
		}
		money = money%천원;
		res = money/오백원;
		if (res>0) {
			System.out.println("오백원권 "+res+"매");
		}
		money = money%오백원;
		res = money/백원;
		if (res>0) {
			System.out.println("백원권 "+res+"매");
		}
		money = money%백원;
		res = money/오십원;
		if (res>0) {
			System.out.println("오십원권 "+res+"매");
		}
		money = money%오십원;
		res = money/십원;
		if (res>0) {
			System.out.println("십원권 "+res+"매");
		}
		money = money%십원;
		res = money/일원;
		if (res>0) {
			System.out.println("일원권 "+res+"매");
		}
	sc.close();
	}
}

//중급C7 : Scanner 와 if 문 연습(ChangeMoney)
//1
// Scanner 클래스를 이용하여 정수로 된돈의액수를입력받아
//오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 
//50원짜리 동전, 10원짜리 동전, 1원짜리 동전각몇개로변환
//되는지출력하라.
// *.출력
// 금액을입력하시오>>65376
// 오만원권1매
// 만원권1매
// 천원권5매
// 백원3개
// 오십원1개
// 십원2개
// 일원6개

