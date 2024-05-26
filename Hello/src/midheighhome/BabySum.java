package midheighhome;

public class BabySum {
	public static void main(String[] args) {
		
		int[][] sum = new int[120][5];
		int bb = 0;
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = (i+1)*100+j+1;
//				System.out.print(sum[i][j]+" ");
				bb+=sum[i][j];
			}
		}
		System.out.println("10년간 5개 나라의 총 신생아 수는 "+bb);
	}
}
