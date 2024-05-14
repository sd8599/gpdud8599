//return : 반환한다는 것/ 바꿔쓸 수 있다는 것
//메서드 실행문을 메서드의 반환값으로 치환
public class Method2 {
	public static void main(String[] args) {
		 
		int int1 = add(2,3);
		System.out.println(int1); //5 출력
		
		System.out.println(add(4,5)); //9 출력
		
		int int2 = add(add(6,7), add(8,9));//13,17
		System.out.println(int2); // 30 출력
		
		System.out.println("---------");
		
		if (checkIfContain("Hello World", "Hello")) {
			System.out.println("포함 됨");
		}else {
			System.out.println("포함 안 됨");
		}
		System.out.println(//메소드, 삼항연산자사용
				checkIfContain("Hello World", "World2")? "포함됨" : "포함 안 됨");
	}
	static int add(int num1, int num2) { //int가 와서 정수를 반환함
		return num1+num2; //반환,return이없으면 반환안됨
	}
	static boolean checkIfContain(String text, String token) {
		return text.toLowerCase().contains(token.toLowerCase());
	}
}
