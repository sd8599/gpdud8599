package javarlch;

public class List {
	public static void main(String[] args) {
			String a = "한우 꽃등심";
			String b = "참치 선물팩";
			String c= "맥스봉 한팩";
			
			int price1 = 112500;
			int price2 = 25500;
			int price3 = 5000;
			
			//%s : 문자열을 출력
			//%d : 십진수를 출력
			//%f : 실수(double)를 출력
			System.out.printf("품명 : %s   가격 :  %8d원 \n",a,price1);
			System.out.printf("품명 : %s   가격 :  %8d원 \n",b,price2);
			System.out.printf("품명 : %s   가격 :  %-8d원 \n",c,price3);
			
			
//			System.out.println("품명 : "+a+"    가격 : "+price1+"원");
//			System.out.println("품명 : "+b+"    가격 : "+price2+"원");
//			System.out.println("품명 : "+c+"    가격 : "+price3+"원");
	}
}
