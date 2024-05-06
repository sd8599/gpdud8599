package cond;
//온라인 쇼핑몰의 할인 시스템을 개발해야 한다. 한 사용자가 어떤 상품을 구매할 때,
//다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다. 
//아이템 가격이 10000원 이상일 때, 1000원 할인
//나이가 10살 이하일 때 1000원 할인
public class If5 {
		public static void main(String[] args) {
			int price = 10000;
			int age = 10;
			int discount = 0;
			
			if (price>=10000) {
				discount = discount+1000;
				System.out.println("10000원 이상 구매, 1000원 할인");
			}
			if(age<=10) {
				discount = discount+1000;
				System.out.println("어린이, 1000원 할인");
			}
			System.out.println("총 할인 금액 : "+discount+"원");
	}	
}
