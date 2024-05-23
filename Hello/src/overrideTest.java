
class Mypoint {
		int x;
		int y;
	String getLocation() {
		return "x : "+x+", y : "+y;
	}
}
class Mypoint1 extends Mypoint{
		int z;
		
		String getLocation(){ //조상의 getLocation()을 오버라이딩 
			return "x : "+x+", y : "+y+", z : "+z;}
}


public class overrideTest {
	public static void main(String[] args) {
		Mypoint1 p = new Mypoint1();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());
	}
}
