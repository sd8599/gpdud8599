package javarlch;

public class Price {
	public static void main(String[] args) {
		
		String menu1 = "돈가스";
		String menu2 = "칼국수";
		String menu3 = "왕만두";
		
		int price1 = 8000*16;
		int price2 = 6000*8;
		int price3 = 5000*1;
		int allprice = price1+price2+price3;
		
		System.out.printf("%s x16 = %2d원 \n",menu1,price1);
		System.out.printf("%s x8   = %2d원 \n",menu2,price2);
		System.out.printf("%s x1   = %2d원 \n",menu3,price3);
		System.out.println("===========================");
		System.out.printf("총합 : %d원 \n",allprice);
	}
}
