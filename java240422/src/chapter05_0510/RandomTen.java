package chapter05_0510;

/*정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의
 * 정수를 랜덤하게 생성하여 배열에 저장하라.
 * 그리고 배열에 든 숫자들과 평균을 출력하라.
 */
public class RandomTen {
	public static void main(String[] args) {
		
		int n[] = new int[10];
		int sum=0;
		
		for (int i = 0; i < n.length; i++) {
			int r =(int)(Math.random()*10)+1;
			n[i] = r; //난수를 배열에 저장
			sum+=n[i]; //배열 원소의 누적합계
		}System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
//		System.out.println();
		System.out.println("\n평균은 "+(double)sum/n.length);
	}
}
