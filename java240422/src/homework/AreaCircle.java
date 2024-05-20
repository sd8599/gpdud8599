package homework;

import java.util.Scanner;

/* Scanner 클래스를 이용하여 반지름을 입력받아원의면
적출력하는프로그램을작성하라
 *  원주율=3.14로 가정하고 계산하라
 *  반지름을입력하세요>>10
  원의면적은314.0입니다
 */
public class AreaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요>>");
		int r = sc.nextInt();
		double s = 3.14;
		double sr = r*s*r;
		
		System.out.println("원의 면적은 "+sr+"입니다.");
	}
}
