package chapter05_0510;
/*point 클래스 : (X,Y)한점을 표현
 * point 클래스를 상속받는 ColorPoint클래스(색을 가진 점) 
 */
class Point{
	private int x,y; //멤버변수 4.(1,2)
	public void set(int x,int y) { //메소드 생성 //2.(1,2)
		this.x = x;
		this.y = y; //3.(1,2)
	}
	public void showPoint() { //(1,2)출력
		System.out.println("("+x+","+y+")");
	}
}
//서브클래스(자식)
class ColorPoint extends Point{ //슈퍼클래스 : Point (부모)
	private String color;//4.("red")
	public void setColor(String color) {  //setter 2.("red")
		this.color = color; //3.("red")
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint(); 
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); //객체를 생성, 멤버는 4개, 생성자 호출(기본)
		//1.메소드 호출
		p.set(1, 2);
		p.showPoint();
		
		//객체를 생성, 멤버는 7개, 생성자 호출(기본) : Point(슈퍼)->ColorPoint(서브)
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();
		//1.red값을 가지고 메소드 호출
		cp.setColor("red"); //red 매개변수
		cp.showColorPoint();
	}
}
