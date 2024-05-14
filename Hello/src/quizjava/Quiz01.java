package quizjava;

import java.util.Scanner;

//조건문을 활용하여 주차요금 정산 프로그램을 작성하시오
//주차요금은 시간당 4000원(일일 최대 요금은 30000원)
//경차또는 장애인 차량은 최종 요금에서 50%할인
//일반차량 5시간 주차시 20000원
//경차 5시간 주차시 10000원
//장애인차량 10시간 주차시 15000원
public class Quiz01 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			int hour = 0; 
			int money =4000;
			
			System.out.print("차량을 입력해주세요>>");
			String car = sc.next();
			System.out.print("시간을 입력해주세요>>");
			hour = sc.nextInt();
			
			int res = money*hour;
		
			if (res>=30000) {
				System.out.println("주차요금은 30000원입니다.");
				}else {	
					if (car.equals("경차")) {
						res = res/2;
						System.out.println("주차요금은 "+res+"원입니다.");
					}if (car.equals("일반차량")) {
						System.out.println("주차요금은 "+res+"원입니다.");
					}if (car.equals("장애인차량")) {
						if (hour==10) {
							System.out.println("주차요금은 15000원 입니다.");
						}else {
							res = res/2;
							System.out.println("주차요금은 "+res+"원입니다.");						
						}
					} 
				}sc.close();
			}
		}



