package question01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>> ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int median=0;
	
		if ((a>b && a<c) || (a>c && a<b)) {
			median=a;
		}else if ((a<b && b<c) || (b>c && a>b)) {
			median=b;
		}else {
			median=c;
		}
		System.out.println("중간 값은 "+median);
		sc.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(a<c<b) {
//			System.out.println("중간 값은 "+c);
//		}else if(a<b<c){ 
//			System.out.println("중간 값은 "+b);
//		}else{
//			System.out.println("중간 값은 "+a);
//		}
//		sc.close();
//	}
//}
