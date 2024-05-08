package cond;
/**/
public class Switch2 {
	public static void main(String[] args) {
		
		int grade = 2;
		int coupon;
		
		switch (grade) {
			case 1: 
				coupon=1000;	
				break;
			
			case 2: 
			coupon=2000;	
			break;
			
			case 3: 
			coupon=3000;	
			break;
	
			default:
				coupon=500;
				//break; 마지막엔 안 넣어도 됨 
		}System.out.println("발급받은 쿠폰 "+coupon);
	}
}
