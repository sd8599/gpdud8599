package arrays;

public class ArrayDi0 {
		public static void main(String[] args) {
			//2*3 2차원 배열을 만든다.
			int[][] arr = new int[2][3]; //행(row)2, 열(column)3
			
			arr[0][0] = 1; //0행, 0열
			arr[0][1] = 2; //0행, 1열
			arr[0][2] = 3; //0행, 2열
			arr[1][0] = 4; //1행, 0열
			arr[1][1] = 5; //1행, 1열
			arr[1][2] = 6; //1행, 2열
			
			//0행 출력
			System.out.print(arr[0][0]+"  "); //0행, 0열
			System.out.print(arr[0][1]+"  "); //0행, 1열
			System.out.print(arr[0][2]+"  "); //0행, 2열
			
			System.out.println(); //한 행이 끝나면 라인을 변경

			//1행 출력
			System.out.print(arr[1][0]+"  "); //1행, 0열
			System.out.print(arr[1][1]+"  "); //1행, 1열
			System.out.print(arr[1][2]+"  "); //1행, 2열
		}
}
