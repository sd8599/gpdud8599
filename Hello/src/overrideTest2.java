
class Mypoint3  extends Object{
		int x;
		int y;
		
		Mypoint3(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		//object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "x : "+x+", y : "+y;
	}
}

public class overrideTest2 {
	public static void main(String[] args) {
		Mypoint3 p = new Mypoint3(3,5);
//		p.x = 3;
//		p.y = 5;
		System.out.println(p.toString());
		System.out.println(p);
	}
}
