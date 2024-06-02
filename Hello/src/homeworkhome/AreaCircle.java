package homeworkhome;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요>>");
		int r = sc.nextInt();
		
		double radius = 3.14;
		System.out.println("원의 면적은 "+r*radius*r+"입니다.");
	}
}
