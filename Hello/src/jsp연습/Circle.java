package jsp연습;
/*원의 면적 구하기 */

public class Circle {
	private int radius;
	private double PI;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
	public double process(int radius, double PI) {
		this.radius = radius;
		this.PI = PI;
		return radius*radius*PI;
	}
}