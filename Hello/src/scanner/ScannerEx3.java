package scanner;

import java.util.Scanner;

/*음식점 주문
 * 사용자로부터 음식의 이름(foodName),가격(foodPrice), 그리고 수량(foodQuantity)을
 * 입력받아, 주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.
 * 음식의 총 가격을 계산하세요. 총 가격은 각 음식의 가격(foodPrice)과 수량(foodQuantity)을
 * 곱한 값이며, 이를 totalPrice라는 이름의 변수에 저장하세요.
 * 주문 정보와 총 가격을 출력하세요. 출력 형태는 "[음식이름][수량]개를 주문하셨습니다.
 * 총 가격은 [총가격]입니다." 이어야 합니다
 */
public class ScannerEx3 {
		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				
				System.out.print("음식의 이름을 입력해주세요 : ");
				String foodName = sc.next();
				
				System.out.print("음식의 가격을 입력해주세요 : ");
				int foodPrice = sc.nextInt();
				
				System.out.print("음식의 수량을 입력해주세요 : ");
				int foodQuantity = sc.nextInt();
				
				int totalPrice = foodPrice*foodQuantity;
				System.out.print(foodName+" "+foodQuantity+"개 를 주문하셨습니다. 총 가격은 "+totalPrice+"원 입니다.");
		}
}
