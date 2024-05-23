package Java0508;

public class BabySum {
		public static void main(String[] args) {
			
			int sum = 0;
			int score[][] = new int[120][5];
			
			//score.length : 120(i 120 반복)
			for (int i = 0; i < score.length; i++) {
				//score[i].length : 5반복
				for (int j = 0; j < score[i].length; j++) {
					score[i][j] = (i+1)*100+j+1;
					sum += score[i][j]; 
				}	
			}
			System.out.println("10년간 5개 나라의 총 신생아수는 "+sum+"명");
		}
}
 //10년간 5개 나라의 총 신생아수는 3631800명/
