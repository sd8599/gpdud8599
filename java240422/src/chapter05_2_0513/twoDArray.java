package chapter05_2_0513;

public class twoDArray {
	public static void main(String[] args) {
		
		int[][] arry = new int[4][4];
		
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i].length; j++) {
				arry[i][j] = (int)(Math.random()*10+1);
				System.out.print(arry[i][j]+"\t");
			}
			System.out.println();
		}
}
}