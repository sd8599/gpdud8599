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

//중급B 8 학생의 부정행위여부, 출석률과총점을
//입력받아학점을부여한다(CalculateGrade)
// 1
//  (1)
//  1.
//  2.
//  3.
//  4.
//  (2)
//  1.
//  2.
//  3.
//  4.
// 
//변수들
//cheating: 부정행위 여부
//attendrate: 출석률
//totalscore: 총점
//grade: 학점
//알고리즘
//부정행위여부(true 혹은 false): false
//출석률(0~ 100사이의 정수값): 80
//총점(0~ 100사이의 정수값): 90
//학점= A
//부정행위여부를입력받아cheating에 저장한다.
//출석률을입력받아attendrate에 저장한다.
//총점을입력totalscore에 저장한다
//cheating이 true라면 grade = ‘F’ 이다.
//  아니면attendrate < 80 이면 grade = 'F'
//아니면
//
// 
// 
// 
// 
//  5.
// totalscore >= 90이면 grade = 'A'
//아니고totalscore >= 80 이면 grade = 'B'
//아니고totalscore >= 70 이면 grade = 'C'
//아니고totalscore >= 60 이면 grade = 'D'
//아니고grade = 'F';
//학점을출력한다
