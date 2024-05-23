package chapter03;
//이차원배열
/*
 * 구구단을 배열로 생성
 * 값을 넣어본다
 * ex) 2*7=14, 9*4=36
 */
public class Ex_9 {
	public static void main(String[] args) {
//		int[][]gugudan; //정수타입의 2차원 배열 선언(1차원이 2개이상 가지고 행으로 구성)
		//2차원 배열 선언, 생성(9행 9열)
//		int[][]gugudan = new int[9][9];//index는 0~8까지
		int[][]gugudan = new int[10][10];//index는 0~9까지
		
		// 1*1=1 ~ 9*9=81까지
		for (int i = 1; i <= 9; i++) {//행기준
			for (int j = 1; j <= 9; j++) {//열기준
//				행렬에 1*1 ~ 9*9까지의 값을 2차원 배열원소로 저장
				gugudan[i][j] = i*j; // i : 행 j : 열
			}
		}
		System.out.println("2 X 7 = "+gugudan[2][7]);
		System.out.println("9 X 4 = "+gugudan[9][4]);
	}
}
