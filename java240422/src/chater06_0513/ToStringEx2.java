package chater06_0513;

class Point2{
	private int x,y;

	public Point2(int x, int y) { //alt shift s
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point2("+x+","+y+")";
	}
}

public class ToStringEx2 {
	public static void main(String[] args) {
		Point2 p = new Point2(2, 3);
		System.out.println(p); //chater06_0513.Point2@75a1cd57 : 패키지.클래스, 16진수 해시코드
		System.out.println(p.toString()); //chater06_0513.Point2@75a1cd57 : 패키지.클래스, 16진수 해시코드
		System.out.println(p.toString()+"입니다."); //chater06_0513.Point2@75a1cd57 : 패키지.클래스, 16진수 해시코드
	}
}
