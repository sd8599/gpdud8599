package question0503;

	public class TV {
		String title;
		int year;
		int inch;
	
	public TV(String a,int b,int c) {
		title = a;
		year = b;
		inch = c;
	}
	public void show() {
		System.out.println(title+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
		
	}
}
//중상급1 간단한클래스만들기1(TV)
//1
// 자바클래스를작성하는연습을해보자.
// 다음main() 메소드를 실행하였을 때 예시와같이출력
// public static void main(String [] args) {
// TV myTV = new TV("LG", 2017, 32);
// myTV.show(); 
// }
// LG에서 만든2017년형 32인치 TV