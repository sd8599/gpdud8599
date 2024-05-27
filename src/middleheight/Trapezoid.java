package middleheight;

import java.util.Scanner;

public class Trapezoid {
	private int down;
	private int up;
	private int height;
	
	public Trapezoid(int down, int up, int height) {
		super();
		this.down = down;
		this.up = up;
		this.height = height;
	}
	public double getArea() {
		double area = (down+up)*height/2.0;
		 return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		int down = sc.nextInt();
		int up = sc.nextInt();
		int height = sc.nextInt();
		
		Trapezoid trapezoid = new Trapezoid(down, up, height);
		System.out.println("사다리꼴의 면적은 "+trapezoid.getArea());
		sc.close();
	}
}
