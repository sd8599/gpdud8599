package javarlch;
/**/
public class Price2 {
	public static void main(String[] args) {
			int donNum = Integer.parseInt(args[0]);
			int kalNum = Integer.parseInt(args[1]);
			int wangNum = Integer.parseInt(args[2]);
	
			int donSum = 8000*donNum;
			int kalSum = 6000*kalNum;
			int wangSum = 5000*wangNum;
			int foodtotal = donSum+kalSum+wangSum;
			
			System.out.printf("%s x %2d = %6d원 \n","돈가스",donNum,donSum);
			System.out.printf("%s x %2d   = %6d원 \n","칼국수",kalNum,kalSum);
			System.out.printf("%s x %2d    = %6d원 \n","왕만두",wangNum,wangSum);
			System.out.println("=================");
			System.out.println("            총합 : "+foodtotal+"원");
			
	}
}
