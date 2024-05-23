package stringEx0517;

import java.util.Scanner;

/*정수를몇개저장할지키보드로부터개수를입력받아
(100이하 개수) 정수 배열을 생성하고, 이곳에 1에서
100까지 범위의 정수를랜덤하게삽입하라.
*/
public class RandomArray {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개? >>");
		int number = sc.nextInt();
		int nNumber[] = new int[number];
		
		for (int i = 0; i < nNumber.length; i++) {
			int rNumber = (int)(Math.random()*100+1);//1~100 난수를 발생
			nNumber[i] = rNumber;
			if (i == 0) {//첫번째는 엔터X
				System.out.print(nNumber[i]+" ");				
			} else {
				if (i%10 == 0) { //10번째 마다 엔터
					System.out.println();
					}
				//10번째 아닐때 마다 엔터X
				System.out.print(nNumber[i]+" ");
			}
		}
	}
}







