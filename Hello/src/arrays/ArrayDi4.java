package arrays;

public class ArrayDi4 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int i = 1;//값을 입력
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = i++;
			}
		}
		for (int row = 0; row < arr.length; row++) { //출력
			for (int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column] + " ");
			}
			System.out.println(); //한 행이 끝나면 라인을 변경한다.
		}
}
}
