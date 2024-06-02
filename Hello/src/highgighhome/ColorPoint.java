package highgighhome;

class Point{
	private int x, y;
	public Point(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) { //값을 옮김
		this.x = x;
		this.y = y;
	}
}
public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//	protected : 자식 메소드에서 사용할 수 있게 만든 기능
	public void setXY(int x, int y) {
		move(x, y);
	}
	@Override
	public String toString() {
		return color+"색의 ("+getX()+", "+getY()+")의 점";
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
//		String str = cp.toString();
		System.out.println(cp.toString()+"입니다."); //이렇게도 가능
	}
}