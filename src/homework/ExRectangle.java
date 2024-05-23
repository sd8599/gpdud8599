package homework;

import java.util.Scanner;

/* Scanner 클래스를 이용하여 가로, 세로 길이를 입력받아
사각형의면적출력하는프로그램을작성하라
 *  출력
 *   가로, 세로 길이를입력하세요>>4 5
 *   사각형의면적은20입니다
 */
public class ExRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로, 세로 길이를 입력하세요>>");
		int s = sc.nextInt();
		int r = sc.nextInt();
		int sr = s*r;
		System.out.println("사각형의 면적은 "+sr+"입니다.");
	}
}
