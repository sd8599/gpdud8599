package middlehome;

public class CoronaSum {
	public static void main(String[] args) {
		
		int[][]city = new int[12][3];
		
		for (int i = 0; i < city.length; i++) {
			for (int j = 0; j < city[i].length; j++) {
				city[i][j] = (i+1)*10+j+1;
				System.out.print(city[i][j]+" ");
			}System.out.println();
		}
		int sum = 0;
		for (int i = 0; i < city.length; i++) {
			for (int j = 0; j < city[i].length; j++) {
				sum += city[i][j];
			}
		}System.out.println("1년 전체 코로나 환자수는 "+sum);
	}
}
