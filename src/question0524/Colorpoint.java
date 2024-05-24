package question0524;

class Point {
	private int x,y;

	public Point(int x, int y) {	this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}}

public class Colorpoint extends Point {
	
	 String color;

	public Colorpoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x, y);
		}
		public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return color+"색의 (" + getX()+","+getY()+ ")의 점";
	}

	public static void main(String[] args) {
		Colorpoint cp = new Colorpoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다.");
	}


	
}

















