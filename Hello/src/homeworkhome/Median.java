package homeworkhome;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int middle = 0;
		
		if (two<one&&one<three) {
			middle = one;
		}else if (one<two&&two<three) {
			middle = two;
		}else {
			middle = three;
		}
		System.out.println("중간 값은 "+middle);
		sc.close();
	}
}
