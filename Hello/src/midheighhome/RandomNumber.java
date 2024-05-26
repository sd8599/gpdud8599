package midheighhome;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int rNumer;
		
		while (true) {
			rNumer = (int)(Math.random()*10)+1;
			System.out.println(rNumer+" ");
			if (rNumer==7) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}				
		}
	}
}

//Random random = new Random();
//'Random' 클래스의 인스턴스를 생성하는 코드

//	Random random = new Random(); => 랜덤객체생성 필요없음
//위의 방법을 사용할 땐 
//int num = random.nextInt(6)+1; => 0~5 
//=> 1~6까지생성해서 랜덤한 숫자를 리턴한다