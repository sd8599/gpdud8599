package chater06_0513;

import java.util.Scanner;

public class Trapezoid {
	
		int down;
		int up;
		int height;
		//계산메소드
	
		public double getArea() {
			return 0.5*(down+up)*height; //0.5*(아랫변+윗변)*높이
		}
		
		public static void main(String[] args) {
		
		Trapezoid tra = new Trapezoid(); //객체 생성->생성자 호출 (기본생성자 만들어서 호출<-컴파일러)
			
		Scanner sc = new Scanner(System.in);
		System.out.print(">>>");
		
		tra.down = sc.nextInt(); //객체로 멤버에 접근
		tra.up = sc.nextInt(); //객체로 멤버에 접근
		tra.height = sc.nextInt(); //객체로 멤버에 접근
		System.out.println("사다리꼴의 면적은 "+tra.getArea());
		sc.close();
	}
}
