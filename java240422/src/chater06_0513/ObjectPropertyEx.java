package chater06_0513;

class Point{
	private int x,y;

	public Point(int x, int y) { //alt shift s
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	//매개변수로 객체를 받는다
	public static void print(Object obj) { //Object obj = new Point(2,3) ->업캐스팅
		
		//실행중인 클래스
	 System.out.println(obj.getClass());	//class chater06_0513.Point
	 
	  //getName() : 클래스 이름
	 System.out.println(obj.getClass().getName()); //chater06_0513.Point
	 System.out.println(obj.hashCode()); //1694819250 : 객체의 서명(10진수 해시코드) 
	 System.out.println(obj.toString()); // chater06_0513.Point@6504e3b2 : 패키지.클래스@16진수 해시코드
	 System.out.println(obj); //toString() 생략(문자열로 변환해서 출력)
	 }
	
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
	}
}
