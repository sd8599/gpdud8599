//메소드
public class Method1 {
	public static void main(String[] args) {
		
		double xx = 3, yy = 4;
		addSubMultDiv(xx, yy);
		
		xx = 10; yy = 2;
		addSubMultDiv(xx, yy);
		
		xx = 7; yy = 5;
		addSubMultDiv(xx, yy);
	}
	//메인 메소드 외부에 선언할 것
	static void addSubMultDiv(double a, double b) {
		System.out.printf("%f + %f = %f%n", a, b, a+b);
		System.out.printf("%f-%f = %f%n", a, b, a-b);
		System.out.printf("%f*%f = %f%n", a, b, a*b);
		System.out.printf("%f/%f = %f%n", a, b, a/b);
	}
}
/*3.000000 + 4.000000 = 7.000000
3.000000-4.000000 = -1.000000
3.000000*4.000000 = 12.000000
3.000000/4.000000 = 0.750000
10.000000 + 2.000000 = 12.000000
10.000000-2.000000 = 8.000000
10.000000*2.000000 = 20.000000
10.000000/2.000000 = 5.000000
7.000000 + 5.000000 = 12.000000
7.000000-5.000000 = 2.000000
7.000000*5.000000 = 35.000000
7.000000/5.000000 = 1.400000
출력
 */
