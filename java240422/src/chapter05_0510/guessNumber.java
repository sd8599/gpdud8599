package chapter05_0510;

import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int guess;
		int numberToGuess = (int)(Math.random()*10)+1;
		/*Random generator = new Random();
		 * numberToGuess = generator.nextInt(10)+1;
		 */
		
		while (true) {
			System.out.print("추측한 숫자를 입력하세요 : ");
			guess = sc.nextInt();
			
			if (guess==numberToGuess) {
				System.out.println("맞추셨습니다.");
				break;
			}else {
				System.out.println("추측한 숫자가 틀렸습니다.");
			}
			if (guess<numberToGuess) {
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
			if (guess>numberToGuess) {
				System.out.println("추측한 숫자가 너무 큽니다.");
			}
		}sc.close();
		
	}
}
