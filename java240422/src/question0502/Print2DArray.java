package question0502;

public class Print2DArray {
	public static void main(String[] args) {
		
		//열의 크기가 각각 달라서 비정방형 배열 
		int score[][]= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		//socore.length : 5(행의 크기) =>중괄호 안에 중괄호 갯수
		for (int i = 0; i < score.length; i++) {
			//socore[0].length=1;
			//socore[1].length=3;
			//socore[2].length=1;
			//socore[3].length=4;
			//socore[4].length=2;
			for (int j = 0; j < score[i].length; j++) {
				//score[i][j] : 2차원 배열원소
			System.out.print(score[i][j]+"");
			}
			System.out.println();
		}
	}
}

//중급C5 : 2차원 배열 (Print2DArray)
//1
// 다음2차원배열n을출력하는프로그램을작성하라.
// int n [][] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
// *.출력
// 1
// 1 2 3
// 1
// 1 2 3 4
// 1 2