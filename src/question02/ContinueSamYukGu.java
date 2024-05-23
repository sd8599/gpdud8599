package question02;

public class ContinueSamYukGu {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10 ; i++) {
			if (i%3==0) {
				System.out.print("짝 ");
				continue;
			}
				System.out.print(i+" ");
			}
//		for (int i = 1; i <= 10 ; i++) {
//			if (i%3==0) {
//				System.out.print("짝 ");
//			}else {
//				System.out.print(i+" ");
//			}
//		}
		}
	}
//중급B 4 : 1~10까지의 3, 6, 9 (ContinueSamYukGu)
//1부터 10까지의 정수출력중
//3, 6, 9일 때는 박수 소리를출력하는프로그램
//실행결과
//1 2 짝 4 5 짝 7 8 짝 10