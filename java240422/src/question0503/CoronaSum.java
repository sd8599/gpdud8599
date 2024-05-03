package question0503;


public class CoronaSum {
	public static void main(String[] args) {
		
		int sum = 0;
		int score[][] = new int[12][3];
		
		for (int i = 0; i <score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (i+1)*10+1+j;
				sum += score[i][j];
			}
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum);
	}
}
