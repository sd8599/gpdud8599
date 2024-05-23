package arrays;
//배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾으세요
public class Arrays5_3 {
	public static void main(String[] args) {
		
		int[] score = {79,88,91,33,100,55,95};
	
		int max = score[0];
		int min = score[0];
		
		//배열의 두번쨰 요소부터 읽기 위해서 변수i의 값을 1로 초기화
		for (int i = 1; i < score.length; i++) {
			if (score[i]>max) {
				max = score[i];
			}else if (score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
}
