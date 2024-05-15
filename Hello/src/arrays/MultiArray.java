package arrays;

import java.util.Iterator;

public class MultiArray {
	public static void main(String[] args) {
		//다차원 배열, (2차원배열), 반복문배열
		//세로크기, 가로크기 10*15에 해당하는 영화관 좌석
		
		String[][] seats = new String[10][15];
		String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
		
		for (int i = 0; i < seats.length; i++) {//세로
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = eng[i]+(j+1);
			}
		}
			//표구매 선택된 좌석 표시
			seats[7][8] = "--";
			seats[7][9] = "---";
		
		//영화관좌석번호확인
		for (int i = 0; i < seats.length; i++) {//세로
			for (int j = 0; j < seats[i].length; j++) {//가로
				System.out.print(seats[i][j]+" ");//A1, A2, A3...
			}System.out.println();
		}
	}
}
