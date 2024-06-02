package homeworkhome;

import java.util.Scanner;

public class Rectangle_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점(x,y)의 좌표를 입력하시오>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
	
		if (100<=x&&x<=200&&100<=y&&y<=200) {
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		}else {
			System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");			
		}
	}
}
