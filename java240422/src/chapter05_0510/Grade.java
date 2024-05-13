package chapter05_0510;

import java.util.Scanner;

public class Grade {
	 int math;
	 int science;
	 int engligh;

	public Grade(int math, int science, int engligh) {
		
		this.math = math;
		this.science = science;
		this.engligh = engligh;
	}
	private int average() {
		return (math+science+engligh)/3;
	}
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int engligh = scanner.nextInt();
		
		Grade me = new Grade(math,science,engligh); //객체생성
		System.out.println("평균은 "+ me.average());	
		scanner.close();
	}
}
