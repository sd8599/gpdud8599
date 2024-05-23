package question0503;

public class Book2 {
	String title;
	String author;
	
	public Book2(String title, String author) {
		System.out.println("생성자1 호출됨");
		//매개변수를 this 자기자신의 객체 멤버로 저장
		this.title=title;
		this.author=author;
	}
		public Book2(String title) {
			this(title,"작자미상");//첫번째 라인에 안오면 오류 발생
			System.out.println("생성자2 호출됨");			
	}
		public Book2() {
			this("ㄱ","ㄷ");
			System.out.println("생성자3 호출됨");			
		}
		void show() {
			System.out.println(title+" "+author);
		}
		
	public static void main(String[] args) {
//		Book2 littlePrince =  new Book2("어린왕자","생텍쥐베리");
//		Book2 loveStory =  new Book2("춘향전");
		Book2 emptyBook =  new Book2();
//		System.out.println("어린왕자"+" "+"생텍쥐베리");
//		littlePrince.show();
//		loveStory.show();
		emptyBook.show();
		
	}
}

/*
 * 생성자1 호출됨
생성자3 호출됨
ㄱ ㄷ
 */






