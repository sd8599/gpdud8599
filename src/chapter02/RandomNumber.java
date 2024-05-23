package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("주사위의 눈 : "+n);
	}
	
//	매개변수가 없는 메소드(주사위의 숫자 구하기 = 1~6)
	public static int rollDie() {
//		random() : 0이상 1미만 난수 발생(실수)
//		Math.random();
//		random() : 0이상 6미만 난수 발생(실수)
		double x = 6 * Math.random();
//		0~5의 난수
		int temp = (int)x;
//		1~6의 난수를 반환
		return temp+1;
	}
}
