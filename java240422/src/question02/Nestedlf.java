package question02;

import java.util.Scanner;

public class Nestedlf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("점수를 입력하세요(0점~100점) : ");
		int score = sc.nextInt();
		
		System.out.print("학년를 입력하세요(1학년~4학년) : ");
		int grade = sc.nextInt();
		
		if (score>=70 && grade==4) {
			System.out.println("합격!");
		} else if (score>=60 && grade<=3 && grade>=1) {
			System.out.println("합격!");
		} else{
			System.out.println("불합격!");
		}
		sc.close();
	}
}

//
//점수와학년을입력받아60점이상이면합격, 
//미만이면불합격을출력한다. 4학년의경우70점이상이어야합격이다. 
//점수를입력하세요(0~100): 65
//학년을입력하세요(1~4): 4
//불합격!
//
