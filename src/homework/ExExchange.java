package homework;

import java.util.Scanner;

public class ExExchange {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double dollar = 1200;
	double euro = 1500;
	int won = 0;
	String de = "";
	
	while (true) {
	System.out.print("원화를 입력하세요(단위 원),0을 누르면 종료>>");
	won = sc.nextInt();
	if(won==0){
		System.out.println("프로그램을 종료합니다.");
		break;
	}
	System.out.print("단위를 입력하세요(dollar,eue)>>");
	de = sc.next();
	
	if (de.equals("dollar")) {
		System.out.println(won+"원은 $"+won/dollar+"입니다.");
	} else if(de.equals("eue")){
		System.out.println(won+"원은 E"+won/euro+"입니다.");
	}else {
		System.out.println("잘못입력하셨습니다.");
	}
 	}sc.close();
 }
}

