package middle;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("매수금액을 입력하세요 : ");
		int stock = sc.nextInt(); //매수
		System.out.print("매도금액을 입력하세요 : ");
		int global = sc.nextInt(); //매도
		double exstock = 0; //양도세
		
		if (stock<global) {
			exstock = (global-stock)*0.22;
		}else if (stock>=global) {
			exstock = 0;
		}
		System.out.println("양도세 = "+exstock);
	}
}
