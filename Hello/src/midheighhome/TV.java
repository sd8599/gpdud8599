package midheighhome;

public class TV {
	
	private String name;
	private int year;
	private int inch;
	
	public TV(String name, int year, int inch) {
//		super();
		this.name = name;
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}

	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();		
	}
}



//클래스정의 - 필드 작성(멤버 변수) - 생성자생성 
//- 메서드생성 : getter => 값 반환
//				  , setter => 값을 설정
//				  , 기타 메서드 => public static void name, 값을 출력하는 메서드
//main 메서드 => 객체생성
//
//*클래스 작성 팁*
//캡슐화 : 필드에 'private' 접근 제어자를 사용하여 외부에서 직접 접근하지 못하게 하고,
//'public' getter/setter 메소드를 제공하여 필드값을 안전하게 접근&변경할 수 있게 한다.
//생성자 : 클래스의 인스턴스를 초기화할 때 필요한 값을 설정할 수 있도록 생성자를 정의한다.
//메서드 : 클래스가 제공하는 기능을 메서드로 정의, 메서드는 객체의 행동을 정의한다.

