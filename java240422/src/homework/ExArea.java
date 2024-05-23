package homework;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	for (int i = 0; i < 2; i++) {
			System.out.print("정수를 입력하시오>>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			double aa = (a*b)/2;
			double bb = (a+b)*c/2;
			
			if (c==0) {
				System.out.println("삼각형의 넓이는 "+aa); //(밑변*높이)/2				
			}else {
				System.out.println("사다리꼴의 넓이는 "+bb); //(아랫변+윗변)*높이/2				
			}
	}
	}
}
