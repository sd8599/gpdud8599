package midheighhome;

import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		
		int numberToGuess = (int)(Math.random()*10)+1;
//		System.out.println(numberToGuess);
		Scanner sc = new Scanner(System.in);
		int guess = 0;
		
			while (guess!=numberToGuess) {
				System.out.print("추측한 숫자를 입력하세요 : ");
				guess = sc.nextInt();
				if (guess == numberToGuess) {
					System.out.println("맞추셨습니다.");				
				}else {
					System.out.println("틀렸습니다.");
					if(guess < numberToGuess){
						System.out.println("추측한 숫자가 너무 작습니다.");
					}else if(guess > numberToGuess){
						System.out.println("추측한 숫자가 너무 큽니다.");
						}
					}				
				}
			} 				
		}
