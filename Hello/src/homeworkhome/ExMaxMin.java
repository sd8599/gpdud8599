package homeworkhome;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = 0;
		int max = 0;
		
		if (a<b&&a<c) {
			min = a;
		} else if(b<a&&b<c){
			min = b;
		}else {
			min = c;
		}
		
		
		if (a<c&&b<c) {
			max = c;
		} else if(a<b&&c<b){
			max = b;
		}else {
			max = a;
		}
		System.out.println("최대값은 "+max);
		System.out.println("최소값은 "+min);
	}
}
