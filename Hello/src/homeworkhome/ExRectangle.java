package homeworkhome;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로, 세로 길이를 입력하세요>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
	
		System.out.println("사각형의 면적은 "+(x*y)+"입니다.");
	}
}
