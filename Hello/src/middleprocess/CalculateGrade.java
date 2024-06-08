package middleprocess;

import java.util.Scanner;

public class CalculateGrade {
	private boolean cheating;
	private int attendrate;
	private int totalscore;
	private String grade;
	
	public void process() {
		if (cheating==true) {
			grade ="F";
		} else if (attendrate<80){
				grade ="F";				
			} else {
				if (totalscore>=90) {
					grade="A";
				} else if (totalscore>=80) {
					grade="B";
				} else if (totalscore>=70) {
					grade="C";
				} else if (totalscore>=60) {
					grade="D";
				}	else {
					grade="F";					
				}
			}
		}
	
	public boolean isCheating() {
		return cheating;
	}

	public void setCheating(boolean cheating) {
		this.cheating = cheating;
	}

	public int getAttendrate() {
		return attendrate;
	}

	public void setAttendrate(int attendrate) {
		this.attendrate = attendrate;
	}

	public int getTotalscore() {
		return totalscore;
	}

	public void setTotalscore(int totalscore) {
		this.totalscore = totalscore;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
		
		CalculateGrade calculategrade = new CalculateGrade();
		Scanner sc = new Scanner(System.in);
		System.out.print("부정행위 여부(true 혹은 false) : ");
		calculategrade.setCheating(sc.nextBoolean());
		System.out.print("출석률(0~100 사이의 정수값) :");
		calculategrade.setAttendrate(sc.nextInt());
		System.out.print("총점(0~100사이의 정수값) : ");
		calculategrade.setTotalscore(sc.nextInt());
		calculategrade.process();
		System.out.println("학점"+calculategrade.getGrade());

		sc.close();
	}
}





