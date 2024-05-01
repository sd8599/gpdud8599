package question02;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("부정행위 여부(true 혹은 false) : ");
		boolean a = sc.nextBoolean();
		System.out.print("출석률(0~100사이의 정수값) : ");
		int b = sc.nextInt();
		System.out.print("총점(0~100사이의 정수값) : ");
		int c = sc.nextInt();
		String d;
		
		if (a) {
			d="F";
		}else if (b<80) {				
			d="F";
		} else {
			if(c>=90) {
			d="A";
		} else if(c>=80) {
			d="B";
		}else if(c>=70) {
			d="C";
		}else if(c>=60) {
			d="D";
		}else {
			d="F";
		}}
			System.out.print("학점 = "+d);
	}
}

